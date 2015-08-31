package org.jinstagram.auth.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The class <code>OAuthExceptionTest</code> contains tests for the class
 * <code>{@link OAuthException}</code>.
 *
 * @author Sachin Handiekar
 */
public class OAuthExceptionTest {
    /**
     * Run the OAuthException(String) constructor test.
     *
     * @throws Exception if any error occurs
     */
    @Test
    public void testOAuthExceptionWithMessage() throws Exception {
        String message = "customMessage";

        OAuthException oauthException = new OAuthException(message);

        // add additional test code here
        assertNotNull(oauthException);
        assertEquals(null, oauthException.getCause());
        assertEquals("org.jinstagram.auth.exceptions.OAuthException: " + message, oauthException.toString());
        assertEquals(message, oauthException.getLocalizedMessage());
        assertEquals(message, oauthException.getMessage());
    }

    /**
     * Run the OAuthException(String,Exception) constructor test.
     *
     * @throws Exception
     */
    @Test
    public void testOAuthExceptionWithMessageAndException() throws Exception {
        String customErrorMessage = "customError";
        Exception customException = new Exception();

        OAuthException oauthException = new OAuthException(customErrorMessage, customException);

        // add additional test code here
        assertNotNull(oauthException);
        assertEquals("org.jinstagram.auth.exceptions.OAuthException: " + customErrorMessage, oauthException.toString());
        assertEquals(customErrorMessage, oauthException.getLocalizedMessage());
        assertEquals(customErrorMessage, oauthException.getMessage());
    }

}