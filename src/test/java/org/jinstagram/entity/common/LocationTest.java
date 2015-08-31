package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocationTest</code> contains tests for the class <code>{@link Location}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class LocationTest {
	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
	 * @generatedBy CodePro at 31/08/15 16:40
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
		new org.junit.runner.JUnitCore().run(LocationTest.class);
	}
}