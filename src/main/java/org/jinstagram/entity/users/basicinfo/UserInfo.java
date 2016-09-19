package org.jinstagram.entity.users.basicinfo;

import org.jinstagram.InstagramObject;

import com.google.gson.annotations.SerializedName;
import org.jinstagram.entity.common.Meta;

public class UserInfo extends InstagramObject{

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("data")
	private UserInfoData data;

	/**
	 * @return the meta
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public UserInfoData getData() {
		return data;
	}

	public void setData(UserInfoData data) {
		this.data = data;
	}

    @Override
    public String toString() {
        return String.format("UserInfo [data=%s]", data);
    }
}
