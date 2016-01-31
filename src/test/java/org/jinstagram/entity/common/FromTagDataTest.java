package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FromTagDataTest</code> contains tests for the class
 * <code>{@link FromTagData}</code>.
 *
 * 
 * @author Sachin Handiekar
 */
public class FromTagDataTest {
	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 */
	@Test
	public void testGetFullName() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");

		String result = fromTagData.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetId() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");

		String result = fromTagData.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProfilePicture() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testGetProfilePicture() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");

		String result = fromTagData.getProfilePicture();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testGetUsername() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");

		String result = fromTagData.getUsername();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setFullName(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetFullName() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");
		String fullName = "";

		fromTagData.setFullName(fullName);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetId() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");
		String id = "";

		fromTagData.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setProfilePicture(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetProfilePicture() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");
		String profilePicture = "";

		fromTagData.setProfilePicture(profilePicture);

		// add additional test code here
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 *
	 * 
	 */
	@Test
	public void testSetUsername() throws Exception {
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");
		String username = "";

		fromTagData.setUsername(username);

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
		FromTagData fromTagData = new FromTagData();
		fromTagData.setProfilePicture("");
		fromTagData.setUsername("");
		fromTagData.setId("");
		fromTagData.setFullName("");

		String result = fromTagData.toString();

		// add additional test code here
		assertEquals("FromTagData [fullName=, id=, profilePicture=, username=]", result);
	}

}