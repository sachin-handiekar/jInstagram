package org.jinstagram.auth;

import org.jinstagram.auth.exceptions.OAuthException;
import org.jinstagram.auth.model.Constants;
import org.jinstagram.auth.model.OAuthConfig;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.http.Verbs;
import org.jinstagram.utils.Preconditions;

import static org.jinstagram.http.URLUtils.formURLEncode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
					formURLEncode(config.getCallback()), formURLEncode(config.getScope()));
		}
		else {
			return String.format(Constants.AUTHORIZE_URL, config.getApiKey(), formURLEncode(config.getCallback()));
		}
	}

	public AccessTokenExtractor getAccessTokenExtractor() {
		return new AccessTokenExtractor() {
			private Pattern accessTokenPattern = Pattern.compile(Constants.ACCESS_TOKEN_EXTRACTOR_REGEX);

			@Override
			public Token extract(String response) {
				Preconditions.checkEmptyString(response, "Cannot extract a token from a null or empty String");

				Matcher matcher = accessTokenPattern.matcher(response);

				if (matcher.find()) {
					return new Token(matcher.group(1), "", response);
				}
				else {
					throw new OAuthException("Cannot extract an acces token. Response was: " + response);
				}
			}
		};
	}

	public InstagramService createService(OAuthConfig config) {
		return new InstagramService(this, config);
	}
}
