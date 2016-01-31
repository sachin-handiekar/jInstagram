package org.jinstagram.auth.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TokenTest</code> contains tests for the class
 * <code>{@link Token}</code>.
 */
public class TokenTest {
	/**
	 * Run the Token(String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testToken() throws Exception {
		String token = "";
		String secret = "";

		Token result = new Token(token, secret);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Token[ , ]", result.toString());
		assertEquals("", result.getToken());
		assertEquals("", result.getSecret());
	}

	/**
	 * Run the Token(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testToken_2() throws Exception {
		String token = "";
		String secret = "";
		String rawResponse = "";

		Token result = new Token(token, secret, rawResponse);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getRawResponse());
		assertEquals("Token[ , ]", result.toString());
		assertEquals("", result.getToken());
		assertEquals("", result.getSecret());
	}

	/**
	 * Run the String getRawResponse() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRawResponse() throws Exception {
		Token fixture = new Token("", "", (String) null);

		String result = fixture.getRawResponse();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSecret() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetSecret() throws Exception {
		Token fixture = new Token("", "", "");

		String result = fixture.getSecret();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getToken() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetToken() throws Exception {
		Token fixture = new Token("", "", "");

		String result = fixture.getToken();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testToString() throws Exception {
		Token fixture = new Token("", "", "");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Token[ , ]", result);
	}

}