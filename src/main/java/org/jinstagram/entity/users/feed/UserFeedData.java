package org.jinstagram.entity.users.feed;

import com.google.gson.annotations.SerializedName;

public class UserFeedData {
	@Deprecated
	@SerializedName("first_name")
	private String firstName;

	@SerializedName("id")
	private String id;

	@Deprecated
	@SerializedName("last_name")
	private String lastName;

	@SerializedName("profile_picture")
	private String profilePictureUrl;

	@SerializedName("username")
	private String userName;
	
	@SerializedName("full_name")
	private String fullName;
	
	@SerializedName("website")
	private String website;
	
	@SerializedName("bio")
	private String bio;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the firstName
	 */
	@Deprecated
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	@Deprecated
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the profilePictureUrl
	 */
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}

	/**
	 * @param profilePictureUrl the profilePictureUrl to set
	 */
	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}

	/**
	 * @return the lastName
	 */
	@Deprecated
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	@Deprecated
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return the website
	 */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * 
     * @param bio the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return String.format("UserFeedData [id=%s, profilePictureUrl=%s, userName=%s, fullName=%s, website=%s, bio=%s]",
                id, profilePictureUrl, userName, fullName, website, bio);
    }
}
