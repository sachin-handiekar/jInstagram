package org.jinstagram.entity.common;

import java.util.Map;

import org.jinstagram.exceptions.InstagramBadRequestException;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.exceptions.InstagramRateLimitException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * A class to represents an error response from Instagram API
 * @author Sachin Handiekar
 *
 */
public class InstagramErrorResponse {

    private Meta errorMeta;

    private Map<String, String> headers;

    InstagramErrorResponse(Meta errorMeta) {
        this.errorMeta = errorMeta;
    }

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
        if (errorMeta != null) {
            String msg = errorMeta.getErrorType() + ": " + errorMeta.getErrorMessage();
            switch (errorMeta.getCode()) {
                case 400:
                    throw new InstagramBadRequestException(msg, this.headers);
                case 429:
                    throw new InstagramRateLimitException(msg, this.headers);
            }

            throw new InstagramException(msg, this.headers);
        } else {
            throw new InstagramException("No metadata found in response", this.headers);
        }
    }

    /**
     * Parse the specified json holding a response object. Instagram has two ways of
     * specifying an error: either a meta attribute is set or the body of the
     * response is a meta object itself.
     * @param gson the gson instance to use
     * @param json the json response content
     * @return the InstagramErrorResponse object
     */
    public static InstagramErrorResponse parse(Gson gson, String json) {
        JsonElement jsonElement = gson.fromJson(json, JsonElement.class);
        JsonElement metaMember = jsonElement.getAsJsonObject().get("meta");
        final Meta meta;
        if (metaMember != null) {
            meta = gson.fromJson(metaMember, Meta.class);
        } else {
            meta = gson.fromJson(jsonElement, Meta.class);
        }

        // Validate meta
        if (meta.getCode() != 0 && meta.getErrorType() != null) {
            return new InstagramErrorResponse(meta);
        } else {
            return new InstagramErrorResponse(null);
        }
    }
}
