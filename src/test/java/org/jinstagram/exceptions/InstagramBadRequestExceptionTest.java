package org.jinstagram.exceptions;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.google.gson.internal.StringMap;

/**
 * The class <code>InstagramBadRequestExceptionTest</code> contains tests for the class <code>{@link InstagramBadRequestException}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:48
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class InstagramBadRequestExceptionTest {
	/**
	 * Run the InstagramBadRequestException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	@Test
	public void testInstagramBadRequestException_1()
		throws Exception {
		String message = "";

		InstagramBadRequestException result = new InstagramBadRequestException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals(null, result.getCause());
		assertEquals("org.jinstagram.exceptions.InstagramBadRequestException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramBadRequestException(String,Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	@Test
	public void testInstagramBadRequestException_2()
		throws Exception {
		String message = "";
		Exception e = new Exception();

		InstagramBadRequestException result = new InstagramBadRequestException(message, e);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals("org.jinstagram.exceptions.InstagramBadRequestException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramBadRequestException(String,Map<String,String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	@Test
	public void testInstagramBadRequestException_3()
		throws Exception {
		String message = "";
		Map<String, String> responseHeaders = new StringMap();

		InstagramBadRequestException result = new InstagramBadRequestException(message, responseHeaders);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals(null, result.getCause());
		assertEquals("org.jinstagram.exceptions.InstagramBadRequestException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the InstagramBadRequestException(String,Exception,Map<String,String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	@Test
	public void testInstagramBadRequestException_4()
		throws Exception {
		String message = "";
		Exception e = new Exception();
		Map<String, String> responseHeaders = new StringMap();

		InstagramBadRequestException result = new InstagramBadRequestException(message, e, responseHeaders);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getAPILimitStatus());
		assertEquals(-1, result.getRemainingLimitStatus());
		assertEquals("org.jinstagram.exceptions.InstagramBadRequestException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}
}