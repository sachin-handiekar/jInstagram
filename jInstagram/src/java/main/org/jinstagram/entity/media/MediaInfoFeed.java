package org.jinstagram.entity.media;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.users.feed.MediaFeedData;

public class MediaInfoFeed {
	@SerializedName("data")
	private MediaFeedData data;

	@SerializedName("meta")
	private Meta meta;

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

	/**
	 * @return the data
	 */
	public MediaFeedData getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(MediaFeedData data) {
		this.data = data;
	}

    @Override
    public String toString() {
        return String.format("MediaInfoFeed [data=%s, meta=%s]", data, meta);
    }
}
