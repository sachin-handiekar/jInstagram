package org.jinstagram.realtime;

public enum SubscriptionType {
	/**
     * A enum to denote the 'user' subscription type.
     */
	USERS("user"),

	/**
     * A enum to denote the 'tag' subscription type.
	 */
	TAGS("tag"),

	/**
     * A enum to denote the 'location' subscription type.
     */
	LOCATIONS("location"),

	/**
     * A enum to denote the 'geography' subscription type.
     */
	GEOGRAPHIES("geography");

	private String subType;

	private SubscriptionType(String subType) {
		this.subType = subType;
	}

	@Override
	public String toString() {
		return subType;
	}
}
