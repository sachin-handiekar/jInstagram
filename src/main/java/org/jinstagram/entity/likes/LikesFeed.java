package org.jinstagram.entity.likes;

import java.util.List;

import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.User;

import com.google.gson.annotations.SerializedName;

public class LikesFeed {

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("data")
	private List<User> userList;

	/**
	 * @return the meta
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * @param meta
	 *            the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

    @Override
    public String toString() {
        return String.format("LikesFeed [meta=%s, userList=%s]", meta, userList);
    }
}
