package org.jinstagram.auth;

import org.jinstagram.auth.model.Token;

/**
 * Simple command object that extracts a {@link Token} from a String
 */
public interface AccessTokenExtractor {

	/**
	 * Extracts the access token from the contents of an Http Response
	 * 
	 * @param response the contents of the response
	 * @return OAuth access token
	 */
	public Token extract(String response);
}
