package org.jinstagram.realtime;

import com.google.gson.annotations.SerializedName;

public class SubscriptionResponseData {

	@SerializedName("object")
	private String object;

	@SerializedName("objectId")
	private long objectId;

	@SerializedName("aspect")
	private String aspect;

	@SerializedName("callbackUrl")
	private String callbackUrl;

	@SerializedName("type")
	private String type;

	@SerializedName("id")
	private long id;

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
	public long getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId the objectId to set
	 */
	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the aspect
	 */
	public String getAspect() {
		return aspect;
	}

	/**
	 * @param aspect the aspect to set
	 */
	public void setAspect(String aspect) {
		this.aspect = aspect;
	}

	/**
	 * @return the callbackUrl
	 */
	public String getCallbackUrl() {
		return callbackUrl;
	}

	/**
	 * @param callbackUrl the callbackUrl to set
	 */
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

}
