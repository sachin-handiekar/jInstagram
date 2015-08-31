package org.jinstagram.entity.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>CaptionTest</code> contains tests for the class
 * <code>{@link Caption}</code>.
 *
 * @author Sachin Handiekar
 */
public class CaptionTest {
	/**
	 * Run the String getCreatedTime() method test.
	 *
	 * @throws Exception if any error occurs
	 */
	@Test
	public void testGetCreatedTime_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");

		String result = caption.getCreatedTime();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the FromTagData getFrom() method test.
	 *
	 * @throws Exception if any error occurs
	 */
	@Test
	public void testGetFrom_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");

		FromTagData result = caption.getFrom();

		// add additional test code here
		assertNotNull(result);
		assertEquals("FromTagData [fullName=null, id=null, profilePicture=null, username=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getProfilePicture());
		assertEquals(null, result.getUsername());
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetId_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");

		String result = caption.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetText_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");

		String result = caption.getText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCreatedTime(String) method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetCreatedTime_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");
		String createdTime = "";

		caption.setCreatedTime(createdTime);

		// add additional test code here
	}

	/**
	 * Run the void setFrom(FromTagData) method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetFrom_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");
		FromTagData from = new FromTagData();

		caption.setFrom(from);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetId_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");
		String id = "";

		caption.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetText_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");
		String text = "";

		caption.setText(text);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception if any error occurs
	 *
	 * 
	 */
	@Test
	public void testToString_1() throws Exception {
		Caption caption = new Caption();
		caption.setCreatedTime("");
		caption.setFrom(new FromTagData());
		caption.setText("");
		caption.setId("");

		String result = caption.toString();

		// add additional test code here
		assertEquals(
				"Caption [createdTime=, from=FromTagData [fullName=null, id=null, profilePicture=null, username=null], id=, text=]",
				result);
	}

}