package org.jinstagram.entity.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>ImagesTest</code> contains tests for the class
 * <code>{@link Images}</code>.
 */
public class ImagesTest {
	/**
	 * Run the ImageData getLowResolution() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetLowResolution() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());

		ImageData result = fixture.getLowResolution();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ImageData [imageHeight=0, imageUrl=null, imageWidth=0]", result.toString());
		assertEquals(null, result.getImageUrl());
		assertEquals(0, result.getImageHeight());
		assertEquals(0, result.getImageWidth());
	}

	/**
	 * Run the ImageData getStandardResolution() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetStandardResolution() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());

		ImageData result = fixture.getStandardResolution();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ImageData [imageHeight=0, imageUrl=null, imageWidth=0]", result.toString());
		assertEquals(null, result.getImageUrl());
		assertEquals(0, result.getImageHeight());
		assertEquals(0, result.getImageWidth());
	}

	/**
	 * Run the ImageData getThumbnail() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetThumbnail() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());

		ImageData result = fixture.getThumbnail();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ImageData [imageHeight=0, imageUrl=null, imageWidth=0]", result.toString());
		assertEquals(null, result.getImageUrl());
		assertEquals(0, result.getImageHeight());
		assertEquals(0, result.getImageWidth());
	}

	/**
	 * Run the void setLowResolution(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetLowResolution() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());
		ImageData lowResolution = new ImageData();

		fixture.setLowResolution(lowResolution);

		// add additional test code here
	}

	/**
	 * Run the void setStandardResolution(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetStandardResolution() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());
		ImageData standardResolution = new ImageData();

		fixture.setStandardResolution(standardResolution);

		// add additional test code here
	}

	/**
	 * Run the void setThumbnail(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetThumbnail() throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());
		ImageData thumbnail = new ImageData();

		fixture.setThumbnail(thumbnail);

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
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"Images [lowResolution=ImageData [imageHeight=0, imageUrl=null, imageWidth=0], standardResolution=ImageData [imageHeight=0, imageUrl=null, imageWidth=0], thumbnail=ImageData [imageHeight=0, imageUrl=null, imageWidth=0]]",
				result);
	}

}