package org.jinstagram.entity.locations;

import org.jinstagram.entity.common.Location;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocationInfoTest</code> contains tests for the class <code>{@link LocationInfo}</code>.
 *
 * @generatedBy CodePro at 31/01/16 15:05
 * @author SachinHandiekar
 * @version $Revision: 1.0 $
 */
public class LocationInfoTest {
	/**
	 * Run the Location getLocationData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testGetLocationData_1()
		throws Exception {
		LocationInfo fixture = new LocationInfo();
		fixture.setLocationData(new Location());

		Location result = fixture.getLocationData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getLatitude(), 1.0);
		assertEquals(0.0, result.getLongitude(), 1.0);
		assertEquals("Location [id=null, name=null, latitude=0.0, longitude=0.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the void setLocationData(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testSetLocationData_1()
		throws Exception {
		LocationInfo fixture = new LocationInfo();
		fixture.setLocationData(new Location());
		Location locationData = new Location();

		fixture.setLocationData(locationData);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testToString_1()
		throws Exception {
		LocationInfo fixture = new LocationInfo();
		fixture.setLocationData(new Location());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("LocationInfo [locationData=Location [id=null, name=null, latitude=0.0, longitude=0.0]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
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
	 * @generatedBy CodePro at 31/01/16 15:05
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
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LocationInfoTest.class);
	}
}