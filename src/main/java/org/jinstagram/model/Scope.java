package org.jinstagram.model;

public enum Scope {

	/**
	 * A field to denote the scope 'basic'
	 *
	 * basic - Be able to read all data related to a user: Following/Followed-By
	 * Lists, Photos, etc. (granted by default)
	 */
	BASIC,

	/**
	 * A field to denote the scope 'comments'
	 *
	 * comments - Be able to create or delete comments on a user's behalf
	 */
	COMMENTS,

	/**
	 * A field to denote the scope 'likes'
	 *
	 * likes - Be able to like and unlike items on a user's behalf
	 */
	LIKES,

	/**
	 * A field to denote the scope 'relationships'
	 *
	 * relationships - Be able to follow and unfollow users on a user's behalf
	 */
	RELATIONSHIPS;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
