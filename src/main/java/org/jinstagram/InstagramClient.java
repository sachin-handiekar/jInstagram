package org.jinstagram;

import java.util.Date;

import org.jinstagram.entity.comments.MediaCommentResponse;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.likes.LikesFeed;
import org.jinstagram.entity.locations.LocationInfo;
import org.jinstagram.entity.locations.LocationSearchFeed;
import org.jinstagram.entity.media.MediaInfoFeed;
import org.jinstagram.entity.relationships.RelationshipFeed;
import org.jinstagram.entity.tags.TagInfoFeed;
import org.jinstagram.entity.tags.TagMediaFeed;
import org.jinstagram.entity.tags.TagSearchFeed;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.model.Relationship;

/**
 * Instagram interface
 */
public interface InstagramClient {

    /**
     * Get basic information about a user.
     *
     * @param userId
     *            user-id
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserInfo getUserInfo(String userId) throws InstagramException;

    /**
     * Get basic information about a user.
     *
     * @return a UserInfo object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserInfo getCurrentUserInfo() throws InstagramException;

    /**
     * See the authenticated user's feed.
     *
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated Any app created before Nov 17, 2015 will continue to function
     *             until June 2016. After June 2016, the app will automatically
     *             be moved to Sandbox Mode if it wasn't approved through the
     *             review process. See changelog on Nov 17, 2015
     *
     *             use getUserRecentMedia() instead
     */
    @Deprecated
    MediaFeed getUserFeeds() throws InstagramException;

    /**
     * Get current user's recent media
     *
     * @return a MediaFeedObject
     * @throws InstagramException
     * @author tolstovdmit
     */
    MediaFeed getUserRecentMedia() throws InstagramException;

    /**
     * Get current user's recent media with parameters.
     *
     *
     * @param count
     *            Count of media to return.
     * @param minId
     * @param maxId
     * @return a MediaFeedObject
     * @throws InstagramException
     * @author tolstovdmit
     */
    MediaFeed getUserRecentMedia(int count, String minId, String maxId)
            throws InstagramException;

    /**
     * See the authenticated user's feed
     *
     * @param maxId
     * @param minId
     * @param count
     *            Count of media to return.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated Any app created before Nov 17, 2015 will continue to function
     *             until June 2016. After June 2016, the app will automatically
     *             be moved to Sandbox Mode if it wasn't approved through the
     *             review process. See changelog on Nov 17, 2015
     *
     *             use getUserRecentMedia(int count, String minId, String maxId)
     *             instead
     */
    @Deprecated
    MediaFeed getUserFeeds(String maxId, String minId, long count)
            throws InstagramException;

    /**
     * Get the most recent media published by a user.
     *
     * @param userId
     *            userId of the User.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs
     */
    MediaFeed getRecentMediaFeed(String userId) throws InstagramException;

    /**
     * Get the most recent media published by a user.
     * 
     * @param userId
     * @param count
     * @param minId
     * @param maxId
     * @param maxTimeStamp
     * @param minTimeStamp
     * @return the mediaFeed object
     * @throws InstagramException
     *             if any error occurs
     */
    MediaFeed getRecentMediaFeed(String userId, int count, String minId,
            String maxId, Date maxTimeStamp, Date minTimeStamp)
            throws InstagramException;

    /**
     * Get the next page of recent media objects from a previously executed
     * request
     * 
     * @param pagination
     * @throws InstagramException
     */
    MediaFeed getRecentMediaNextPage(Pagination pagination)
            throws InstagramException;

    /**
     * Get the next page of user feed objects from a previously executed request
     * 
     * @param pagination
     * @throws InstagramException
     */
    UserFeed getUserFeedInfoNextPage(Pagination pagination)
            throws InstagramException;

    /**
     * Get the next page of tagged media objects from a previously executed
     * request
     * 
     * @param pagination
     * @throws InstagramException
     * @deprecated This API is deprecated in favor {@link #getRecentMediaNextPage(Pagination)}. In the
     * next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getTagMediaInfoNextPage(Pagination pagination)
            throws InstagramException;

    /**
     * Get the authenticated user's list of media they've liked.
     *
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaFeed getUserLikedMediaFeed() throws InstagramException;

    /**
     * Get the authenticated user's list of media they've liked.
     *
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaFeed getUserLikedMediaFeed(long maxLikeId, int count)
            throws InstagramException;

    /**
     * Search for a user by name.
     *
     * @param query
     *            A query string.
     * @return a UserFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserFeed searchUser(String query) throws InstagramException;

    /**
     * Search for a user by name.
     *
     * @param query
     *            A query string.
     * @return a UserFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserFeed searchUser(String query, int count) throws InstagramException;

    /**
     * Get the list of 'users' the authenticated user follows.
     *
     * @param userId
     *            userId of the User.
     * @return a UserFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserFeed getUserFollowList(String userId) throws InstagramException;

    /**
     * Get the next page for list of 'users' the authenticated user follows.
     *
     * @throws InstagramException
     */
    UserFeed getUserFollowListNextPage(String userId, String cursor)
            throws InstagramException;

    /**
     * Get the next page for list of 'users' the authenticated user follows.
     *
     * @param pagination
     * @throws InstagramException
     */
    UserFeed getUserFollowListNextPage(Pagination pagination)
            throws InstagramException;

    /**
     * Get the list of 'users' the current given user is followed by.
     *
     * @param userId
     *            userId of the User.
     * @return a UserFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserFeed getUserFollowedByList(String userId) throws InstagramException;

    /**
     * Get the next page for list of 'users' the authenticated is followed by.
     *
     * @param userId
     * @param cursor
     * @throws InstagramException
     */
    UserFeed getUserFollowedByListNextPage(String userId, String cursor)
            throws InstagramException;

    /**
     * Get the next page for list of 'users' the authenticated is followed by.
     *
     * @param pagination
     * @throws InstagramException
     */
    UserFeed getUserFollowedByListNextPage(Pagination pagination)
            throws InstagramException;

    /**
     * Get a list of users who have requested this user's permission to follow
     *
     * @return a UserFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    UserFeed getUserRequestedBy() throws InstagramException;

    /**
     * Get information about the current user's relationship
     * (follow/following/etc) to another user.
     *
     * @param userId
     *            userId of the User.
     * @return a Relationship feed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    RelationshipFeed getUserRelationship(String userId)
            throws InstagramException;

    /**
     * Set the relationship between the current user and the target user
     *
     * @param userId
     *            userId of the user.
     * @param relationship
     *            Relationship status
     * @return a Relationship feed object
     * @throws InstagramException
     *             if any error occurs.
     */
    RelationshipFeed setUserRelationship(String userId,
            Relationship relationship) throws InstagramException;

    /**
     * Get information about a media object.
     *
     * @param mediaId
     *            mediaId of the Media object.
     * @return a mediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaInfoFeed getMediaInfo(String mediaId) throws InstagramException;

    /**
     * Get information about a media object.
     *
     * @param shortcode
     *            shortcode of the Media object.
     * @return a mediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaInfoFeed getMediaInfoByShortcode(String shortcode)
            throws InstagramException;

    /**
     * Search for media in a given area.
     *
     * @param latitude
     *            Latitude of the center search coordinate.
     * @param longitude
     *            Longitude of the center search coordinate.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs
     */
    MediaFeed searchMedia(double latitude, double longitude)
            throws InstagramException;

    /**
     * Search for media in a given area.
     *
     * @param latitude
     *            Latitude of the center search coordinate.
     * @param longitude
     *            Longitude of the center search coordinate.
     * @param distance
     *            Default is 1km (distance=1000), max distance is 5km.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs
     */
    MediaFeed searchMedia(double latitude, double longitude, int distance)
            throws InstagramException;

    /**
     * Search for media in a given area.
     *
     * @param latitude
     *            Latitude of the center search coordinate.
     * @param longitude
     *            Longitude of the center search coordinate.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs
     */
    MediaFeed searchMedia(double latitude, double longitude, Date maxTimeStamp,
            Date minTimeStamp, int distance) throws InstagramException;

    /**
     * Get a list of what media is most popular at the moment.
     *
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated Any app created before Nov 17, 2015 will continue to function
     *             until June 2016. After June 2016, the app will automatically
     *             be moved to Sandbox Mode if it wasn't approved through the
     *             review process. See changelog on Nov 17, 2015
     *
     *             No analog method was offered instead.
     */
    @Deprecated
    MediaFeed getPopularMedia() throws InstagramException;

    /**
     * Get a full list of comments on a media.
     *
     * @param mediaId
     *            a mediaId
     * @return a MediaCommentsFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaCommentsFeed getMediaComments(String mediaId)
            throws InstagramException;

    /**
     * Create a comment on a media.
     *
     * @param mediaId
     *            a mediaId
     * @param text
     *            Text to post as a comment on the media as specified in
     *            media-id.
     * @return a MediaCommentResponse feed.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaCommentResponse setMediaComments(String mediaId, String text)
            throws InstagramException;

    /**
     * Remove a comment either on the authenticated user's media or authored by
     * the authenticated user.
     *
     * @param mediaId
     *            a mediaId of the Media
     * @param commentId
     *            a commentId of the Comment
     * @return a MediaCommentResponse feed.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaCommentResponse deleteMediaCommentById(String mediaId,
            String commentId) throws InstagramException;

    /**
     * Get a list of users who have liked this media.
     *
     * @param mediaId
     *            a mediaId of the Media
     * @return a LikesFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LikesFeed getUserLikes(String mediaId) throws InstagramException;

    /**
     * Set a like on this media by the currently authenticated user.
     *
     * @param mediaId
     *            a mediaId of the Media
     * @return a LikesFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LikesFeed setUserLike(String mediaId) throws InstagramException;

    /**
     * Remove a like on this media by the currently authenticated user.
     *
     * @param mediaId
     *            a mediaId of the Media
     * @return a LikesFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LikesFeed deleteUserLike(String mediaId) throws InstagramException;

    /**
     * Get information about a tag object.
     *
     * @param tagName
     *            name of the tag.
     * @return a TagInfoFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    TagInfoFeed getTagInfo(String tagName) throws InstagramException;

    /**
     * Get a list of recently tagged media.
     *
     * @param tagName
     *            name of the tag.
     * @return a TagMediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated This API is deprecated in favor {@link #getRecentMediaFeedTags(String)}. In the
     * next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getRecentMediaTags(String tagName) throws InstagramException;

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName {@link String}
	 *             the name of the tag
	 * @return {@link MediaFeed}
	 *             the media feed for the first page
	 * @throws InstagramException
	 *             if any error occurs.
	 */
	MediaFeed getRecentMediaFeedTags(String tagName) throws InstagramException;

    /**
     * Get a list of recently tagged media.
     *
     * @param tagName
     *            name of the tag.
     * @param count,
     *            set to 0 to use default
     * @return a TagMediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated This API is deprecated in favor {@link #getRecentMediaFeedTags(String, long)}. In the
     * next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getRecentMediaTags(String tagName, long count)
            throws InstagramException;

	/**
	 * Get at most <em>count</em> number of recently tagged media.
	 *
	 * @param tagName {@link String}
	 *             the name of the tag
	 * @param count {@code int}
	 *             set to 0 to use default
	 * @return {@link MediaFeed}
	 *             the media feed for the first page
	 * @throws InstagramException
	 *             if any error occurs.
	 */
	MediaFeed getRecentMediaFeedTags(String tagName, long count) throws InstagramException;

    /**
     * Get a list of recently tagged media.
     *
     * @param tagName
     *            name of the tag.
     * @param minTagId
     *            (return media before this tag_id), can be null
     * @param maxTagId
     *            (return media before this tag_id), can be null
     * @return a TagMediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated This API is deprecated in favor {@link #getRecentMediaFeedTags(String, String, String)}. In the
     * next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getRecentMediaTags(String tagName, String minTagId,
            String maxTagId) throws InstagramException;

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName
	 *            name of the tag.
	 * @param minTagId
	 *            (return media before this tag_id), can be null
	 * @param maxTagId
	 *            (return media before this tag_id), can be null
	 * @return {@link MediaFeed}
	 *             the media feed for the first page
	 * @throws InstagramException
	 *             if any error occurs.
	 */
	MediaFeed getRecentMediaFeedTags(String tagName, String minTagId, String maxTagId)
			throws InstagramException;

    /**
     * Get a list of recently tagged media.
     *
     * @param tagName
     *            name of the tag.
     * @param minTagId
     *            (return media before this tag_id), can be null
     * @param maxTagId
     *            (return media before this tag_id), can be null
     * @param count,
     *            set to 0 to use default
     * @return a TagMediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated This API is deprecated in favor {@link #getRecentMediaFeedTags(String, String, String, long)}. In the
     * next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getRecentMediaTags(String tagName, String minTagId,
            String maxTagId, long count) throws InstagramException;

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName
	 *            name of the tag.
	 * @param minTagId
	 *            (return media before this tag_id), can be null
	 * @param maxTagId
	 *            (return media before this tag_id), can be null
	 * @param count,
	 *            set to 0 to use default
	 * @return {@link MediaFeed}
	 *             the media feed for the first page
	 * @throws InstagramException
	 *             if any error occurs.
	 */
	MediaFeed getRecentMediaFeedTags(String tagName, String minTagId, String maxTagId, long count)
			throws InstagramException;

    /**
     * Get a list of recently tagged media.
     *
     * @param tagName
     *            name of the tag.
     * @return a TagMediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * @deprecated This API is deprecated in favor {@link #getRecentMediaFeedTagsByRegularIds(String, String, String)}.
     * In the next major version release ({@code 2.0}), both {@link TagMediaFeed} and this API will be removed.
     */
    @Deprecated
    TagMediaFeed getRecentMediaTagsByRegularIds(String tagName, String minId,
            String maxId) throws InstagramException;

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName
	 *            name of the tag.
	 * @return {@link MediaFeed}
	 *             the media feed for the first page
	 * @throws InstagramException
	 *             if any error occurs.
	 */
	MediaFeed getRecentMediaFeedTagsByRegularIds(String tagName, String minId, String maxId)
			throws InstagramException;

    /**
     * Search for tags by name - results are ordered first as an exact match,
     * then by popularity.
     *
     * @param tagName
     *            name of the tag
     * @return a TagSearchFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    TagSearchFeed searchTags(String tagName) throws InstagramException;

    /**
     * Get information about a location.
     *
     * @param locationId
     *            an id of the Location
     * @return a LocationInfo object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LocationInfo getLocationInfo(String locationId) throws InstagramException;

    /**
     * Get a list of recent media objects from a given location.
     *
     * @param locationId
     *            a id of the Media.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaFeed getRecentMediaByLocation(String locationId)
            throws InstagramException;

    /**
     * Get a list of recent media objects from a given location.
     *
     * @param locationId
     *            a id of the Media.
     * @param minId
     *            Return media before this min_id. May be null.
     * @param maxId
     *            Return media before this max_id. May be null.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    MediaFeed getRecentMediaByLocation(String locationId, String minId,
            String maxId) throws InstagramException;

    /**
     * Get a list of recent media objects from a given location.
     *
     * @param locationId
     *            a id of the Media.
     * @param minId
     *            Return media before this min_id. May be null.
     * @param maxId
     *            Return media before this max_id. May be null.
     * @param maxTimeStamp
     *            Return media before this max date. May be null.
     * @param minTimeStamp
     *            Return media after this min date. May be null.
     * @return a MediaFeed object.
     * @throws InstagramException
     *             if any error occurs.
     * 
     * @Deprecated recent media by location request with maxTimeStamp and minTimeStamp parameters was deprecated by instagram
     *              
     */
    MediaFeed getRecentMediaByLocation(String locationId, String minId,
            String maxId, Date maxTimeStamp, Date minTimeStamp)
            throws InstagramException;

    /**
     * Search for a location by geographic coordinate.
     *
     * @param latitude
     *            Latitude of the center search coordinate.
     * @param longitude
     *            Longitude of the center search coordinate.
     * @return a LocationSearchFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LocationSearchFeed searchLocation(double latitude, double longitude)
            throws InstagramException;

    /**
     * Search for a location by geographic coordinate.
     *
     * @param latitude
     *            Latitude of the center search coordinate.
     * @param longitude
     *            Longitude of the center search coordinate.
     * @param distance
     *            Default is 1000m (distance=1000), max distance is 5000.
     * @return a LocationSearchFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LocationSearchFeed searchLocation(double latitude, double longitude,
            int distance) throws InstagramException;

    /**
     * Search for a location by v2 Foursquare id.
     *
     * @param foursquareId
     *            Foursquare Venue ID of the location
     * @return a LocationSearchFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LocationSearchFeed searchFoursquareVenue(String foursquareId)
            throws InstagramException;

    /**
     * Search for a location by Facebook places id.
     *
     * @param facebookPlacesId
     *            Facebook places id of the location
     * @return a LocationSearchFeed object.
     * @throws InstagramException
     *             if any error occurs.
     */
    LocationSearchFeed searchFacebookPlace(String facebookPlacesId)
            throws InstagramException;

}