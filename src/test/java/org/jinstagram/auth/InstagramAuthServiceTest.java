package org.jinstagram.auth;

import static org.junit.Assert.assertNotNull;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.jinstagram.auth.oauth.InstagramService;
import org.junit.Test;

/**
 * The class <code>InstagramAuthServiceTest</code> contains tests for the class
 * <code>{@link InstagramAuthService}</code>.
 * 
 */
public class InstagramAuthServiceTest {
	/**
	 * Run the InstagramAuthService() constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramAuthService() throws Exception {

		InstagramAuthService result = new InstagramAuthService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService apiKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testApiKey() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		String apiKey = "";

		InstagramAuthService result = fixture.apiKey(apiKey);
		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService apiSecret(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testApiSecret() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		String apiSecret = "";

		InstagramAuthService result = fixture.apiSecret(apiSecret);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid Api secret
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.auth.InstagramAuthService.apiSecret(InstagramAuthService.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramService build() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testBuild() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");

		InstagramService result = fixture.build();

		assertNotNull(result);
	}

	/**
	 * Run the InstagramService build() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testBuild_2() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy((Proxy) null);
		fixture.apiKey("");
		fixture.display("");

		InstagramService result = fixture.build();
		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService callback(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCallback() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		String callback = "";

		InstagramAuthService result = fixture.callback(callback);
		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService display(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDisplay() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		String display = "";

		InstagramAuthService result = fixture.display(display);

		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService proxy(Proxy) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testProxy() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		Proxy requestProxy = new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1));

		InstagramAuthService result = fixture.proxy(requestProxy);

		assertNotNull(result);
	}

	/**
	 * Run the InstagramAuthService scope(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testScope() throws Exception {
		InstagramAuthService fixture = new InstagramAuthService();
		fixture.apiSecret("");
		fixture.callback("");
		fixture.scope("");
		fixture.proxy(new Proxy(java.net.Proxy.Type.DIRECT, new InetSocketAddress(1)));
		fixture.apiKey("");
		fixture.display("");
		String scope = "";

		InstagramAuthService result = fixture.scope(scope);

		assertNotNull(result);
	}

}