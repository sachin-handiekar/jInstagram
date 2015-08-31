package org.jinstagram.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RelationshipTest</code> contains tests for the class <code>{@link Relationship}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:48
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class RelationshipTest {
	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Relationship fixture = Relationship.APPROVE;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("approve", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:48
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
	 * @generatedBy CodePro at 31/08/15 16:48
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
	 * @generatedBy CodePro at 31/08/15 16:48
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RelationshipTest.class);
	}
}