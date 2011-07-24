package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class Pagination {
	@SerializedName("deprecation_warning")
	private String depreciationWarning;

	@SerializedName("min_tag_id")
	private long minTagId;

	@SerializedName("next_max_id")
	private long nextMaxId;

	@SerializedName("next_max_tag_id")
	private long nextMaxTagId;

	@SerializedName("next_min_id")
	private long nextMinId;

	@SerializedName("next_url")
	private String nextUrl;

	/**
	 * @return the nextUrl
	 */
	public String getNextUrl() {
		return nextUrl;
	}

	/**
	 * @param nextUrl the nextUrl to set
	 */
	public void setNextUrl(String nextUrl) {
		this.nextUrl = nextUrl;
	}

	/**
	 * @return the nextMaxId
	 */
	public long getNextMaxId() {
		return nextMaxId;
	}

	/**
	 * @param nextMaxId the nextMaxId to set
	 */
	public void setNextMaxId(long nextMaxId) {
		this.nextMaxId = nextMaxId;
	}

	/**
	 * @return the nextMinId
	 */
	public long getNextMinId() {
		return nextMinId;
	}

	/**
	 * @param nextMinId the nextMinId to set
	 */
	public void setNextMinId(long nextMinId) {
		this.nextMinId = nextMinId;
	}

	/**
	 * @return the minTagId
	 */
	public long getMinTagId() {
		return minTagId;
	}

	/**
	 * @param minTagId the minTagId to set
	 */
	public void setMinTagId(long minTagId) {
		this.minTagId = minTagId;
	}

	/**
	 * @return the nextMaxTagId
	 */
	public long getNextMaxTagId() {
		return nextMaxTagId;
	}

	/**
	 * @param nextMaxTagId the nextMaxTagId to set
	 */
	public void setNextMaxTagId(long nextMaxTagId) {
		this.nextMaxTagId = nextMaxTagId;
	}

	/**
	 * @return the depreciationWarning
	 */
	public String getDepreciationWarning() {
		return depreciationWarning;
	}

	/**
	 * @param depreciationWarning the depreciationWarning to set
	 */
	public void setDepreciationWarning(String depreciationWarning) {
		this.depreciationWarning = depreciationWarning;
	}
}
