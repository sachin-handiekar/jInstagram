package org.jinstagram.entity.relationships;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RelationshipDataTest</code> contains tests for the class <code>{@link RelationshipData}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class RelationshipDataTest {
	/**
	 * Run the String getIncomingStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RelationshipDataTest.class);
	}
}