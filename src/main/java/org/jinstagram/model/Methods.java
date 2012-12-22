package org.jinstagram.model;

public class Methods {

	/**
	 * Remove a comment either on the authenticated user's media or authored by
	 * the authenticated user.
	 *
	 * Required scope: comments
	 *
	 * DELETE /media/{id}/comments/{id}
	 */
	public static final String DELETE_MEDIA_COMMENTS = "/media/%s/comments/%s";

	/**
	 * Get most recent media from a geography subscription that you created.
	 * Note: you can only access Geographies that were explicitly created by
	 * your OAuth client.
	 */
	public static final String GEOGRAPHIES_RECENT_MEDIA_BY_ID = "/geographies/%s/media/recent";

	/**
	 * Get a list of users who have liked this media.
	 *
	 * Required scope : likes
	 */
	public static final String LIKES_BY_MEDIA_ID = "/media/%s/likes/";

	/**
	 * Get information about a location.
	 */
	public static final String LOCATIONS_BY_ID = "/locations/%s";

	/**
	 * Get a list of recent media objects from a given location.
	 */
	public static final String LOCATIONS_RECENT_MEDIA_BY_ID = "/locations/%s/media/recent/";

	/**
	 * Search for a location by geographic coordinate.
	 */
	public static final String LOCATIONS_SEARCH = "/locations/search";

	/**
	 * Get information about a media object.
	 */
	public static final String MEDIA_BY_ID = "/media/%s";

	/**
	 * Get a full list of comments on a media.
	 *
	 * Required scope: comments
	 */
	public static final String MEDIA_COMMENTS = "/media/%s/comments";

	/**
	 * Get a list of what media is most popular at the moment.
	 */
	public static final String MEDIA_POPULAR = "/media/popular";

	/**
	 * Search for media in a given area.
	 */
	public static final String MEDIA_SEARCH = "/media/search";


	/**
	 * Get information about a tag object.
	 */
	public static final String TAGS_BY_NAME = "/tags/%s";

	/**
	 * Get a list of recently tagged media. Note that this media is ordered by
	 * when the media was tagged with this tag, rather than the order it was
	 * posted. Use the max_tag_id and min_tag_id parameters in the pagination
	 * response to paginate through these objects.
	 */
	public static final String TAGS_RECENT_MEDIA = "/tags/%s/media/recent";

	/**
	 * Search for tags by name - results are ordered first as an exact match,
	 * then by popularity.
	 */
	public static final String TAGS_SEARCH = "/tags/search";

	/**
	 * Get the list of users this user is followed by.
	 *
	 * Required scope: relationships
	 */
	public static final String USERS_ID_FOLLOWED_BY = "/users/%s/followed-by";

	/**
	 * Get the list of users this user follows.
	 *
	 * Required scope: relationships
	 */
	public static final String USERS_ID_FOLLOWS = "/users/%s/follows";

	/**
	 * Get information about the current user's relationship
	 * (follow/following/etc) to another user.
	 *
	 * Required scope: relationships
	 */
	public static final String USERS_ID_RELATIONSHIP = "/users/%s/relationship";

	/**
	 * Get the most recent media published by a user.
	 */
	public static final String USERS_RECENT_MEDIA = "/users/%s/media/recent";

	/**
	 * Search for a user by name.
	 */
	public static final String USERS_SEARCH = "/users/search";

	/**
	 * Get basic information about a user (self).
	 */
	public static final String USERS_SELF = "/users/self";

	/**
	 * See the authenticated user's feed.
	 */
	public static final String USERS_SELF_FEED = "/users/self/feed";

	/**
	 * See the authenticated user's list of media they've liked. Note that this
	 * list is ordered by the order in which the user liked the media. Private
	 * media is returned as long as the authenticated user has permission to
	 * view that media. Liked media lists are only available for the currently
	 * authenticated user.
	 */
	public static final String USERS_SELF_LIKED_MEDIA = "/users/self/media/liked";

	/**
	 * List the users who have requested this user's permission to follow
	 *
	 * Required scope: relationships
	 */
	public static final String USERS_SELF_REQUESTED_BY = "/users/self/requested-by";

	/**
	 * Get basic information about a user.
	 */
	public static final String USERS_WITH_ID = "/users/%s";
}
