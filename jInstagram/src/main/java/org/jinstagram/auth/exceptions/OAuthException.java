package org.jinstagram.auth.exceptions;

/**
 * Represents a problem in the OAuth signing process
 */
public class OAuthException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * No-exception constructor. Used when there is no original exception
     *
     * @param message message explaining what went wrong
     */
    public OAuthException(String message) {
        super(message, null);
    }

    /**
     * Default constructor
     * @param message message explaining what went wrong
     * @param e original exception
     */
    public OAuthException(String message, Exception e) {
        super(message, e);
    }
}
