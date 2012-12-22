package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class Pagination {
	@SerializedName("deprecation_warning")
	private String depreciationWarning;

	@SerializedName("min_tag_id")
	private String minTagId;

	@SerializedName("next_max_id")
	private String nextMaxId;

	@SerializedName("next_max_tag_id")
	private String nextMaxTagId;

	@SerializedName("next_min_id")
	private String nextMinId;

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
	public String getNextMaxId() {
		return nextMaxId;
	}

	/**
	 * @param nextMaxId the nextMaxId to set
	 */
	public void setNextMaxId(String nextMaxId) {
		this.nextMaxId = nextMaxId;
	}

	/**
	 * @return the nextMinId
	 */
	public String getNextMinId() {
		return nextMinId;
	}

	/**
	 * @param nextMinId the nextMinId to set
	 */
	public void setNextMinId(String nextMinId) {
		this.nextMinId = nextMinId;
	}

	/**
	 * @return the minTagId
	 */
	public String getMinTagId() {
		return minTagId;
	}

	/**
	 * @param minTagId the minTagId to set
	 */
	public void setMinTagId(String minTagId) {
		this.minTagId = minTagId;
	}

	/**
	 * @return the nextMaxTagId
	 */
	public String getNextMaxTagId() {
		return nextMaxTagId;
	}

	/**
	 * @param nextMaxTagId the nextMaxTagId to set
	 */
	public void setNextMaxTagId(String nextMaxTagId) {
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

    @Override
    public String toString() {
        return String.format("Pagination [depreciationWarning=%s, minTagId=%s, nextMaxId=%s, nextMaxTagId=%s, nextMinId=%s, nextUrl=%s]",
                        depreciationWarning, minTagId, nextMaxId, nextMaxTagId, nextMinId, nextUrl);
    }
}
