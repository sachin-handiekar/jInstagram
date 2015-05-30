package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class UserInfoData {
	@SerializedName("bio")
	private String bio;

	@SerializedName("counts")
	private Counts counts;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("id")
	private String id;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("profile_picture")
	private String profilePicture;

	@SerializedName("username")
	private String username;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("website")
	private String website;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Counts getCounts() {
		return counts;
	}

	public void setCounts(Counts counts) {
		this.counts = counts;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

    @Override
    public String toString() {
        return String.format("UserInfoData [bio=%s, counts=%s, first_name=%s, id=%s, last_name=%s, profile_picture=%s, username=%s, fullName=%s, website=%s]",
                        bio, counts, firstName, id, lastName, profilePicture, username, fullName, website);
    }
}
