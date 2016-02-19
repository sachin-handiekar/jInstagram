package org.jinstagram.entity.users.basicinfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>UserInfoDataTest</code> contains tests for the class
 * <code>{@link UserInfoData}</code>.
 *
 */
public class UserInfoDataTest {
	/**
	 * Run the String getBio() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetBio_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getBio();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Counts getCounts() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCounts_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		Counts result = fixture.getCounts();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getFollows());
		assertEquals("Counts [follows=0, followed_by=0, media=0]", result.toString());
		assertEquals(0, result.getMedia());
		assertEquals(0, result.getFollowedBy());
	}

	/**
	 * Run the String getFirstName() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetFirstName_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getFirstName();

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
	public void testGetFullName_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

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
	public void testGetId_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLastName() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetLastName_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getLastName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getProfilePicture() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetProfilePicture_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getProfilePicture();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetUsername_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getUsername();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getWebsite() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetWebsite_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.getWebsite();

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
	public void testSetBio_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String bio = "";

		fixture.setBio(bio);

		// add additional test code here
	}

	/**
	 * Run the void setCounts(Counts) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCounts_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		Counts counts = new Counts();

		fixture.setCounts(counts);

		// add additional test code here
	}

	/**
	 * Run the void setFirstName(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetFirstName_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String firstName = "";

		fixture.setFirstName(firstName);

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
	public void testSetFullName_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
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
	public void testSetId_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setLast_name(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetLast_name_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String last_name = "";

		fixture.setLast_name(last_name);

		// add additional test code here
	}

	/**
	 * Run the void setProfilePicture(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetProfilePicture_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String profilePicture = "";

		fixture.setProfilePicture(profilePicture);

		// add additional test code here
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetUsername_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String username = "";

		fixture.setUsername(username);

		// add additional test code here
	}

	/**
	 * Run the void setWebsite(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetWebsite_1() throws Exception {
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");
		String website = "";

		fixture.setWebsite(website);

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
		UserInfoData fixture = new UserInfoData();
		fixture.setUsername("");
		fixture.setFullName("");
		fixture.setProfilePicture("");
		fixture.setId("");
		fixture.setLast_name("");
		fixture.setCounts(new Counts());
		fixture.setFirstName("");
		fixture.setBio("");
		fixture.setWebsite("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"UserInfoData [bio=, counts=Counts [follows=0, followed_by=0, media=0], first_name=, id=, last_name=, profile_picture=, username=, fullName=, website=]",
				result);
	}

}