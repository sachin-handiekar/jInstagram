package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class UserInfoData {
	@SerializedName("bio")
	private String bio;

	@SerializedName("counts")
	private Counts counts;

	@SerializedName("first_name")
	private String first_name;

	@SerializedName("id")
	private long id;

	@SerializedName("last_name")
	private String last_name;

	@SerializedName("profile_picture")
	private String profile_picture;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
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
                        bio, counts, first_name, id, last_name, profile_picture, username, fullName, website);
    }
}
