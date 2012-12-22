package org.jinstagram.auth.exceptions;

import org.jinstagram.auth.model.OAuthRequest;

/**
 * Specialized exception that represents a missing OAuth parameter.
 */
public class OAuthParametersMissingException extends OAuthException {
    private static final String MSG =
        "Could not find oauth parameters in request: %s. "
        + "OAuth parameters must be specified with the addOAuthParameter() method";
    
    private static final long serialVersionUID = 1745308760111976671L;

    /**
     * Default constructor.
     *
     * @param request
     *            OAuthRequest that caused the error
     */
    public OAuthParametersMissingException(OAuthRequest request) {
        super(String.format(MSG, request));
    }
}
