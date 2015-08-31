package org.jinstagram.auth.exceptions;

import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.http.Verbs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The class <code>OAuthParametersMissingExceptionTest</code> contains tests for the class <code>{@link OAuthParametersMissingException}</code>.
 */
public class OAuthParametersMissingExceptionTest {
    /**
     * Run the OAuthParametersMissingException(OAuthRequest) constructor test.
     *
     * @throws Exception
     */
    @Test
    public void testOAuthParametersMissingException_1()
            throws Exception {
        OAuthRequest request = new OAuthRequest(Verbs.DELETE, "");

        OAuthParametersMissingException result = new OAuthParametersMissingException(request);

        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("org.jinstagram.auth.exceptions.OAuthParametersMissingException: Could not find oauth parameters in request: @OAuthRequest(DELETE, ). OAuth parameters must be specified with the addOAuthParameter() method", result.toString());
        assertEquals("Could not find oauth parameters in request: @OAuthRequest(DELETE, ). OAuth parameters must be specified with the addOAuthParameter() method", result.getLocalizedMessage());
        assertEquals("Could not find oauth parameters in request: @OAuthRequest(DELETE, ). OAuth parameters must be specified with the addOAuthParameter() method", result.getMessage());
    }
}