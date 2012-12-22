package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class User {
	@SerializedName("bio")
	private String bio;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("id")
	private long id;

	@SerializedName("profile_picture")
	private String profilePictureUrl;

	@SerializedName("username")
	private String userName;

	@SerializedName("website")
	private String websiteUrl;

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
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/**
	 * @param websiteUrl the websiteUrl to set
	 */
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return String.format("User [bio=%s, fullName=%s, id=%s, profilePictureUrl=%s, userName=%s, websiteUrl=%s]",
                bio, fullName, id, profilePictureUrl, userName, websiteUrl);
    }
}
