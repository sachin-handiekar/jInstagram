package org.jinstagram.realtime;

import com.google.gson.annotations.SerializedName;

public class SubscriptionResponseObject {

	@SerializedName("changed_aspect")
	private String changedAspect;

	@SerializedName("subscription_id")
	private String subscriptionId;

	@SerializedName("object")
	private String object;

	@SerializedName("object_id")
	private String objectId;

	@SerializedName("time")
	private long epochTime;

	/**
	 * @return the changedAspect
	 */
	public String getChangedAspect() {
		return changedAspect;
	}

	/**
	 * @param changedAspect the changedAspect to set
	 */
	public void setChangedAspect(String changedAspect) {
		this.changedAspect = changedAspect;
	}

	/**
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the objectId
	 */
	public String getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId the objectId to set
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the epochTime
	 */
	public long getEpochTime() {
		return epochTime;
	}

	/**
	 * @param epochTime the epochTime to set
	 */
	public void setEpochTime(long epochTime) {
		this.epochTime = epochTime;
	}

}
