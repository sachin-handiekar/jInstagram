package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocationTest</code> contains tests for the class <code>{@link Location}</code>.
 */
public class LocationTest {
	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the double getLatitude() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetLatitude_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);

		double result = fixture.getLatitude();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getLongitude() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetLongitude_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);

		double result = fixture.getLongitude();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setLatitude(double) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetLatitude_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);
		double latitude = 1.0;

		fixture.setLatitude(latitude);

		// add additional test code here
	}

	/**
	 * Run the void setLongitude(double) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetLongitude_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);
		double longitude = 1.0;

		fixture.setLongitude(longitude);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Location fixture = new Location();
		fixture.setId("");
		fixture.setName("");
		fixture.setLatitude(1.0);
		fixture.setLongitude(1.0);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Location [id=, name=, latitude=1.0, longitude=1.0]", result);
	}

 
}