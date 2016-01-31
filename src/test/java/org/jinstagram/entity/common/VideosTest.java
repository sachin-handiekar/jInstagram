package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VideosTest</code> contains tests for the class
 * <code>{@link Videos}</code>.
 */
@Ignore
public class VideosTest {
	/**
	 * Run the VideoData getLowResolution() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetLowResolution() throws Exception {
		Videos fixture = new Videos();
		fixture.setStandardResolution(new VideoData());
		fixture.setLowResolution(new VideoData());

		VideoData result = fixture.getLowResolution();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getWidth());
		assertEquals(null, result.getUrl());
		assertEquals(0, result.getHeight());
	}

	/**
	 * Run the VideoData getStandardResolution() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetStandardResolution() throws Exception {
		Videos fixture = new Videos();
		fixture.setStandardResolution(new VideoData());
		fixture.setLowResolution(new VideoData());

		VideoData result = fixture.getStandardResolution();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getWidth());
		assertEquals(null, result.getUrl());
		assertEquals(0, result.getHeight());
	}

	/**
	 * Run the void setLowResolution(VideoData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetLowResolution() throws Exception {
		Videos fixture = new Videos();
		fixture.setStandardResolution(new VideoData());
		fixture.setLowResolution(new VideoData());
		VideoData lowResolution = new VideoData();

		fixture.setLowResolution(lowResolution);

		// add additional test code here
	}

	/**
	 * Run the void setStandardResolution(VideoData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetStandardResolution() throws Exception {
		Videos fixture = new Videos();
		fixture.setStandardResolution(new VideoData());
		fixture.setLowResolution(new VideoData());
		VideoData standardResolution = new VideoData();

		fixture.setStandardResolution(standardResolution);

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
		Videos fixture = new Videos();
		fixture.setStandardResolution(new VideoData());
		fixture.setLowResolution(new VideoData());

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
		// at java.util.Formatter$FormatSpecifier.printString(Unknown Source)
		// at java.util.Formatter$FormatSpecifier.print(Unknown Source)
		// at java.util.Formatter.format(Unknown Source)
		// at java.util.Formatter.format(Unknown Source)
		// at java.lang.String.format(Unknown Source)
		// at org.jinstagram.entity.common.Videos.toString(Videos.java:33)
		assertNotNull(result);
	}

}