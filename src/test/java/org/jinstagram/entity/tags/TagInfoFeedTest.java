package org.jinstagram.entity.tags;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jinstagram.entity.common.Meta;
import org.junit.Test;

/**
 * The class <code>TagInfoFeedTest</code> contains tests for the class
 * <code>{@link TagInfoFeed}</code>.
 */
public class TagInfoFeedTest {
	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
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
	 * 
	 */
	@Test
	public void testGetTagInfo_1() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetMeta_1() throws Exception {
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
	 * 
	 */
	@Test
	public void testSetTagInfo_1() throws Exception {
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
	 * 
	 */
	@Test
	public void testToString_1() throws Exception {
		TagInfoFeed fixture = new TagInfoFeed();
		fixture.setTagInfo(new TagInfoData());
		fixture.setMeta(new Meta());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"TagInfoFeed [meta=Meta [code=0, errorMessage=null, errorType=null], tagInfo=TagInfoData [mediaCount=0, tagName=null]]",
				result);
	}
}