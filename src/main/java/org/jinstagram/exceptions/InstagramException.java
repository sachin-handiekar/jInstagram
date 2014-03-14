package org.jinstagram.exceptions;

import java.io.IOException;
import java.util.Map;

import org.jinstagram.InstagramResponse;
import org.jinstagram.http.APILimitUtils;

public class InstagramException extends IOException implements InstagramResponse {
	private static final long serialVersionUID = 942488788539151888L;

	private final Map<String, String> headers;
	/**
	 * No-exception constructor. Used when there is no original exception
	 * 
	 * @param message message explaining what went wrong
	 */
	public InstagramException(String message) {
		super(message, null);
		this.headers = null;
	}
	
	/**
     * No-exception constructor with response headers. 
     * Used when there is no original exception
     * 
     * @param message message explaining what went wrong
     * @param responseHeaders the headers obtained from Instagram http response
     */
    public InstagramException(String message, Map<String, String> responseHeaders) {
        super(message, null);
        this.headers = responseHeaders;
    }


	/**
	 * Default constructor
	 * 
	 * @param message message explaining what went wrong
	 * @param e original exception
	 */
    public InstagramException(String message, Exception e) {
        super(message, e);
        this.headers = null;
    }

    /**
     * Constructor with response headers
     * @param message message explaining what went wrong
     * @param e original exception
     * @param responseHeaders the headers obtained from Instagram http response
     */
    public InstagramException(String message, Exception e,
            Map<String, String> responseHeaders) {
        super(message, e);
        this.headers = responseHeaders;
    }

    @Override
    public int getAPILimitStatus() {
        if (headers == null) {
            return -1;
        } else {
            return APILimitUtils.getAPILimitStatus(this.headers);
        }
    }

    @Override
    public int getRemainingLimitStatus() {
        if (headers == null) {
            return -1;
        } else {
           return APILimitUtils.getRemainingLimitStatus(this.headers); 
        }
    }
	
}
