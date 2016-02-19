package org.jinstagram.entity.comments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jinstagram.entity.common.FromTagData;
import org.junit.Test;

/**
 * The class <code>CommentDataTest</code> contains tests for the class
 * <code>{@link CommentData}</code>.
 */
public class CommentDataTest {
	/**
	 * Run the FromTagData getCommentFrom() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetCommentFrom() throws Exception {
		CommentData commentData = new CommentData();
		commentData.setText("");
		commentData.setCommentFrom(new FromTagData());
		commentData.setCreatedTime("");
		commentData.setId("");

		FromTagData result = commentData.getCommentFrom();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getProfilePicture());
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getFullName());
		assertEquals("FromTagData [fullName=null, id=null, profilePicture=null, username=null]", result.toString());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the String getCreatedTime() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetCreatedTime() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");

		String result = fixture.getCreatedTime();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetId() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetText() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");

		String result = fixture.getText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCommentFrom(FromTagData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCommentFrom() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");
		FromTagData commentFrom = new FromTagData();

		fixture.setCommentFrom(commentFrom);

		// add additional test code here
	}

	/**
	 * Run the void setCreatedTime(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testSetCreatedTime() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");
		String createdTime = "";

		fixture.setCreatedTime(createdTime);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testSetId() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testSetText() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testToString() throws Exception {
		CommentData fixture = new CommentData();
		fixture.setText("");
		fixture.setCommentFrom(new FromTagData());
		fixture.setCreatedTime("");
		fixture.setId("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"CommentData [commentFrom=FromTagData [fullName=null, id=null, profilePicture=null, username=null], createdTime=, id=, text=]",
				result);
	}

}