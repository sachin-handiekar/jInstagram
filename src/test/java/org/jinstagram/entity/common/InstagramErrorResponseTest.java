package org.jinstagram.entity.common;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.internal.StringMap;

/**
 * The class <code>InstagramErrorResponseTest</code> contains tests for the
 * class <code>{@link InstagramErrorResponse}</code>.
 */
@Ignore
public class InstagramErrorResponseTest {
	/**
	 * Run the InstagramErrorResponse(Meta) constructor test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testInstagramErrorResponse() throws Exception {
		Meta errorMeta = new Meta();

		InstagramErrorResponse result = new InstagramErrorResponse(errorMeta);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testParse() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testParse_2() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testParse_3() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testParse_4() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testParse_5() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramErrorResponse parse(Gson,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testParse_6() throws Exception {
		Gson gson = new Gson();
		String json = "";

		InstagramErrorResponse result = InstagramErrorResponse.parse(gson, json);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at
		// org.jinstagram.entity.common.InstagramErrorResponse.parse(InstagramErrorResponse.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the void setHeaders(Map<String,String>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetHeaders() throws Exception {
		InstagramErrorResponse instagramErrorResponse = new InstagramErrorResponse(new Meta());
		instagramErrorResponse.setHeaders(new StringMap());
		Map<String, String> responseHeaders = new StringMap();

		instagramErrorResponse.setHeaders(responseHeaders);

		// add additional test code here
	}

	/**
	 * Run the void throwException() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test(expected = org.jinstagram.exceptions.InstagramException.class)
	public void testThrowException() throws Exception {
		InstagramErrorResponse instagramErrorResponse = new InstagramErrorResponse(new Meta());
		instagramErrorResponse.setHeaders(new StringMap());

		instagramErrorResponse.throwException();

		// add additional test code here
	}

	/**
	 * Run the void throwException() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test(expected = org.jinstagram.exceptions.InstagramException.class)
	public void testThrowException_2() throws Exception {
		InstagramErrorResponse instagramErrorResponse = new InstagramErrorResponse(new Meta());
		instagramErrorResponse.setHeaders(new StringMap());

		instagramErrorResponse.throwException();

		// add additional test code here
	}

	/**
	 * Run the void throwException() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test(expected = org.jinstagram.exceptions.InstagramException.class)
	public void testThrowException_3() throws Exception {
		InstagramErrorResponse instagramErrorResponse = new InstagramErrorResponse(new Meta());
		instagramErrorResponse.setHeaders(new StringMap());

		instagramErrorResponse.throwException();

		// add additional test code here
	}

	/**
	 * Run the void throwException() method test.
	 *
	 * @throws Exception
	 */
	@Test(expected = org.jinstagram.exceptions.InstagramException.class)
	public void testThrowException_4() throws Exception {
		InstagramErrorResponse instagramErrorResponse = new InstagramErrorResponse((Meta) null);
		instagramErrorResponse.setHeaders(new StringMap());

		instagramErrorResponse.throwException();

		// add additional test code here
	}

}