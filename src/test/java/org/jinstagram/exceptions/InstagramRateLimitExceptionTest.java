package org.jinstagram.exceptions;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.google.gson.internal.StringMap;

/**
 * The class <code>InstagramRateLimitExceptionTest</code> contains tests for the
 * class <code>{@link InstagramRateLimitException}</code>.
 *
 */
public class InstagramRateLimitExceptionTest {
	/**
	 * Run the InstagramRateLimitException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramRateLimitException_1() throws Exception {
		String message = "";

		InstagramRateLimitException result = new InstagramRateLimitException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals(null, result.getCause());
		assertEquals("org.jinstagram.exceptions.InstagramRateLimitException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramRateLimitException(String,Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramRateLimitException_2() throws Exception {
		String message = "";
		Exception e = new Exception();

		InstagramRateLimitException result = new InstagramRateLimitException(message, e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals("org.jinstagram.exceptions.InstagramRateLimitException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramRateLimitException(String,Map<String,String>)
	 * constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramRateLimitException_3() throws Exception {
		String message = "";
		Map<String, String> responseHeaders = new StringMap();

		InstagramRateLimitException result = new InstagramRateLimitException(message, responseHeaders);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals(null, result.getCause());
		assertEquals("org.jinstagram.exceptions.InstagramRateLimitException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramRateLimitException(String,Exception,Map<String,String>)
	 * constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramRateLimitException_4() throws Exception {
		String message = "";
		Exception e = new Exception();
		Map<String, String> responseHeaders = new StringMap();

		InstagramRateLimitException result = new InstagramRateLimitException(message, e, responseHeaders);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals("org.jinstagram.exceptions.InstagramRateLimitException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

}