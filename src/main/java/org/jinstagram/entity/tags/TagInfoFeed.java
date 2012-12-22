package org.jinstagram.entity.tags;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.Meta;

public class TagInfoFeed {
	@SerializedName("meta")
	private Meta meta;

	@SerializedName("data")
	private TagInfoData tagInfo;

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

	public TagInfoData getTagInfo() {
		return tagInfo;
	}

	public void setTagInfo(TagInfoData tagInfo) {
		this.tagInfo = tagInfo;
	}

    @Override
    public String toString() {
        return String.format("TagInfoFeed [meta=%s, tagInfo=%s]", meta, tagInfo);
    }
}
