package org.jinstagram.auth.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

/**
 * The class <code>OAuthConfigTest</code> contains tests for the class
 * <code>{@link OAuthConfig}</code>.
 *
 */
public class OAuthConfigTest {

	private static final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("0.0.0.0", 8080));

	/**
	 * Run the OAuthConfig(String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testOAuthConfig_1() throws Exception {
		String key = "key";
		String secret = "secret";

		OAuthConfig result = new OAuthConfig(key, secret);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getScope());
		assertEquals(null, result.getDisplay());
		assertEquals("oob", result.getCallback());
		assertEquals("secret", result.getApiSecret());
		assertEquals("key", result.getApiKey());
		assertEquals(false, result.hasScope());
	}

	/**
	 * Run the OAuthConfig(String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testOAuthConfig_2() throws Exception {
		String key = "";
		String secret = "";
		String callback = "";
		String scope = "";

		OAuthConfig result = new OAuthConfig(key, secret, callback, scope);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getScope());
		assertEquals(null, result.getDisplay());
		assertEquals("", result.getCallback());
		assertEquals("", result.getApiSecret());
		assertEquals("", result.getApiKey());
		assertEquals(true, result.hasScope());
	}

	/**
	 * Run the OAuthConfig(String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testOAuthConfig_3() throws Exception {
		String key = "";
		String secret = "";
		String callback = null;
		String scope = "";
		String display = "";

		OAuthConfig result = new OAuthConfig(key, secret, callback, scope, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getScope());
		assertEquals("", result.getDisplay());
		assertEquals("oob", result.getCallback());
		assertEquals("", result.getApiSecret());
		assertEquals("", result.getApiKey());
		assertEquals(true, result.hasScope());
	}

	/**
	 * Run the OAuthConfig(String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testOAuthConfig_4() throws Exception {
		String key = "";
		String secret = "";
		String callback = "";
		String scope = "";
		String display = "";

		OAuthConfig result = new OAuthConfig(key, secret, callback, scope, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getScope());
		assertEquals("", result.getDisplay());
		assertEquals("", result.getCallback());
		assertEquals("", result.getApiSecret());
		assertEquals("", result.getApiKey());
		assertEquals(true, result.hasScope());
	}

	/**
	 * Run the String getApiKey() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetApiKey_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		String result = fixture.getApiKey();

		assertNotNull(result);
	}

	/**
	 * Run the String getApiSecret() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetApiSecret_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		String result = fixture.getApiSecret();

		assertNotNull(result);
	}

	/**
	 * Run the String getCallback() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetCallback_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		String result = fixture.getCallback();

		assertNotNull(result);
	}

	/**
	 * Run the String getDisplay() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetDisplay_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		String result = fixture.getDisplay();
		assertNotNull(result);
	}

	/**
	 * Run the String getScope() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetScope_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		String result = fixture.getScope();

		assertNotNull(result);
	}

	/**
	 * Run the boolean hasScope() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testHasScope_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");
		fixture.setRequestProxy(proxy);

		boolean result = fixture.hasScope();

		assertTrue(result);
	}

	/**
	 * Run the void setRequestProxy(Proxy) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testSetRequestProxy_1() throws Exception {
		OAuthConfig fixture = new OAuthConfig("key", "secret", "callback", "scope", "display");

		fixture.setRequestProxy(proxy);

	}

}