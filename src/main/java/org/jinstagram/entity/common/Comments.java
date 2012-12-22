package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.comments.CommentData;

import java.util.List;

public class Comments {
	@SerializedName("data")
	private List<CommentData> comments;

	@SerializedName("count")
	private int count;

	public List<CommentData> getComments() {
		return comments;
	}

	public void setComments(List<CommentData> comments) {
		this.comments = comments;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

    @Override
    public String toString() {
        return String.format("Comments [comments=%s, count=%s]", comments, count);
    }
}
