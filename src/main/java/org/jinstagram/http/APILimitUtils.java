package org.jinstagram.http;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper class to process the HTTP headers from a Response object 
 * and get the available and remaining API limit status
 * 
 * @author Arinto Murdopo
 */
public final class APILimitUtils {

    private static final Logger logger = LoggerFactory.getLogger(APILimitUtils.class);

    protected static final String LIMIT_HEADER_KEY = "X-Ratelimit-Limit";

    protected static final String REMAINING_HEADER_KEY = "X-Ratelimit-Remaining";

    private APILimitUtils() {}

    /**
     * Get the available API limit. It correspond to the value of 
     * X-Ratelimit-Limit key in HTTP response headers. For Instagram 
     * v1 API, this method should return 5000.
     * @param headers HTTP headers from a Response object
     * @return Available API limit. -1 if response header is invalid or does not contains the API 
     * limit information
     */
    public static int getAPILimitStatus(Map<String, String> headers) {
        return APILimitUtils.getIntegerValue(headers, LIMIT_HEADER_KEY);
    }

    /**
     * Get the remaining API limit. It correspond to the value of 
     * X-Ratelimit-Remaining key in HTTP response headers.
     * @param headers HTTP headers from a Response object
     * @return Remaining API limit. -1 if response header is invalid or does not contains the remaining 
     * limit information
     */
    public static int getRemainingLimitStatus(Map<String, String> headers) {
        return APILimitUtils.getIntegerValue(headers, REMAINING_HEADER_KEY);
    }

    private static int getIntegerValue(Map<String, String> header, String key) {
        String intValueStr = header.get(key);
        if (intValueStr == null) {
            intValueStr = header.get(key.toLowerCase());
        }
        int value = -1;

        try {
            value = Integer.valueOf(intValueStr);
        } catch (NumberFormatException e) {
            logger.error("Invalid Integer value for key: " + key + ", value :" + intValueStr);
        }
        return value;
    }

}
