package org.jinstagram.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jinstagram.auth.model.OAuthConfig;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.http.Verbs;
import org.junit.Test;

/**
 * The class <code>InstagramApiTest</code> contains tests for the class
 * <code>{@link InstagramApi}</code>.
 * 
 */
public class InstagramApiTest {
	/**
	 * Run the InstagramService createService(OAuthConfig) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testCreateService_1() throws Exception {
		InstagramApi fixture = new InstagramApi();
		OAuthConfig config = new OAuthConfig("", "");

		InstagramService result = fixture.createService(config);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.getVersion());
	}

	/**
	 * Run the String getAccessTokenEndpoint() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetAccessTokenEndpoint_1() throws Exception {
		InstagramApi fixture = new InstagramApi();

		String result = fixture.getAccessTokenEndpoint();

		// add additional test code here
		assertEquals("https://api.instagram.com/oauth/access_token", result);
	}

	/**
	 * Run the AccessTokenExtractor getAccessTokenExtractor() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetAccessTokenExtractor_1() throws Exception {
		InstagramApi fixture = new InstagramApi();

		AccessTokenExtractor result = fixture.getAccessTokenExtractor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Verbs getAccessTokenVerb() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetAccessTokenVerb_1() throws Exception {
		InstagramApi fixture = new InstagramApi();

		Verbs result = fixture.getAccessTokenVerb();

		// add additional test code here
		assertNotNull(result);
		assertEquals("POST", result.name());
		assertEquals("POST", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getAuthorizationUrl(OAuthConfig) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAuthorizationUrl_1() throws Exception {
		InstagramApi fixture = new InstagramApi();
		OAuthConfig config = new OAuthConfig("", "", "", "", "");

		String result = fixture.getAuthorizationUrl(config);

		assertNotNull(result);
	}

	/**
	 * Run the String getAuthorizationUrl(OAuthConfig) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAuthorizationUrl_2() throws Exception {
		InstagramApi fixture = new InstagramApi();
		OAuthConfig config = new OAuthConfig("", "", "", "", "");

		String result = fixture.getAuthorizationUrl(config);
		assertNotNull(result);
	}

}