package org.jinstagram.entity.comments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.jinstagram.entity.common.Meta;
import org.junit.Test;

/**
 * The class <code>MediaCommentsFeedTest</code> contains tests for the class
 * <code>{@link MediaCommentsFeed}</code>.
 *
 */
public class MediaCommentsFeedTest {
	/**
	 * Run the List<CommentData> getCommentDataList() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCommentDataList() throws Exception {
		MediaCommentsFeed fixture = new MediaCommentsFeed();
		fixture.setCommentDataList(new LinkedList());
		fixture.setMeta(new Meta());

		List<CommentData> result = fixture.getCommentDataList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta() throws Exception {
		MediaCommentsFeed fixture = new MediaCommentsFeed();
		fixture.setCommentDataList(new LinkedList());
		fixture.setMeta(new Meta());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setCommentDataList(List<CommentData>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCommentDataList() throws Exception {
		MediaCommentsFeed fixture = new MediaCommentsFeed();
		fixture.setCommentDataList(new LinkedList());
		fixture.setMeta(new Meta());
		List<CommentData> commentDataList = new LinkedList();

		fixture.setCommentDataList(commentDataList);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(Meta) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMeta() throws Exception {
		MediaCommentsFeed fixture = new MediaCommentsFeed();
		fixture.setCommentDataList(new LinkedList());
		fixture.setMeta(new Meta());
		Meta meta = new Meta();

		fixture.setMeta(meta);

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
		MediaCommentsFeed fixture = new MediaCommentsFeed();
		fixture.setCommentDataList(new LinkedList());
		fixture.setMeta(new Meta());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MediaCommentsFeed [commentDataList=[], meta=Meta [code=0, errorMessage=null, errorType=null]]",
				result);
	}

}