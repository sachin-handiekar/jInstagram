package org.jinstagram.entity.relationships;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jinstagram.entity.common.Meta;
import org.junit.Test;

/**
 * The class <code>RelationshipFeedTest</code> contains tests for the class
 * <code>{@link RelationshipFeed}</code>.
 *
 */
public class RelationshipFeedTest {
	/**
	 * Run the RelationshipData getData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetData_1() throws Exception {
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());

		RelationshipData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals("RelationshipData [incomingStatus=null, outgoingStatus=null]", result.toString());
		assertEquals(null, result.getOutgoingStatus());
		assertEquals(false, result.isTargetUserPrivate());
		assertEquals(null, result.getIncomingStatus());
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
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setData(RelationshipData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetData_1() throws Exception {
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());
		RelationshipData data = new RelationshipData();

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
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testToString_1() throws Exception {
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"RelationshipFeed [data=RelationshipData [incomingStatus=null, outgoingStatus=null], meta=Meta [code=0, errorMessage=null, errorType=null]]",
				result);
	}

}