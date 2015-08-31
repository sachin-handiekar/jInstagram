package org.jinstagram.exceptions;

import com.google.gson.internal.StringMap;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The class <code>InstagramExceptionTest</code> contains tests for the class <code>{@link InstagramException}</code>.
 *
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 31/08/15 16:48
 */
public class InstagramExceptionTest {
    /**
     * Run the InstagramException(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testInstagramException_1()
            throws Exception {
        String message = "";

        InstagramException result = new InstagramException(message);

        // add additional test code here
        assertNotNull(result);
        assertEquals(-1, result.getAPILimitStatus());
        assertEquals(-1, result.getRemainingLimitStatus());
        assertEquals(null, result.getCause());
        assertEquals("org.jinstagram.exceptions.InstagramException: ", result.toString());
        assertEquals("", result.getLocalizedMessage());
        assertEquals("", result.getMessage());
    }

    /**
     * Run the InstagramException(String,Exception) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testInstagramException_2()
            throws Exception {
        String message = "";
        Exception e = new Exception();

        InstagramException result = new InstagramException(message, e);

        // add additional test code here
        assertNotNull(result);
        assertEquals(-1, result.getAPILimitStatus());
        assertEquals(-1, result.getRemainingLimitStatus());
        assertEquals("org.jinstagram.exceptions.InstagramException: ", result.toString());
        assertEquals("", result.getLocalizedMessage());
        assertEquals("", result.getMessage());
    }

    /**
     * Run the InstagramException(String,Map<String,String>) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testInstagramException_3()
            throws Exception {
        String message = "";
        Map<String, String> responseHeaders = new StringMap();

        InstagramException result = new InstagramException(message, responseHeaders);

        // add additional test code here
        assertNotNull(result);
        assertEquals(-1, result.getAPILimitStatus());
        assertEquals(-1, result.getRemainingLimitStatus());
        assertEquals(null, result.getCause());
        assertEquals("org.jinstagram.exceptions.InstagramException: ", result.toString());
        assertEquals("", result.getLocalizedMessage());
        assertEquals("", result.getMessage());
    }

    /**
     * Run the InstagramException(String,Exception,Map<String,String>) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testInstagramException_4()
            throws Exception {
        String message = "";
        Exception e = new Exception();
        Map<String, String> responseHeaders = new StringMap();

        InstagramException result = new InstagramException(message, e, responseHeaders);

        // add additional test code here
        assertNotNull(result);
        assertEquals(-1, result.getAPILimitStatus());
        assertEquals(-1, result.getRemainingLimitStatus());
        assertEquals("org.jinstagram.exceptions.InstagramException: ", result.toString());
        assertEquals("", result.getLocalizedMessage());
        assertEquals("", result.getMessage());
    }

    /**
     * Run the int getAPILimitStatus() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testGetAPILimitStatus_1()
            throws Exception {
        InstagramException fixture = new InstagramException("", new Exception(), (Map<String, String>) null);

        int result = fixture.getAPILimitStatus();

        // add additional test code here
        assertEquals(-1, result);
    }

    /**
     * Run the int getRemainingLimitStatus() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:48
     */
    @Test
    public void testGetRemainingLimitStatus_1()
            throws Exception {
        InstagramException fixture = new InstagramException("", new Exception(), (Map<String, String>) null);

        int result = fixture.getRemainingLimitStatus();

        // add additional test code here
        assertEquals(-1, result);
    }


}