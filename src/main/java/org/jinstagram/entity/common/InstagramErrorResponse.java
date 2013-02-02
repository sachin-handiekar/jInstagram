package org.jinstagram.entity.common;

import org.jinstagram.exceptions.InstagramBadRequestException;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.exceptions.InstagramRateLimitException;

import com.google.gson.annotations.SerializedName;

public class InstagramErrorResponse {

    private int code;

    @SerializedName("error_type")
    private String errorType;

    @SerializedName("error_message")
    private String errorMessage;

    public void throwException() throws InstagramException {
        String joinedMessage = errorType + ": " + errorMessage;
        switch (code) {
        case 400:
            throw new InstagramBadRequestException(joinedMessage);
        case 420:
            throw new InstagramRateLimitException(joinedMessage);
        }

        throw new InstagramException(joinedMessage);
    }
}
