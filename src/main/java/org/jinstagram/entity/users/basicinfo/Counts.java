package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class Counts {
	@SerializedName("follows")
	private int follows;

	@SerializedName("followed_by")
	private int follwedBy;

	@SerializedName("media")
	private int media;

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getFollows() {
		return follows;
	}

	public void setFollows(int follows) {
		this.follows = follows;
	}

	public int getFollwedBy() {
		return follwedBy;
	}

	public void setFollwedBy(int follwedBy) {
		this.follwedBy = follwedBy;
	}

    @Override
    public String toString() {
        return String.format("Counts [follows=%s, follwed_by=%s, media=%s]", follows, follwedBy, media);
    }
}
