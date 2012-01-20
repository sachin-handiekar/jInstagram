package org.jinstagram.auth.oauth;

import org.jinstagram.auth.InstagramApi;
import org.jinstagram.auth.model.OAuthConfig;
import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.model.Verifier;
import org.jinstagram.http.Response;

public class InstagramService {
	private static final String VERSION = "1.0";

	private final InstagramApi api;

	private final OAuthConfig config;

	/**
	 * Default constructor
	 * 
	 * @param api OAuth2.0 api information
	 * @param config OAuth 2.0 configuration param object
	 */
	public InstagramService(InstagramApi api, OAuthConfig config) {
		this.api = api;
		this.config = config;
	}

	/**
	 * {@inheritDoc}
	 */
	public Token getAccessToken(Token requestToken, Verifier verifier) {
		OAuthRequest request = new OAuthRequest(api.getAccessTokenVerb(),
				api.getAccessTokenEndpoint());

		// Add the oauth parameter in the body
		request.addBodyParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
		request.addBodyParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
		request.addBodyParameter("grant_type", "authorization_code");
		request.addBodyParameter(OAuthConstants.CODE, verifier.getValue());
		request.addBodyParameter(OAuthConstants.REDIRECT_URI, config.getCallback());

		if (config.hasScope()) {
			request.addBodyParameter(OAuthConstants.SCOPE, config.getScope());
		}

		if (config.getDisplay() != null) {
			request.addBodyParameter(OAuthConstants.DISPLAY, config.getDisplay());
		}

		Response response = request.send();

		return api.getAccessTokenExtractor().extract(response.getBody());
	}

	/**
	 * {@inheritDoc}
	 */
	public Token getRequestToken() {
		throw new UnsupportedOperationException(
				"Unsupported operation, please use 'getAuthorizationUrl' and redirect your users there");
	}

	/**
	 * {@inheritDoc}
	 */
	public String getVersion() {
		return VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	public void signRequest(Token accessToken, OAuthRequest request) {
		request.addQuerystringParameter(OAuthConstants.ACCESS_TOKEN,
				accessToken.getToken());
	}

	/**
	 * {@inheritDoc}
	 */
	public String getAuthorizationUrl(Token requestToken) {
		return api.getAuthorizationUrl(config);
	}
}
