package org.jinstagram.realtime;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubscriptionTypeTest</code> contains tests for the class
 * <code>{@link SubscriptionType}</code>.
 * 
 */
public class SubscriptionTypeTest {
	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testToString_1() throws Exception {
		SubscriptionType fixture = SubscriptionType.GEOGRAPHIES;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("geography", result);
	}

}