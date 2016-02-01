package org.jinstagram.realtime;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>ConstantsTest</code> contains tests for the class
 * <code>{@link Constants}</code>.
 */
public class ConstantsTest {
	/**
	 * Run the Constants() constructor test.
	 *
	 * 
	 */
	@Test
	public void testConstants_1() throws Exception {
		Constants result = new Constants();
		assertNotNull(result);
	}

}