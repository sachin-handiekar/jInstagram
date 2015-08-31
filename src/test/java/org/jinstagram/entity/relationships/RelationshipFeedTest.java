package org.jinstagram.entity.relationships;

import org.jinstagram.entity.common.Meta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RelationshipFeedTest</code> contains tests for the class <code>{@link RelationshipFeed}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class RelationshipFeedTest {
	/**
	 * Run the RelationshipData getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetData_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetMeta_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetData_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetMeta_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testToString_1()
		throws Exception {
		RelationshipFeed fixture = new RelationshipFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new RelationshipData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("RelationshipFeed [data=RelationshipData [incomingStatus=null, outgoingStatus=null], meta=Meta [code=0, errorMessage=null, errorType=null]]", result);
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
		new org.junit.runner.JUnitCore().run(RelationshipFeedTest.class);
	}
}