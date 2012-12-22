package org.jinstagram.entity.users.feed;

import com.google.gson.annotations.SerializedName;

public class UserFeedData {
	@SerializedName("first_name")
	private String firstName;

	@SerializedName("id")
	private long id;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("profile_picture")
	private String profilePictureUrl;

	@SerializedName("username")
	private String userName;

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
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
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
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
        return String.format("UserFeedData [firstName=%s, id=%s, lastName=%s, profilePictureUrl=%s, userName=%s]",
                firstName, id, lastName, profilePictureUrl, userName);
    }
}
