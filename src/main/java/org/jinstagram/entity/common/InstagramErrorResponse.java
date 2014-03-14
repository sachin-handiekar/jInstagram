package org.jinstagram.entity.common;

import java.util.Map;

import org.jinstagram.exceptions.InstagramBadRequestException;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.exceptions.InstagramRateLimitException;

import com.google.gson.annotations.SerializedName;

public class InstagramErrorResponse {
    
    private Map<String, String> headers;
    
    @SerializedName("meta")
    private Meta errorMeta;

    /**
     * Setter for headers field
     * @param responseHeaders the response headers
     */
    public void setHeaders(Map<String, String> responseHeaders) {
        this.headers = responseHeaders;
    }
    
    /**
     * Throw instagram exception to the client
     * @throws InstagramException
     */
    public void throwException() throws InstagramException {
        String joinedMessage = errorMeta.getErrorType() + ": " + errorMeta.getErrorMessage();
        switch (errorMeta.getCode()) {
        case 400:
            throw new InstagramBadRequestException(joinedMessage, this.headers);
        case 420:
            throw new InstagramRateLimitException(joinedMessage, this.headers);
        }

        throw new InstagramException(joinedMessage, this.headers);
    }
}
