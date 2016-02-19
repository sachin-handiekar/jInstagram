package org.jinstagram.http;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HttpStatusTest</code> contains tests for the class <code>{@link HttpStatus}</code>.
 */
public class HttpStatusTest {
	/**
	 * Run the String getReasonPhrase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:08
	 */
	@Test
	public void testGetReasonPhrase_1()
		throws Exception {
		HttpStatus fixture = HttpStatus.ACCEPTED;

		String result = fixture.getReasonPhrase();

		// add additional test code here
		assertEquals("Accepted", result);
	}

	/**
	 * Run the int value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:08
	 */
	@Test
	public void testValue_1()
		throws Exception {
		HttpStatus fixture = HttpStatus.ACCEPTED;

		int result = fixture.value();

		// add additional test code here
		assertEquals(202, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/01/16 15:08
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
	 * @generatedBy CodePro at 31/01/16 15:08
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
	 * @generatedBy CodePro at 31/01/16 15:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HttpStatusTest.class);
	}
}