package org.jinstagram.entity.tags;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The class <code>TagInfoDataTest</code> contains tests for the class
 * <code>{@link TagInfoData}</code>.
 */
public class TagInfoDataTest {
	/**
	 * Run the long getMediaCount() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMediaCount_1() throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		long result = fixture.getMediaCount();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetTagName_1() throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		String result = fixture.getTagName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setMediaCount(long) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMediaCount_1() throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");
		long mediaCount = 1L;

		fixture.setMediaCount(mediaCount);

		// add additional test code here
	}

	/**
	 * Run the void setTagName(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetTagName_1() throws Exception {
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");
		String tagName = "";

		fixture.setTagName(tagName);

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
		TagInfoData fixture = new TagInfoData();
		fixture.setMediaCount(1L);
		fixture.setTagName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("TagInfoData [mediaCount=1, tagName=]", result);
	}

}