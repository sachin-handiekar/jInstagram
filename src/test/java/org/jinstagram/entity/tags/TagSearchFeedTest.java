package org.jinstagram.entity.tags;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.jinstagram.entity.common.Meta;
import org.junit.Test;

/**
 * The class <code>TagSearchFeedTest</code> contains tests for the class
 * <code>{@link TagSearchFeed}</code>.
 */
public class TagSearchFeedTest {
	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
		TagSearchFeed fixture = new TagSearchFeed();
		fixture.setMeta(new Meta());
		fixture.setTagList(new ArrayList<TagInfoData>());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the List<TagInfoData> getTagList() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetTagList_1() throws Exception {
		TagSearchFeed fixture = new TagSearchFeed();
		fixture.setMeta(new Meta());
		fixture.setTagList(new ArrayList<TagInfoData>());

		List<TagInfoData> result = fixture.getTagList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		TagSearchFeed fixture = new TagSearchFeed();
		fixture.setMeta(new Meta());
		fixture.setTagList(new ArrayList<TagInfoData>());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setTagList(List<TagInfoData>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetTagList_1() throws Exception {
		TagSearchFeed fixture = new TagSearchFeed();
		fixture.setMeta(new Meta());
		fixture.setTagList(new ArrayList<TagInfoData>());
		List<TagInfoData> tagList = new ArrayList<TagInfoData>();

		fixture.setTagList(tagList);

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
		TagSearchFeed fixture = new TagSearchFeed();
		fixture.setMeta(new Meta());
		fixture.setTagList(new ArrayList<TagInfoData>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("TagSearchFeed [meta=Meta [code=0, errorMessage=null, errorType=null], tagList=[]]", result);
	}

}