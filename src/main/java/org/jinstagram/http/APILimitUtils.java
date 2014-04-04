package org.jinstagram.http;

import java.util.Map;

/**
 * Helper class to process the HTTP headers from a Response object 
 * and get the available and remaining API limit status
 * @author Arinto Murdopo
 *
 */
public final class APILimitUtils {
	
	protected static final String LIMIT_HEADER_KEY = "X-Ratelimit-Limit";
	protected static final String REMAINING_HEADER_KEY = "X-Ratelimit-Remaining";
	
	/**
	 * Get the available API limit. It correspond to the value of 
	 * X-Ratelimit-Limit key in HTTP response headers. For Instagram 
	 * v1 API, this method should return 5000.
	 * @param headers HTTP headers from a Response object
	 * @return Available API limit. -1 if response header is invalid or does not contains the API 
     * limit information
	 */
	public static int getAPILimitStatus(Map<String, String> headers){
		return APILimitUtils.getIntegerValue(headers, LIMIT_HEADER_KEY);
	}
	
	/**
	 * Get the remaining API limit. It correspond to the value of 
	 * X-Ratelimit-Remaining key in HTTP response headers.
	 * @param headers HTTP headers from a Response object
	 * @return Remaining API limit. -1 if response header is invalid or does not contains the remaining 
	 * limit information
	 */
	public static int getRemainingLimitStatus(Map<String, String> headers){
		return APILimitUtils.getIntegerValue(headers, REMAINING_HEADER_KEY);
	}
	
	private static int getIntegerValue(Map<String, String> header, String key){
		String intValueStr = header.get(key);
		int value = -1;
		
		try {
			value = Integer.valueOf(intValueStr);
		} catch (NumberFormatException e) {
			System.err.printf("Invalid Integer value for key: %s, value %s%n", key, intValueStr);
		}
		return value;
	}
	

}
