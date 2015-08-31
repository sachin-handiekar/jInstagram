package org.jinstagram.entity.users.basicinfo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The class <code>UserInfoDataTest</code> contains tests for the class <code>{@link UserInfoData}</code>.
 */
public class UserInfoDataTest {
    /**
     * Run the String getBio() method test.
     *
     * @throws Exception
     */
    @Test
    public void testGetBio()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getBio();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Counts getCounts() method test.
     *
     * @throws Exception
     */
    @Test
    public void testGetCounts()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        Counts result = fixture.getCounts();

        // add additional test code here
        assertNotNull(result);
        assertEquals("Counts [follows=0, followed_by=0, media=0]", result.toString());
        assertEquals(0, result.getMedia());
        assertEquals(0, result.getFollows());
        assertEquals(0, result.getFollowedBy());
    }

    /**
     * Run the String getFirstName() method test.
     *
     * @throws Exception
     */
    @Test
    public void testGetFirstName()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getFirstName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getFullName() method test.
     *
     * @throws Exception
     */
    @Test
    public void testGetFullName()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getFullName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     */
    @Test
    public void testGetId()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getLastName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testGetLastName()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getLastName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getProfilePicture() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testGetProfilePicture()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getProfilePicture();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getUsername() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testGetUsername()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getUsername();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getWebsite() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testGetWebsite()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.getWebsite();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the void setBio(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetBio()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String bio = "";

        fixture.setBio(bio);

        // add additional test code here
    }

    /**
     * Run the void setCounts(Counts) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetCounts()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        Counts counts = new Counts();

        fixture.setCounts(counts);

        // add additional test code here
    }

    /**
     * Run the void setFirstName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetFirstName()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String firstName = "";

        fixture.setFirstName(firstName);

        // add additional test code here
    }

    /**
     * Run the void setFullName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetFullName()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String fullName = "";

        fixture.setFullName(fullName);

        // add additional test code here
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetId()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String id = "";

        fixture.setId(id);

        // add additional test code here
    }

    /**
     * Run the void setLast_name(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetLast_name()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String last_name = "";

        fixture.setLast_name(last_name);

        // add additional test code here
    }

    /**
     * Run the void setProfilePicture(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetProfilePicture()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String profilePicture = "";

        fixture.setProfilePicture(profilePicture);

        // add additional test code here
    }

    /**
     * Run the void setUsername(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetUsername()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String username = "";

        fixture.setUsername(username);

        // add additional test code here
    }

    /**
     * Run the void setWebsite(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testSetWebsite()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");
        String website = "";

        fixture.setWebsite(website);

        // add additional test code here
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 31/08/15 16:47
     */
    @Test
    public void testToString()
            throws Exception {
        UserInfoData fixture = new UserInfoData();
        fixture.setCounts(new Counts());
        fixture.setFirstName("");
        fixture.setLast_name("");
        fixture.setWebsite("");
        fixture.setId("");
        fixture.setProfilePicture("");
        fixture.setUsername("");
        fixture.setBio("");
        fixture.setFullName("");

        String result = fixture.toString();

        // add additional test code here
        assertEquals("UserInfoData [bio=, counts=Counts [follows=0, followed_by=0, media=0], first_name=, id=, last_name=, profile_picture=, username=, fullName=, website=]", result);
    }

}