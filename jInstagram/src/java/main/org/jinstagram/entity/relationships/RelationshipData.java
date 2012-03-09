package org.jinstagram.entity.relationships;

import com.google.gson.annotations.SerializedName;

public class RelationshipData {
	@SerializedName("incoming_status")
	private String incomingStatus;

	@SerializedName("outgoing_status")
	private String outgoingStatus;

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
