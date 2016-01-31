package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserTest</code> contains tests for the class
 * <code>{@link User}</code>.
 */
public class UserTest {
	/**
	 * Run the String getBio() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetBio() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getBio();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getFullName() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetFullName() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getFullName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetId() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProfilePictureUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetProfilePictureUrl() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getProfilePictureUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUserName() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetUserName() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getUserName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWebsiteUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetWebsiteUrl() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.getWebsiteUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setBio(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetBio() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String bio = "";

		fixture.setBio(bio);

		// add additional test code here
	}

	/**
	 * Run the void setFullName(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetFullName() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String fullName = "";

		fixture.setFullName(fullName);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetId() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setProfilePictureUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetProfilePictureUrl() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String profilePictureUrl = "";

		fixture.setProfilePictureUrl(profilePictureUrl);

		// add additional test code here
	}

	/**
	 * Run the void setUserName(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetUserName() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String userName = "";

		fixture.setUserName(userName);

		// add additional test code here
	}

	/**
	 * Run the void setWebsiteUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetWebsiteUrl() throws Exception {
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");
		String websiteUrl = "";

		fixture.setWebsiteUrl(websiteUrl);

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
		User fixture = new User();
		fixture.setBio("");
		fixture.setUserName("");
		fixture.setWebsiteUrl("");
		fixture.setFullName("");
		fixture.setProfilePictureUrl("");
		fixture.setId("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("User [bio=, fullName=, id=, profilePictureUrl=, userName=, websiteUrl=]", result);
	}

}