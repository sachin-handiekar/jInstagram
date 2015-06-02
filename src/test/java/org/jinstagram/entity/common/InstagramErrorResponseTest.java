package org.jinstagram.entity.common;

import org.jinstagram.exceptions.InstagramBadRequestException;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.exceptions.InstagramRateLimitException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.gson.Gson;

public class InstagramErrorResponseTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    private Gson GSON_PARSER = new Gson();

    private static final String RATE_LIMIT_JSON = "{" +
            "\"code\": 429, \"error_type\": \"OAuthRateLimitException\", " +
            "\"error_message\": \"You have exceeded the maximum number of requests per hour. You have performed " +
            "a total of 10672 requests in the last hour. Our general maximum request limit is set at 5000 " +
            "requests per hour.\"}";

    private static final String OAUTH_EXCEPTION_JSON = "{\n" +
            "    \"meta\": {\n" +
            "        \"error_type\": \"OAuthException\",\n" +
            "        \"code\": 400,\n" +
            "        \"error_message\": \"...\"\n" +
            "    }\n" +
            "}";

    private static final String INVALID_JSON = "{ foo : 420 }";


    @Test
    public void rateLimitException() throws InstagramException {
        InstagramErrorResponse response = InstagramErrorResponse.parse(GSON_PARSER, RATE_LIMIT_JSON);

        thrown.expect(InstagramRateLimitException.class);
        thrown.expectMessage("OAuthRateLimitException");
        response.throwException();
    }

    @Test
    public void oauthException() throws InstagramException {
        InstagramErrorResponse response = InstagramErrorResponse.parse(GSON_PARSER, OAUTH_EXCEPTION_JSON);

        thrown.expect(InstagramBadRequestException.class);
        thrown.expectMessage("OAuthException");
        response.throwException();
    }

    @Test
    public void invalidJson() throws InstagramException {
        InstagramErrorResponse response = InstagramErrorResponse.parse(GSON_PARSER, INVALID_JSON);

        thrown.expect(InstagramException.class);
        thrown.expectMessage("No metadata found in response");
        response.throwException();
    }

}
