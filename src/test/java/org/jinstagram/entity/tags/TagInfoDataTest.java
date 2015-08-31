package org.jinstagram.entity.tags;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TagInfoDataTest</code> contains tests for the class <code>{@link TagInfoData}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class TagInfoDataTest {
	/**
	 * Run the long getMediaCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetMediaCount_1()
		throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		long result = fixture.getMediaCount();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		String result = fixture.getTagName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setMediaCount(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetMediaCount_1()
		throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");
		long mediaCount = 1L;

		fixture.setMediaCount(mediaCount);

		// add additional test code here
	}

	/**
	 * Run the void setTagName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetTagName_1()
		throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");
		String tagName = "";

		fixture.setTagName(tagName);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("TagInfoData [mediaCount=1, tagName=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TagInfoDataTest.class);
	}
}