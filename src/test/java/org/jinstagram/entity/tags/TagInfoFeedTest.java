package org.jinstagram.entity.tags;

import org.jinstagram.entity.common.Meta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TagInfoFeedTest</code> contains tests for the class <code>{@link TagInfoFeed}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class TagInfoFeedTest {
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
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the TagInfoData getTagInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetTagInfo_1()
		throws Exception {
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());

		TagInfoData result = fixture.getTagInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals("TagInfoData [mediaCount=0, tagName=null]", result.toString());
		assertEquals(null, result.getTagName());
		assertEquals(0L, result.getMediaCount());
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
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setTagInfo(TagInfoData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetTagInfo_1()
		throws Exception {
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());
		TagInfoData tagInfo = new TagInfoData();

		fixture.setTagInfo(tagInfo);

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
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("TagInfoFeed [meta=Meta [code=0, errorMessage=null, errorType=null], tagInfo=TagInfoData [mediaCount=0, tagName=null]]", result);
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
		new org.junit.runner.JUnitCore().run(TagInfoFeedTest.class);
	}
}