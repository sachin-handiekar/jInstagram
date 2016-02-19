package org.jinstagram.realtime;

import java.util.LinkedList;
import java.util.List;
import org.jinstagram.entity.common.Meta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubscriptionsListResponseTest</code> contains tests for the
 * class <code>{@link SubscriptionsListResponse}</code>.
 * 
 */
public class SubscriptionsListResponseTest {
	/**
	 * Run the List<SubscriptionResponseData> getData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetData_1() throws Exception {
		SubscriptionsListResponse fixture = new SubscriptionsListResponse();
		fixture.setData(new LinkedList());
		fixture.setMeta(new Meta());

		List<SubscriptionResponseData> result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		SubscriptionsListResponse fixture = new SubscriptionsListResponse();
		fixture.setData(new LinkedList());
		fixture.setMeta(new Meta());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getErrorMessage());
		assertEquals(0, result.getCode());
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setData(List<SubscriptionResponseData>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetData_1() throws Exception {
		SubscriptionsListResponse fixture = new SubscriptionsListResponse();
		fixture.setData(new LinkedList());
		fixture.setMeta(new Meta());
		List<SubscriptionResponseData> data = new LinkedList();

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
		SubscriptionsListResponse fixture = new SubscriptionsListResponse();
		fixture.setData(new LinkedList());
		fixture.setMeta(new Meta());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

}