package org.jinstagram.entity.comments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jinstagram.entity.common.Meta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MediaCommentResponseTest</code> contains tests for the class
 * <code>{@link MediaCommentResponse}</code>.
 */
public class MediaCommentResponseTest {
	/**
	 * Run the CommentData getCommentData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCommentData_1() throws Exception {
		MediaCommentResponse fixture = new MediaCommentResponse();
		fixture.setCommentData(new CommentData());
		fixture.setMeta(new Meta());

		CommentData result = fixture.getCommentData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getText());
		assertEquals("CommentData [commentFrom=null, createdTime=null, id=null, text=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getCommentFrom());
		assertEquals(null, result.getCreatedTime());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
		MediaCommentResponse fixture = new MediaCommentResponse();
		fixture.setCommentData(new CommentData());
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
	 * Run the void setCommentData(CommentData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCommentData_1() throws Exception {
		MediaCommentResponse fixture = new MediaCommentResponse();
		fixture.setCommentData(new CommentData());
		fixture.setMeta(new Meta());
		CommentData commentData = new CommentData();

		fixture.setCommentData(commentData);

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
	public void testSetMeta_1() throws Exception {
		MediaCommentResponse fixture = new MediaCommentResponse();
		fixture.setCommentData(new CommentData());
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
	public void testToString_1() throws Exception {
		MediaCommentResponse fixture = new MediaCommentResponse();
		fixture.setCommentData(new CommentData());
		fixture.setMeta(new Meta());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"MediaCommentResponse [commentData=CommentData [commentFrom=null, createdTime=null, id=null, text=null], meta=Meta [code=0, errorMessage=null, errorType=null]]",
				result);
	}

}