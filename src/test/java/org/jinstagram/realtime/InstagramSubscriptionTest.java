package org.jinstagram.realtime;

import org.jinstagram.InstagramConfig;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InstagramSubscriptionTest</code> contains tests for the class
 * <code>{@link InstagramSubscription}</code>.
 */
public class InstagramSubscriptionTest {
	/**
	 * Run the InstagramSubscription() constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testInstagramSubscription() throws Exception {

		InstagramSubscription result = new InstagramSubscription();

		// add additional test code here
		assertNotNull(result);
		assertEquals("InstagramSubscription [callback_url=oob]", result.toString());
	}

	/**
	 * Run the InstagramSubscription aspect(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAspect() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String aspect = "";

		InstagramSubscription result = fixture.aspect(aspect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'aspect' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.aspect(InstagramSubscription.java:120)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription callback(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCallback() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String callback = "";

		InstagramSubscription result = fixture.callback(callback);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid Callback Url
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.utils.Preconditions.checkValidUrl(Preconditions.java:58)
		// at
		// org.jinstagram.realtime.InstagramSubscription.callback(InstagramSubscription.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription clientId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testClientId() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String clientId = "";

		InstagramSubscription result = fixture.clientId(clientId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'clientId' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.clientId(InstagramSubscription.java:55)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription clientSecret(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testClientSecret() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String clientSecret = "";

		InstagramSubscription result = fixture.clientSecret(clientSecret);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'clientSecret' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.clientSecret(InstagramSubscription.java:68)
		assertNotNull(result);
	}

	/**
	 * Run the SubscriptionResponse createSubscription() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSubscription() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		SubscriptionResponse result = fixture.createSubscription();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: You must provide a clientId key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.prepareOAuthRequest(InstagramSubscription.java:259)
		// at
		// org.jinstagram.realtime.InstagramSubscription.createSubscription(InstagramSubscription.java:192)
		assertNotNull(result);
	}

	/**
	 * Run the SubscriptionResponse createSubscription() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSubscription_2() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		SubscriptionResponse result = fixture.createSubscription();
	}

	/**
	 * Run the SubscriptionResponse deleteAllSubscription() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteAllSubscription() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		SubscriptionResponse result = fixture.deleteAllSubscription();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: You must provide a clientId key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.prepareOAuthRequest(InstagramSubscription.java:259)
		// at
		// org.jinstagram.realtime.InstagramSubscription.deleteAllSubscription(InstagramSubscription.java:230)
		assertNotNull(result);
	}

	/**
	 * Run the SubscriptionResponse deleteSubscription(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteSubscription() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String id = "";

		SubscriptionResponse result = fixture.deleteSubscription(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: You must provide a clientId key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.prepareOAuthRequest(InstagramSubscription.java:259)
		// at
		// org.jinstagram.realtime.InstagramSubscription.deleteSubscription(InstagramSubscription.java:213)
		assertNotNull(result);
	}

	/**
	 * Run the SubscriptionsListResponse getSubscriptionList() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetSubscriptionList() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		SubscriptionsListResponse result = fixture.getSubscriptionList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: You must provide a clientId key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.prepareOAuthRequest(InstagramSubscription.java:259)
		// at
		// org.jinstagram.realtime.InstagramSubscription.getSubscriptionList(InstagramSubscription.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription latitute(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testLatitute() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String latitude = "";

		InstagramSubscription result = fixture.latitute(latitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'lat' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.utils.Preconditions.checkValidLatLong(Preconditions.java:84)
		// at
		// org.jinstagram.realtime.InstagramSubscription.latitute(InstagramSubscription.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription longitude(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testLongitude() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String longitude = "";

		InstagramSubscription result = fixture.longitude(longitude);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'lng' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.utils.Preconditions.checkValidLatLong(Preconditions.java:84)
		// at
		// org.jinstagram.realtime.InstagramSubscription.longitude(InstagramSubscription.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription object(SubscriptionType) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testObject() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		SubscriptionType type = SubscriptionType.GEOGRAPHIES;

		InstagramSubscription result = fixture.object(type);

		// add additional test code here
		assertNotNull(result);
		assertEquals("InstagramSubscription [callback_url=oob,object=geography]", result.toString());
	}

	/**
	 * Run the InstagramSubscription objectId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testObjectId() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String objectId = "";

		InstagramSubscription result = fixture.objectId(objectId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("InstagramSubscription [callback_url=oob,object_id=]", result.toString());
	}

	/**
	 * Run the InstagramSubscription radius(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testRadius() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String radius = "";

		InstagramSubscription result = fixture.radius(radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'radius' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.utils.Preconditions.checkValidRadius(Preconditions.java:96)
		// at
		// org.jinstagram.realtime.InstagramSubscription.radius(InstagramSubscription.java:159)
		assertNotNull(result);
	}

	/**
	 * Run the InstagramSubscription requestConfiguration(InstagramConfig)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testRequestConfiguration() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		InstagramConfig config = new InstagramConfig();

		InstagramSubscription result = fixture.requestConfiguration(config);

		// add additional test code here
		assertNotNull(result);
		assertEquals("InstagramSubscription [callback_url=oob]", result.toString());
	}

	/**
	 * Run the InstagramSubscription requestConfiguration(InstagramConfig)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testRequestConfiguration_2() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		InstagramConfig config = null;

		InstagramSubscription result = fixture.requestConfiguration(config);

		// add additional test code here
		assertNotNull(result);
		assertEquals("InstagramSubscription [callback_url=oob]", result.toString());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testToString() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("InstagramSubscription [callback_url=oob]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testToString_2() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("InstagramSubscription [callback_url=oob]", result);
	}

	/**
	 * Run the InstagramSubscription verifyToken(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVerifyToken() throws Exception {
		InstagramSubscription fixture = new InstagramSubscription();
		String verifyToken = "";

		InstagramSubscription result = fixture.verifyToken(verifyToken);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: Invalid 'verifyToken' key
		// at org.jinstagram.utils.Preconditions.check(Preconditions.java:116)
		// at
		// org.jinstagram.utils.Preconditions.checkEmptyString(Preconditions.java:48)
		// at
		// org.jinstagram.realtime.InstagramSubscription.verifyToken(InstagramSubscription.java:106)
		assertNotNull(result);
	}

}