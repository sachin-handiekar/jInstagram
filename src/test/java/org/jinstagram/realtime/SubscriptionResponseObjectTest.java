package org.jinstagram.realtime;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubscriptionResponseObjectTest</code> contains tests for the
 * class <code>{@link SubscriptionResponseObject}</code>.
 */
public class SubscriptionResponseObjectTest {
	/**
	 * Run the String getChangedAspect() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetChangedAspect() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");

		String result = fixture.getChangedAspect();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the long getEpochTime() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetEpochTime() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");

		long result = fixture.getEpochTime();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the String getObject() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetObject() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");

		String result = fixture.getObject();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getObjectId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetObjectId() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");

		String result = fixture.getObjectId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSubscriptionId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetSubscriptionId() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");

		String result = fixture.getSubscriptionId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setChangedAspect(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetChangedAspect() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");
		String changedAspect = "";

		fixture.setChangedAspect(changedAspect);

		// add additional test code here
	}

	/**
	 * Run the void setEpochTime(long) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetEpochTime() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");
		long epochTime = 1L;

		fixture.setEpochTime(epochTime);

		// add additional test code here
	}

	/**
	 * Run the void setObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetObject() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");
		String object = "";

		fixture.setObject(object);

		// add additional test code here
	}

	/**
	 * Run the void setObjectId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetObjectId() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");
		String objectId = "";

		fixture.setObjectId(objectId);

		// add additional test code here
	}

	/**
	 * Run the void setSubscriptionId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetSubscriptionId() throws Exception {
		SubscriptionResponseObject fixture = new SubscriptionResponseObject();
		fixture.setObjectId("");
		fixture.setEpochTime(1L);
		fixture.setChangedAspect("");
		fixture.setObject("");
		fixture.setSubscriptionId("");
		String subscriptionId = "";

		fixture.setSubscriptionId(subscriptionId);

		// add additional test code here
	}

}