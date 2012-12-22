package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class Counts {
	@SerializedName("follows")
	private int follows;

	@SerializedName("followed_by")
	private int follwed_by;

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

	public int getFollwed_by() {
		return follwed_by;
	}

	public void setFollwed_by(int follwed_by) {
		this.follwed_by = follwed_by;
	}

    @Override
    public String toString() {
        return String.format("Counts [follows=%s, follwed_by=%s, media=%s]", follows, follwed_by, media);
    }
}
