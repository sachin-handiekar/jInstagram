package org.jinstagram.realtime;

import org.jinstagram.entity.common.Meta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubscriptionResponseTest</code> contains tests for the class
 * <code>{@link SubscriptionResponse}</code>.
 * 
 */
public class SubscriptionResponseTest {
	/**
	 * Run the SubscriptionResponseData getData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetData_1() throws Exception {
		SubscriptionResponse fixture = new SubscriptionResponse();
		fixture.setMeta(new Meta());
		fixture.setData(new SubscriptionResponseData());

		SubscriptionResponseData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObjectId());
		assertEquals(null, result.getObject());
		assertEquals(null, result.getId());
		assertEquals(null, result.getType());
		assertEquals(null, result.getAspect());
		assertEquals(null, result.getCallbackUrl());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
		SubscriptionResponse fixture = new SubscriptionResponse();
		fixture.setMeta(new Meta());
		fixture.setData(new SubscriptionResponseData());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getErrorMessage());
		assertEquals(0, result.getCode());
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setData(SubscriptionResponseData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetData_1() throws Exception {
		SubscriptionResponse fixture = new SubscriptionResponse();
		fixture.setMeta(new Meta());
		fixture.setData(new SubscriptionResponseData());
		SubscriptionResponseData data = new SubscriptionResponseData();

		fixture.setData(data);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(Meta) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMeta_1() throws Exception {
		SubscriptionResponse fixture = new SubscriptionResponse();
		fixture.setMeta(new Meta());
		fixture.setData(new SubscriptionResponseData());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

}