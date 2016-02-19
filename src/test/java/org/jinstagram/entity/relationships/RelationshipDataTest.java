package org.jinstagram.entity.relationships;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RelationshipDataTest</code> contains tests for the class <code>{@link RelationshipData}</code>.
 */
public class RelationshipDataTest {
	/**
	 * Run the String getIncomingStatus() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetIncomingStatus_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);

		String result = fixture.getIncomingStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getOutgoingStatus() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetOutgoingStatus_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);

		String result = fixture.getOutgoingStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isTargetUserPrivate() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testIsTargetUserPrivate_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);

		boolean result = fixture.isTargetUserPrivate();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isTargetUserPrivate() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testIsTargetUserPrivate_2()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(false);

		boolean result = fixture.isTargetUserPrivate();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setIncomingStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetIncomingStatus_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);
		String incomingStatus = "";

		fixture.setIncomingStatus(incomingStatus);

		// add additional test code here
	}

	/**
	 * Run the void setOutgoingStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetOutgoingStatus_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);
		String outgoingStatus = "";

		fixture.setOutgoingStatus(outgoingStatus);

		// add additional test code here
	}

	/**
	 * Run the void setTargetUserPrivate(boolean) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetTargetUserPrivate_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);
		boolean targetUserPrivate = true;

		fixture.setTargetUserPrivate(targetUserPrivate);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testToString_1()
		throws Exception {
		RelationshipData fixture = new RelationshipData();
		fixture.setIncomingStatus("");
		fixture.setOutgoingStatus("");
		fixture.setTargetUserPrivate(true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("RelationshipData [incomingStatus=, outgoingStatus=]", result);
	}

}