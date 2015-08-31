package org.jinstagram.entity.media;

import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MediaInfoFeedTest</code> contains tests for the class <code>{@link MediaInfoFeed}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class MediaInfoFeedTest {
	/**
	 * Run the MediaFeedData getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		MediaFeedData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals("MediaFeedData [caption=null, comments=null, createdTime=null, id=null, imageFilter=null, images=null, likes=null, link=null, location=null, tags=null, type=null, user=null, userHasLiked=false, usersInPhoto=null]", result.toString());
		assertEquals(null, result.getLocation());
		assertEquals(null, result.getId());
		assertEquals(null, result.getType());
		assertEquals(null, result.getUsersInPhotoList());
		assertEquals(null, result.getTags());
		assertEquals(null, result.getCaption());
		assertEquals(null, result.getComments());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getLink());
		assertEquals(null, result.getImages());
		assertEquals(false, result.isUserHasLiked());
		assertEquals(null, result.getImageFilter());
		assertEquals(null, result.getCreatedTime());
		assertEquals(null, result.getLikes());
		assertEquals(null, result.getVideos());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetMeta_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setData(MediaFeedData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());
		MediaFeedData data = new MediaFeedData();

		fixture.setData(data);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(Meta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetMeta_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());
		Meta meta = new Meta();

		fixture.setMeta(meta);

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
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MediaInfoFeed [data=MediaFeedData [caption=null, comments=null, createdTime=null, id=null, imageFilter=null, images=null, likes=null, link=null, location=null, tags=null, type=null, user=null, userHasLiked=false, usersInPhoto=null], meta=Meta [code=0, errorMessage=null, errorType=null]]", result);
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
		new org.junit.runner.JUnitCore().run(MediaInfoFeedTest.class);
	}
}