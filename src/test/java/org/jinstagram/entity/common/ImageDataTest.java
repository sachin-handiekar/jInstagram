package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImageDataTest</code> contains tests for the class
 * <code>{@link ImageData}</code>.
 *
 * 
 * @author sachin.handiekar
 */
public class ImageDataTest {
	/**
	 * Run the int getImageHeight() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetImageHeight_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);

		int result = fixture.getImageHeight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getImageUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetImageUrl_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);

		String result = fixture.getImageUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getImageWidth() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetImageWidth_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);

		int result = fixture.getImageWidth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setImageHeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetImageHeight_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);
		int imageHeight = 1;

		fixture.setImageHeight(imageHeight);

		// add additional test code here
	}

	/**
	 * Run the void setImageUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetImageUrl_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);
		String imageUrl = "";

		fixture.setImageUrl(imageUrl);

		// add additional test code here
	}

	/**
	 * Run the void setImageWidth(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetImageWidth_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);
		int imageWidth = 1;

		fixture.setImageWidth(imageWidth);

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
	public void testToString_1() throws Exception {
		ImageData fixture = new ImageData();
		fixture.setImageHeight(1);
		fixture.setImageUrl("");
		fixture.setImageWidth(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("ImageData [imageHeight=1, imageUrl=, imageWidth=1]", result);
	}

}