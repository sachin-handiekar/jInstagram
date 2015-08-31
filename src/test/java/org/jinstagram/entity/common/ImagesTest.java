package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImagesTest</code> contains tests for the class <code>{@link Images}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class ImagesTest {
	/**
	 * Run the ImageData getLowResolution() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetLowResolution_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetStandardResolution_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetThumbnail_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetLowResolution_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetStandardResolution_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetThumbnail_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Images fixture = new Images();
		fixture.setThumbnail(new ImageData());
		fixture.setLowResolution(new ImageData());
		fixture.setStandardResolution(new ImageData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Images [lowResolution=ImageData [imageHeight=0, imageUrl=null, imageWidth=0], standardResolution=ImageData [imageHeight=0, imageUrl=null, imageWidth=0], thumbnail=ImageData [imageHeight=0, imageUrl=null, imageWidth=0]]", result);
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
		new org.junit.runner.JUnitCore().run(ImagesTest.class);
	}
}