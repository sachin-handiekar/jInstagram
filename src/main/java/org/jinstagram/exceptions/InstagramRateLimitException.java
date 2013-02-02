package org.jinstagram.exceptions;

public class InstagramRateLimitException extends InstagramException {
	private static final long serialVersionUID = 1L;

	/**
	 * No-exception constructor. Used when there is no original exception
	 *
	 * @param message message explaining what went wrong
	 */
	public InstagramRateLimitException(String message) {
		super(message, null);
	}

	/**
	 * Default constructor
	 *
	 * @param message message explaining what went wrong
	 * @param e original exception
	 */
	public InstagramRateLimitException(String message, Exception e) {
		super(message, e);
	}
}
