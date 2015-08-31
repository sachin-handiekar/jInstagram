package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MetaTest</code> contains tests for the class <code>{@link Meta}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class MetaTest {
	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetCode_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getErrorMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetErrorMessage_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");

		String result = fixture.getErrorMessage();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getErrorType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetErrorType_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");

		String result = fixture.getErrorType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetCode_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");
		int code = 1;

		fixture.setCode(code);

		// add additional test code here
	}

	/**
	 * Run the void setErrorMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetErrorMessage_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");
		String errorMessage = "";

		fixture.setErrorMessage(errorMessage);

		// add additional test code here
	}

	/**
	 * Run the void setErrorType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetErrorType_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");
		String errorType = "";

		fixture.setErrorType(errorType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Meta [code=1, errorMessage=, errorType=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MetaTest.class);
	}
}