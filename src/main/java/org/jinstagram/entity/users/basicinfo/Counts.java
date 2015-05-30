package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class Counts {
	@SerializedName("follows")
	private int follows;

	@SerializedName("followed_by")
	private int followedBy;

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

	public int getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(int follwedBy) {
		this.followedBy = follwedBy;
	}

    @Override
    public String toString() {
        return String.format("Counts [follows=%s, followed_by=%s, media=%s]", follows, followedBy, media);
    }
}
