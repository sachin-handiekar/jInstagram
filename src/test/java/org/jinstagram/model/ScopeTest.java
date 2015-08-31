package org.jinstagram.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ScopeTest</code> contains tests for the class <code>{@link Scope}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:48
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class ScopeTest {
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
		Scope fixture = Scope.BASIC;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("basic", result);
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
		new org.junit.runner.JUnitCore().run(ScopeTest.class);
	}
}