package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VideoDataTest</code> contains tests for the class
 * <code>{@link VideoData}</code>.
 *
 */
@Ignore
public class VideoDataTest {
	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetHeight() throws Exception {
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
	 * 
	 */
	@Test
	public void testGetUrl() throws Exception {
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
	 * 
	 */
	@Test
	public void testGetWidth() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetHeight() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetUrl() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetWidth() throws Exception {
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
	 * 
	 */
	@Test
	public void testToString() throws Exception {
		VideoData fixture = new VideoData();
		fixture.setWidth(1);
		fixture.setUrl("");
		fixture.setHeight(1);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.util.UnknownFormatConversionException: Conversion = 'i'
		// at java.util.Formatter$FormatSpecifier.conversion(Unknown Source)
		// at java.util.Formatter$FormatSpecifier.<init>(Unknown Source)
		// at java.util.Formatter.parse(Unknown Source)
		// at java.util.Formatter.format(Unknown Source)
		// at java.util.Formatter.format(Unknown Source)
		// at java.lang.String.format(Unknown Source)
		// at org.jinstagram.entity.common.VideoData.toString(VideoData.java:42)
		assertNotNull(result);
	}
 
}