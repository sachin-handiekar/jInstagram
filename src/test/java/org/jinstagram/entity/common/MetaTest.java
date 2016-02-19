package org.jinstagram.entity.common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The class <code>MetaTest</code> contains tests for the class
 * <code>{@link Meta}</code>.
 *
 */
public class MetaTest {
	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCode() throws Exception {
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
	 * 
	 */
	@Test
	public void testGetErrorMessage() throws Exception {
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
	 * 
	 */
	@Test
	public void testGetErrorType() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetCode() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetErrorMessage() throws Exception {
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
	 */
	@Test
	public void testSetErrorType() throws Exception {
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
	 */
	@Test
	public void testToString() throws Exception {
		Meta fixture = new Meta();
		fixture.setErrorType("");
		fixture.setCode(1);
		fixture.setErrorMessage("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Meta [code=1, errorMessage=, errorType=]", result);
	}

}