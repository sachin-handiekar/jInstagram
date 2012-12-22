package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Likes {
	@SerializedName("count")
	private int count;

	@SerializedName("data")
	private List<User> likesUserList;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public List<User> getLikesUserList() {
		return likesUserList;
	}

	public void setLikesUserList(List<User> likesUserList) {
		this.likesUserList = likesUserList;
	}

    @Override
    public String toString() {
        return String.format("Likes [count=%s, likesUserList=%s]", count, likesUserList);
    }
}
