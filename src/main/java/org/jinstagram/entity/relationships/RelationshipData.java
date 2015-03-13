package org.jinstagram.entity.relationships;

import com.google.gson.annotations.SerializedName;

public class RelationshipData {
	
	@SerializedName("incoming_status")
	private String incomingStatus;

	@SerializedName("outgoing_status")
	private String outgoingStatus;

	@SerializedName("target_user_is_private")
	private boolean target_user_is_private;
	
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
	public void setTargetUserIsPrivate(boolean target_user_is_private){
		this.target_user_is_private = target_user_is_private;
	}
	/**
	 * @return the target_user_is_private boolean
	 */
	public boolean getTargetUserIsPrivate(){
		return target_user_is_private;
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
