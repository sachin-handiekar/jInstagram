package org.jinstagram.entity.locations;

import java.util.LinkedList;
import java.util.List;
import org.jinstagram.entity.common.Location;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocationSearchFeedTest</code> contains tests for the class <code>{@link LocationSearchFeed}</code>.
 *
 * @generatedBy CodePro at 31/01/16 15:05
 * @author SachinHandiekar
 * @version $Revision: 1.0 $
 */
public class LocationSearchFeedTest {
	/**
	 * Run the List<Location> getLocationList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testGetLocationList_1()
		throws Exception {
		LocationSearchFeed fixture = new LocationSearchFeed();
		fixture.setLocationList(new LinkedList());

		List<Location> result = fixture.getLocationList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setLocationList(List<Location>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testSetLocationList_1()
		throws Exception {
		LocationSearchFeed fixture = new LocationSearchFeed();
		fixture.setLocationList(new LinkedList());
		List<Location> locationList = new LinkedList();

		fixture.setLocationList(locationList);

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
		LocationSearchFeed fixture = new LocationSearchFeed();
		fixture.setLocationList(new LinkedList());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("LocationSearchFeed [locationList=[]]", result);
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
		new org.junit.runner.JUnitCore().run(LocationSearchFeedTest.class);
	}
}