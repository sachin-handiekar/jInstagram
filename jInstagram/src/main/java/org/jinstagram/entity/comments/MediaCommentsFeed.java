package org.jinstagram.entity.comments;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.Meta;

import java.util.List;

public class MediaCommentsFeed {
	@SerializedName("data")
	private List<CommentData> commentDataList;

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
	 * @return the commentDataList
	 */
	public List<CommentData> getCommentDataList() {
		return commentDataList;
	}

	/**
	 * @param commentDataList the commentDataList to set
	 */
	public void setCommentDataList(List<CommentData> commentDataList) {
		this.commentDataList = commentDataList;
	}

    @Override
    public String toString() {
        return String.format("MediaCommentsFeed [commentDataList=%s, meta=%s]", commentDataList, meta);
    }
}
