package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class Caption {
	@SerializedName("created_time")
	private String createdTime;

	@SerializedName("from")
	private FromTagData from;

	@SerializedName("id")
	private long id;

	@SerializedName("text")
	private String text;

	/**
	 * @return the createdTime
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the from
	 */
	public FromTagData getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(FromTagData from) {
		this.from = from;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return String.format("Caption [createdTime=%s, from=%s, id=%s, text=%s]", createdTime, from, id, text);
    }
}
