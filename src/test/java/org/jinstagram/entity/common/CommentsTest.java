package org.jinstagram.entity.common;

import java.util.ArrayList;
import java.util.List;
import org.jinstagram.entity.comments.CommentData;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CommentsTest</code> contains tests for the class
 * <code>{@link Comments}</code>.
 *
 * 
 * @author Sachin Handiekar
 */
public class CommentsTest {
	/**
	 * Run the List<CommentData> getComments() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetComments_1() throws Exception {
		Comments caption = new Comments();
		caption.setCount(1);
		caption.setComments(new ArrayList<CommentData>());

		List<CommentData> result = caption.getComments();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getCount() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCount_1() throws Exception {
		Comments caption = new Comments();
		caption.setCount(1);
		caption.setComments(new ArrayList<CommentData>());

		int result = caption.getCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setComments(List<CommentData>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetComments_1() throws Exception {
		Comments caption = new Comments();
		caption.setCount(1);
		caption.setComments(new ArrayList<CommentData>());
		List<CommentData> comments = new ArrayList<CommentData>();

		caption.setComments(comments);

		// add additional test code here
	}

	/**
	 * Run the void setCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCount_1() throws Exception {
		Comments caption = new Comments();
		caption.setCount(1);
		caption.setComments(new ArrayList<CommentData>());
		int count = 1;

		caption.setCount(count);

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
		Comments caption = new Comments();
		caption.setCount(1);
		caption.setComments(new ArrayList<CommentData>());

		String result = caption.toString();

		// add additional test code here
		assertEquals("Comments [comments=[], count=1]", result);
	}

 
}