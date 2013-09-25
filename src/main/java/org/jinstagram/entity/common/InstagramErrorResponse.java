package org.jinstagram.entity.common;

import org.jinstagram.exceptions.InstagramBadRequestException;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.exceptions.InstagramRateLimitException;

import com.google.gson.annotations.SerializedName;

public class InstagramErrorResponse {

    @SerializedName("meta")
    private Meta errorMeta;

    public void throwException() throws InstagramException {
        String joinedMessage = errorMeta.getErrorType() + ": " + errorMeta.getErrorMessage();
        switch (errorMeta.getCode()) {
        case 400:
            throw new InstagramBadRequestException(joinedMessage);
        case 420:
            throw new InstagramRateLimitException(joinedMessage);
        }

        throw new InstagramException(joinedMessage);
    }
}
