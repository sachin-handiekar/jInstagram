package org.jinstagram.auth.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>VerifierTest</code> contains tests for the class
 * <code>{@link Verifier}</code>.
 * 
 */
public class VerifierTest {
	/**
	 * Run the Verifier(String) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testVerifier() throws Exception {
		String value = "verifierCode";

		Verifier result = new Verifier(value);

		assertNotNull(result);
		assertEquals("verifierCode", result.getValue());
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetValue() throws Exception {
		Verifier fixture = new Verifier("verifierCode");

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("verifierCode", result);
	}

}