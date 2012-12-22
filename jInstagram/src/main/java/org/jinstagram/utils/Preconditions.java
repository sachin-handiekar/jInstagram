package org.jinstagram.utils;

import org.jinstagram.auth.model.OAuthConstants;

import java.util.regex.Pattern;

/**
 * Utils for checking preconditions and invariants
 */
public class Preconditions {
	private static final String DEFAULT_MESSAGE = "Received an invalid parameter";

	private static final Pattern URL_PATTERN = Pattern.compile("[a-zA-Z_-]+://\\S+");

	/**
	 * Checks that an object is not null.
	 * 
	 * @param object any object
	 * @param errorMsg error message
	 * 
	 * @throws IllegalArgumentException if the object is null
	 */
	public static void checkNotNull(Object object, String errorMsg) {
		check(object != null, errorMsg);
	}

	/**
	 * Checks that a string is not null or empty
	 * 
	 * @param string any string
	 * @param errorMsg error message
	 * 
	 * @throws IllegalArgumentException if the string is null or empty
	 */
	public static void checkEmptyString(String string, String errorMsg) {
		check((string != null) && !string.trim().equals(""), errorMsg);
	}

	/**
	 * Checks that a URL is valid
	 * 
	 * @param url any string
	 * @param errorMsg error message
	 */
	public static void checkValidUrl(String url, String errorMsg) {
		checkEmptyString(url, errorMsg);
		check(isUrl(url), errorMsg);
	}

	/**
	 * Checks that a URL is a valid OAuth callback
	 * 
	 * @param url any string
	 * @param errorMsg error message
	 */
	public static void checkValidOAuthCallback(String url, String errorMsg) {
		checkEmptyString(url, errorMsg);

		if (url.toLowerCase().compareToIgnoreCase(OAuthConstants.OUT_OF_BAND) != 0) {
			check(isUrl(url), errorMsg);
		}
	}

	private static boolean isUrl(String url) {
		return URL_PATTERN.matcher(url).matches();
	}

	private static void check(boolean requirements, String error) {
		String message = ((error == null) || (error.trim().length() <= 0)) ? DEFAULT_MESSAGE
				: error;

		if (!requirements) {
			throw new IllegalArgumentException(message);
		}
	}
}
