package org.jinstagram.auth;

import static org.jinstagram.http.URLUtils.formURLEncode;

import org.apache.commons.lang3.StringUtils;
import org.jinstagram.auth.exceptions.OAuthException;
import org.jinstagram.auth.model.Constants;
import org.jinstagram.auth.model.OAuthConfig;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.http.Verbs;
import org.jinstagram.utils.Preconditions;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class InstagramApi {
	public String getAccessTokenEndpoint() {
		return Constants.ACCESS_TOKEN_ENDPOINT;
	}

	public Verbs getAccessTokenVerb() {
		return Verbs.POST;
	}

	public String getAuthorizationUrl(OAuthConfig config) {
		Preconditions.checkValidUrl(config.getCallback(),
				"Must provide a valid url as callback. Instagram does not support OOB");

		// Append scope if present
		if (config.hasScope()) {
			return String.format(Constants.SCOPED_AUTHORIZE_URL, config.getApiKey(),
					formURLEncode(config.getCallback()), config.getScope());
		} else {
			return String.format(Constants.AUTHORIZE_URL, config.getApiKey(), formURLEncode(config.getCallback()));
		}
	}

	public AccessTokenExtractor getAccessTokenExtractor() {
		return new AccessTokenExtractor() {
			@Override
			public Token extract(String response) {
				Preconditions.checkEmptyString(response, "Cannot extract a token from a null or empty String");

				try {
					JsonParser parser = new JsonParser();
					JsonObject obj = parser.parse(response).getAsJsonObject();
					String token = null;

					if(obj.has("access_token")) {
						token = obj.get("access_token").getAsString();
					}

					if(StringUtils.isEmpty(token)) {
						throw new OAuthException("Cannot extract an access token. Response was: " + response);
					}
					return new Token(token, "", response);
				} catch(JsonParseException e) {
					throw new OAuthException("Cannot extract an access token. Response was: " + response);
				}
			}
		};
	}

	public InstagramService createService(OAuthConfig config) {
		return new InstagramService(this, config);
	}
}
