package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VideoDataTest</code> contains tests for the class <code>{@link VideoData}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
@Ignore
public class VideoDataTest {
	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);

		int result = fixture.getHeight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetUrl_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);

		String result = fixture.getUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);

		int result = fixture.getWidth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setHeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetHeight_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);
		int height = 1;

		fixture.setHeight(height);

		// add additional test code here
	}

	/**
	 * Run the void setUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetUrl_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);
		String url = "";

		fixture.setUrl(url);

		// add additional test code here
	}

	/**
	 * Run the void setWidth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetWidth_1()
		throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);
		int width = 1;

		fixture.setWidth(width);

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
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.UnknownFormatConversionException: Conversion = 'i'
		//       at java.util.Formatter$FormatSpecifier.conversion(Unknown Source)
		//       at java.util.Formatter$FormatSpecifier.<init>(Unknown Source)
		//       at java.util.Formatter.parse(Unknown Source)
		//       at java.util.Formatter.format(Unknown Source)
		//       at java.util.Formatter.format(Unknown Source)
		//       at java.lang.String.format(Unknown Source)
		//       at org.jinstagram.entity.common.VideoData.toString(VideoData.java:42)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(VideoDataTest.class);
	}
}