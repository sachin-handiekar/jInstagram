package org.jinstagram;

/**
 * Interface to represent information in Instagram response header
 * 
 * @author Arinto Murdopo
 * @since 1.0.10
 */
public interface InstagramResponse {

    /**
     * Get the available API limit. It correspond to the value of 
     * X-Ratelimit-Limit key in HTTP response headers. For Instagram 
     * v1 API, this method should return 5000.
     * @return Available API limit. -1 if headers invalid.
     */
    int getAPILimitStatus();

    /**
     * Get the remaining API limit. It correspond to the value of 
     * X-Ratelimit-Remaining key in HTTP response headers.
     * @return Remaining API limit. -1 if headers invalid.
     */
    int getRemainingLimitStatus();
}
