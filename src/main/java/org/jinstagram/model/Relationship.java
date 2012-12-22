package org.jinstagram.model;

public enum Relationship {
	FOLLOW, UNFOLLOW, BLOCK, UNBLOCK, APPROVE, DENY;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
