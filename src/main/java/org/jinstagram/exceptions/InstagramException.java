package org.jinstagram.exceptions;

public class InstagramException extends Exception {
	private static final long serialVersionUID = 942488788539151888L;

	/**
	 * No-exception constructor. Used when there is no original exception
	 * 
	 * @param message message explaining what went wrong
	 */
	public InstagramException(String message) {
		super(message, null);
	}

	/**
	 * Default constructor
	 * 
	 * @param message message explaining what went wrong
	 * @param e original exception
	 */
	public InstagramException(String message, Exception e) {
		super(message, e);
	}
}
