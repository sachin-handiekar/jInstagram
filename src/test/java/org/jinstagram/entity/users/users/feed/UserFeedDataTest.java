package org.jinstagram.entity.users.users.feed;

import static org.junit.Assert.*;

import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.Test;

public class UserFeedDataTest {
    
    @Test
    public void testToString() {
        UserFeedData ufd = new UserFeedData();
        
        final String aBio = "a bio";
        ufd.setBio(aBio);
        
        final String aFullName = "a full name";
        ufd.setFullName(aFullName);
        
        final String anID = "12345";
        ufd.setId(anID);
        
        final String anUrl = "http://images.ak.instagram.com/profiles/profile_493845840_75sq_1384173674.jpg";
        ufd.setProfilePictureUrl(anUrl);
        
        final String anUserName = "a_user_name";
        ufd.setUserName(anUserName);
        
        final String aWebsite = "http://larc.smu.edu.sg";
        ufd.setWebsite(aWebsite);

        String expectedToString = String
                .format("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, "
                        + "fullName=%s, website=%s, "
                        + "bio=%s]",
                        anID, anUrl, anUserName, aFullName, aWebsite, aBio);
        
       assertTrue(ufd.toString().equals(expectedToString));
    }

}
