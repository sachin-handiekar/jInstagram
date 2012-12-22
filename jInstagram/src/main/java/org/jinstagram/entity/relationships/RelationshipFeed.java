package org.jinstagram.entity.relationships;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.Meta;

public class RelationshipFeed {
	@SerializedName("data")
	private RelationshipData data;

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
	public RelationshipData getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(RelationshipData data) {
		this.data = data;
	}

    @Override
    public String toString() {
        return String.format("RelationshipFeed [data=%s, meta=%s]", data, meta);
    }
}
