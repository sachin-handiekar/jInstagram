package org.jinstagram.entity.comments;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.FromTagData;

public class CommentData {
	@SerializedName("from")
	private FromTagData commentFrom;

	@SerializedName("created_time")
	private String createdTime;

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
	 * @return the commentFrom
	 */
	public FromTagData getCommentFrom() {
		return commentFrom;
	}

	/**
	 * @param commentFrom the commentFrom to set
	 */
	public void setCommentFrom(FromTagData commentFrom) {
		this.commentFrom = commentFrom;
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
        return String.format("CommentData [commentFrom=%s, createdTime=%s, id=%s, text=%s]",
                commentFrom, createdTime, id, text);
    }
}
