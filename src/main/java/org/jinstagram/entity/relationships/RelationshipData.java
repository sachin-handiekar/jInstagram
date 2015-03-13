package org.jinstagram.entity.relationships;

import com.google.gson.annotations.SerializedName;

public class RelationshipData {
	
	@SerializedName("incoming_status")
	private String incomingStatus;

	@SerializedName("outgoing_status")
	private String outgoingStatus;

	@SerializedName("target_user_is_private")
	private boolean targetUserPrivate;
	
	/**
	 * @return the outgoingStatus
	 */
	public String getOutgoingStatus() {
		return outgoingStatus;
	}

	/**
	 * @param outgoingStatus the outgoingStatus to set
	 */
	public void setOutgoingStatus(String outgoingStatus) {
		this.outgoingStatus = outgoingStatus;
	}

	/**
	 * @param target_user_is_private set user is locked or not
	 */
	public void setTargetUserPrivate(boolean targetUserPrivate){
		this.targetUserPrivate = targetUserPrivate;
	}
	/**
	 * @return the target_user_is_private boolean
	 */
	public boolean isTargetUserPrivate(){
		return targetUserPrivate;
	}
	/**
	 * @return the incomingStatus
	 */
	public String getIncomingStatus() {
		return incomingStatus;
	}

	/**
	 * @param incomingStatus the incomingStatus to set
	 */
	public void setIncomingStatus(String incomingStatus) {
		this.incomingStatus = incomingStatus;
	}

    @Override
    public String toString() {
        return String.format("RelationshipData [incomingStatus=%s, outgoingStatus=%s]", incomingStatus, outgoingStatus);
    }
}
