package org.jinstagram;

import java.io.IOException;
import java.net.Proxy;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.auth.model.Token;
import org.jinstagram.entity.comments.MediaCommentResponse;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.entity.common.InstagramErrorResponse;
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
import org.jinstagram.http.Response;
import org.jinstagram.http.URLUtils;
import org.jinstagram.http.Verbs;
import org.jinstagram.model.Methods;
import org.jinstagram.model.QueryParam;
import org.jinstagram.model.Relationship;
import org.jinstagram.utils.EnforceSignedHeaderUtils;
import org.jinstagram.utils.EnforceSignedRequestUtils;
import org.jinstagram.utils.LogHelper;
import org.jinstagram.utils.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Instagram
 *
 * @author Sachin Handiekar
 * @since 1.0
 */
public class Instagram {

	private static final Logger logger = LoggerFactory.getLogger(Instagram.class);

	private Token accessToken;
	private final String clientId;
	private final InstagramConfig config;
	private Proxy requestProxy;

	@Deprecated
	private String enforceSignature;

	public Instagram(Token accessToken) {
		this(accessToken, null, new InstagramConfig());
	}

	public Instagram(String token, String secret) {
		this(new Token(token, secret), null, new InstagramConfig());
	}

	@Deprecated
	public Instagram(String token, String secret, String ips) {
		this.accessToken = new Token(token, secret);
		clientId = null;
		config = new InstagramConfig();
		enforceSignature = createEnforceSignature(secret, ips);
	}

	public Instagram(Token accessToken, InstagramConfig config) {
		this(accessToken, null, config);
	}

	/**
	 * Create a new Instagram instance only appropriate for unauthenticated requests (i.e. on behalf of the
	 * application but not any particular user)
	 */
	public Instagram(String clientId) {
		this(null, clientId, new InstagramConfig());
	}

	public Instagram(String clientId, InstagramConfig config) {
		this(null, clientId, config);
	}

	/**
	 * Private constructor
	 *
	 * @param accessToken the access Token object
	 * @param clientId the client ID for unauthenticated requests
	 * @param config the Instagram Config
	 * @throws IllegalArgumentException if any of the arguments are invalid
	 */
	private Instagram(Token accessToken, String clientId, InstagramConfig config) {
		// pre-checks
		Preconditions.checkBothNotNull(accessToken, clientId, "accessToken and clientId cannot both be null");
		Preconditions.checkNotNull(config, "config cannot be null");
		if (accessToken == null) {
			Preconditions.checkEmptyString(clientId, "clientId cannot be an empty string");
		} else {
			// accessToken not null, check we have secret if enforcing signed requests
			if (config.isEnforceSignedRequest()) {
				Preconditions.checkEmptyString(accessToken.getSecret(), "enforce signed requests need a client secret");
			}
		}

		this.accessToken = accessToken;
		this.clientId = clientId;
		this.config = config;
	}

	public InstagramConfig getInstagramConfig() {
		return config;
	}

	/**
	 * @return the accessToken
	 */
	public Token getAccessToken() {
		return accessToken;
	}
	
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(Token accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @param requestProxy the proxy to set
	 */
	public void setRequestProxy(Proxy requestProxy) {
		this.requestProxy = requestProxy;
	}

    /**
	 * Get basic information about a user.
	 *
	 * @param userId user-id
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserInfo getUserInfo(String userId) throws InstagramException {

		logger.info("Getting user info for : " + userId);

		Preconditions.checkEmptyString(userId, "UserId cannot be null or empty.");

		String apiMethod = String.format(Methods.USERS_WITH_ID, userId);

		return createInstagramObject(Verbs.GET, UserInfo.class, apiMethod, null);
    }

	/**
	 * Get basic information about a user.
	 *
	 * @return a UserInfo object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserInfo getCurrentUserInfo() throws InstagramException {
        LogHelper.logEntrance(logger, "getCurrentUserInfo", null);

        logger.info("Getting current user info...");

        return createInstagramObject(Verbs.GET, UserInfo.class, Methods.USERS_SELF, null);
    }

	/**
	 * See the authenticated user's feed.
	 *
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
     * @deprecated Any app created before Nov 17, 2015
     * will continue to function until June 2016.
     * After June 2016, the app will automatically
     * be moved to Sandbox Mode if it wasn't approved
     * through the review process.
     * See changelog on Nov 17, 2015
     *
     * use getUserRecentMedia() instead
	 */
    @Deprecated
	public MediaFeed getUserFeeds() throws InstagramException {
        LogHelper.logEntrance(logger, "getUserFeeds", null);

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_FEED, null);
    }

    /**
     * Get current user's recent media
     *
     * @return a MediaFeedObject
     * @throws InstagramException
     * @author tolstovdmit
     */
    public MediaFeed getUserRecentMedia() throws InstagramException{
        LogHelper.logEntrance(logger, "getUserRecentMedia", null);
        logger.info("Getting current user recent media...");

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_RECENT_MEDIA, null);
    }

    /**
     * Get current user's recent media with parameters.
     *
     *
     * @param count Count of media to return.
     * @param minId
     * @param maxId
     * @return a MediaFeedObject
     * @throws InstagramException
     * @author tolstovdmit
     */
    public MediaFeed getUserRecentMedia(int count, String minId, String maxId) throws InstagramException {
        LogHelper.logEntrance(logger, "getUserRecentMedia", "[ count : " + count + ", minId : " + minId + ", maxId : " + maxId + "]");
        logger.info("Getting current user recent media...");

        Map<String, String> params = new HashMap<String, String>();

        if (maxId != null) {
            params.put(QueryParam.MAX_ID, String.valueOf(maxId));
        }

        if (minId != null) {
            params.put(QueryParam.MIN_ID, String.valueOf(minId));
        }

        if (count != 0) {
            params.put(QueryParam.COUNT, String.valueOf(count));
        }

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_RECENT_MEDIA, params);
    }

	/**
	* See the authenticated user's feed
	*
	* @param maxId
	* @param minId
	* @param count Count of media to return.
	* @return a MediaFeed object.
	* @throws InstagramException if any error occurs.
    * @deprecated Any app created before Nov 17, 2015
    * will continue to function until June 2016.
    * After June 2016, the app will automatically
    * be moved to Sandbox Mode if it wasn't approved
    * through the review process.
    * See changelog on Nov 17, 2015
    *
    * use getUserRecentMedia(int count, String minId, String maxId) instead
	*/
    @Deprecated
	public MediaFeed getUserFeeds(String maxId, String minId, long count) throws InstagramException {
        LogHelper.logEntrance(logger, "getUserFeeds", "[ maxId : " + maxId + ", minId : " + minId + ", count : " + count + "]");

        Map<String, String> params = new HashMap<String, String>();

		if (maxId != null) {
			params.put(QueryParam.MAX_ID, String.valueOf(maxId));
		}

		if (minId != null) {
			params.put(QueryParam.MIN_ID, String.valueOf(minId));
		}

		if (count != 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_FEED, params);

    }

	/**
	 * Get the most recent media published by a user.
	 *
	 * @param userId userId of the User.
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs
	 */
	public MediaFeed getRecentMediaFeed(String userId) throws InstagramException {
		Preconditions.checkEmptyString(userId, "UserId cannot be null or empty.");


		String methodName = String.format(Methods.USERS_RECENT_MEDIA, userId);

		return createInstagramObject(Verbs.GET, MediaFeed.class, methodName, null);
    }

	/**
	 * Get the most recent media published by a user.
	 * @param userId
	 * @param count
	 * @param minId
	 * @param maxId
	 * @param maxTimeStamp
	 * @param minTimeStamp
	 * @return the mediaFeed object
	 * @throws InstagramException if any error occurs
	 */
	public MediaFeed getRecentMediaFeed(String userId, int count, String minId, String maxId, Date maxTimeStamp,
			Date minTimeStamp) throws InstagramException {
		Preconditions.checkEmptyString(userId, "UserId cannot be null or empty.");
		Map<String, String> params = new HashMap<String, String>();

		if (maxId != null) {
			params.put(QueryParam.MAX_ID, String.valueOf(maxId));
		}

		if (minId != null) {
			params.put(QueryParam.MIN_ID, String.valueOf(minId));
		}

		if (count != 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

		if (maxTimeStamp != null) {
			params.put(QueryParam.MAX_TIMESTAMP, String.valueOf(maxTimeStamp.getTime() / 1000));
		}

		if (minTimeStamp != null) {
			params.put(QueryParam.MIN_TIMESTAMP, String.valueOf(minTimeStamp.getTime() / 1000));
		}

		String methodName = String.format(Methods.USERS_RECENT_MEDIA, userId);

		return createInstagramObject(Verbs.GET, MediaFeed.class, methodName, params);

    }

	/**
	 * Get the next page of recent media objects from a previously executed request
	 * @param pagination
	 * @throws InstagramException
	 */
	public MediaFeed getRecentMediaNextPage(Pagination pagination) throws InstagramException {
		return createInstagramObject(Verbs.GET, MediaFeed.class,
				StringUtils.removeStart(pagination.getNextUrl(), config.getApiURL()), null);
	}

	/**
	 * Get the next page of user feed objects from a previously executed request
	 * @param pagination
	 * @throws InstagramException
	 */
	public UserFeed getUserFeedInfoNextPage(Pagination pagination) throws InstagramException {
		return createInstagramObject(Verbs.GET, UserFeed.class,
				StringUtils.removeStart(pagination.getNextUrl(), config.getApiURL()), null);
	}

	/**
	 * Get the next page of tagged media objects from a previously executed request
	 * @param pagination
	 * @throws InstagramException
	 */
	public TagMediaFeed getTagMediaInfoNextPage(Pagination pagination) throws InstagramException {
		return createInstagramObject(Verbs.GET, TagMediaFeed.class,
				StringUtils.removeStart(pagination.getNextUrl(), config.getApiURL()), null);
	}

	/**
	 * Get the authenticated user's list of media they've liked.
	 *
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaFeed getUserLikedMediaFeed() throws InstagramException {

		return  createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_LIKED_MEDIA,
                null);
	}

	/**
	 * Get the authenticated user's list of media they've liked.
	 *
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaFeed getUserLikedMediaFeed(long maxLikeId, int count) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (maxLikeId > 0) {
			params.put(QueryParam.MAX_LIKE_ID, String.valueOf(maxLikeId));
		}

		if (count > 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

		return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_LIKED_MEDIA,
                params);
	}

	/**
	 * Search for a user by name.
	 *
	 * @param query A query string.
	 * @return a UserFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserFeed searchUser(String query) throws InstagramException {
		Preconditions.checkNotNull(query, "search query cannot be null.");

		Map<String, String> params = new HashMap<String, String>();
		params.put(QueryParam.SEARCH_QUERY, query);

		return createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SEARCH, params);
    }

	/**
	 * Search for a user by name.
	 *
	 * @param query A query string.
	 * @return a UserFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserFeed searchUser(String query, int count) throws InstagramException {
		Preconditions.checkNotNull(query, "search query cannot be null.");

		Map<String, String> params = new HashMap<String, String>();
		params.put(QueryParam.SEARCH_QUERY, query);

		if (count > 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

		return createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SEARCH, params);

    }

	/**
	 * Get the list of 'users' the authenticated user follows.
	 *
	 * @param userId userId of the User.
	 * @return a UserFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserFeed getUserFollowList(String userId) throws InstagramException {
	    return getUserFollowListNextPage(userId, null);
    }

    /**
     * Get the next page for list of 'users' the authenticated user follows.
     *
     * @throws InstagramException
     */
    public UserFeed getUserFollowListNextPage(String userId, String cursor) throws InstagramException {
        Preconditions.checkEmptyString(userId, "userId cannot be null or empty.");
        
        Map<String,String> params=new HashMap<String,String>(1);
        if(cursor != null)
            params.put("cursor", cursor);

        String apiMethod = String.format(Methods.USERS_ID_FOLLOWS, userId);
        UserFeed userFeed = createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, params);
        
        return userFeed;
    }
    /**
     * Get the next page for list of 'users' the authenticated user follows.
     *
     * @param pagination
     * @throws InstagramException
     */
    public UserFeed getUserFollowListNextPage(Pagination pagination) throws InstagramException {
        return getUserFeedInfoNextPage(pagination);
    }

	/**
	 * Get the list of 'users' the current given user is followed by.
	 *
	 * @param userId userId of the User.
	 * @return a UserFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserFeed getUserFollowedByList(String userId) throws InstagramException {
	    return getUserFollowedByListNextPage(userId, null);
	}

    /**
     * Get the next page for list of 'users' the authenticated is followed by.
     *
     * @param pagination
     * @throws InstagramException
     */
    public UserFeed getUserFollowedByListNextPage(String userId, String cursor) throws InstagramException {
        Preconditions.checkEmptyString(userId, "userId cannot be null or empty.");
        
        Map<String,String> params=new HashMap<String,String>(1);
        if(cursor != null)
            params.put("cursor", cursor);
        
        String apiMethod = String.format(Methods.USERS_ID_FOLLOWED_BY, userId);
        UserFeed userFeed = createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, params);

        return userFeed;
    }

    /**
     * Get the next page for list of 'users' the authenticated is followed by.
     *
     * @param pagination
     * @throws InstagramException
     */
    public UserFeed getUserFollowedByListNextPage(Pagination pagination) throws InstagramException {
        return getUserFeedInfoNextPage(pagination);
    }

	/**
	 * Get a list of users who have requested this user's permission to follow
	 *
	 * @return a UserFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public UserFeed getUserRequestedBy() throws InstagramException {
		UserFeed userFeed = createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SELF_REQUESTED_BY, null);

		return userFeed;
	}

	/**
	 * Get information about the current user's relationship
	 * (follow/following/etc) to another user.
	 *
	 * @param userId userId of the User.
	 * @return a Relationship feed object.
	 * @throws InstagramException if any error occurs.
	 */
	public RelationshipFeed getUserRelationship(String userId) throws InstagramException {
		Preconditions.checkEmptyString(userId, "userId cannot be null or empty.");

		String apiMethod = String.format(Methods.USERS_ID_RELATIONSHIP, userId);
		RelationshipFeed feed = createInstagramObject(Verbs.GET, RelationshipFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * Set the relationship between the current user and the target user
	 *
	 * @param userId userId of the user.
	 * @param relationship Relationship status
	 * @return a Relationship feed object
	 * @throws InstagramException if any error occurs.
	 */
	public RelationshipFeed setUserRelationship(String userId, Relationship relationship) throws InstagramException {
		Preconditions.checkEmptyString(userId, "userId cannot be null or empty.");
		Preconditions.checkNotNull(relationship, "relationship cannot be null.");

		String apiMethod = String.format(Methods.USERS_ID_RELATIONSHIP, userId);
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.ACTION, relationship.toString());

		return createInstagramObject(Verbs.POST, RelationshipFeed.class, apiMethod, params);

    }

	/**
	 * Get information about a media object.
	 *
	 * @param mediaId mediaId of the Media object.
	 * @return a mediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaInfoFeed getMediaInfo(String mediaId) throws InstagramException {
		Preconditions.checkNotNull(mediaId, "mediaId cannot be null.");

		String apiMethod = String.format(Methods.MEDIA_BY_ID, mediaId);

		return createInstagramObject(Verbs.GET, MediaInfoFeed.class, apiMethod, null);

    }

	/**
	 * Get information about a media object.
	 *
	 * @param shortcode shortcode of the Media object.
	 * @return a mediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaInfoFeed getMediaInfoByShortcode(String shortcode) throws InstagramException {
		Preconditions.checkNotNull(shortcode, "shortcode cannot be null.");

		String apiMethod = String.format(Methods.MEDIA_BY_SHORTCODE, shortcode);

		return createInstagramObject(Verbs.GET, MediaInfoFeed.class, apiMethod, null);

    }

	/**
	 * Search for media in a given area.
	 *
	 * @param latitude Latitude of the center search coordinate.
	 * @param longitude Longitude of the center search coordinate.
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs
	 */
	public MediaFeed searchMedia(double latitude, double longitude) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_SEARCH, params);
    }

	/**
	 * Search for media in a given area.
	 *
	 * @param latitude Latitude of the center search coordinate.
	 * @param longitude Longitude of the center search coordinate.
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs
	 */
	public MediaFeed searchMedia(double latitude, double longitude, Date maxTimeStamp, Date minTimeStamp, int distance)
			throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));

		if (maxTimeStamp != null) {
			params.put(QueryParam.MAX_TIMESTAMP, String.valueOf(maxTimeStamp.getTime() / 1000));
		}

		if (minTimeStamp != null) {
			params.put(QueryParam.MIN_TIMESTAMP, String.valueOf(minTimeStamp.getTime() / 1000));
		}

		params.put(QueryParam.DISTANCE, String.valueOf(distance));

 		return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_SEARCH, params);
    }

	/**
	 * Get a list of what media is most popular at the moment.
	 *
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
     * @deprecated Any app created before Nov 17, 2015
     * will continue to function until June 2016.
     * After June 2016, the app will automatically
     * be moved to Sandbox Mode if it wasn't approved
     * through the review process.
     * See changelog on Nov 17, 2015
     *
     * No analog method was offered instead.
	 */
    @Deprecated
	public MediaFeed getPopularMedia() throws InstagramException {
		MediaFeed mediaFeed = createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_POPULAR, null);

		return mediaFeed;
	}

	/**
	 * Get a full list of comments on a media.
	 *
	 * @param mediaId a mediaId
	 * @return a MediaCommentsFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaCommentsFeed getMediaComments(String mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.MEDIA_COMMENTS, mediaId);

		return  createInstagramObject(Verbs.GET, MediaCommentsFeed.class, apiMethod, null);
	}

	/**
	 * Create a comment on a media.
	 *
	 * @param mediaId a mediaId
	 * @param text Text to post as a comment on the media as specified in
	 * media-id.
	 * @return a MediaCommentResponse feed.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaCommentResponse setMediaComments(String mediaId, String text) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.TEXT, text);

		String apiMethod = String.format(Methods.MEDIA_COMMENTS, mediaId);
		return createInstagramObject(Verbs.POST, MediaCommentResponse.class, apiMethod, params);
    }

	/**
	 * Remove a comment either on the authenticated user's media or authored by
	 * the authenticated user.
	 *
	 * @param mediaId a mediaId of the Media
	 * @param commentId a commentId of the Comment
	 * @return a MediaCommentResponse feed.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaCommentResponse deleteMediaCommentById(String mediaId, String commentId) throws InstagramException {
		String apiMethod = String.format(Methods.DELETE_MEDIA_COMMENTS, mediaId, commentId);
		return createInstagramObject(Verbs.DELETE, MediaCommentResponse.class, apiMethod, null);
	}

	/**
	 * Get a list of users who have liked this media.
	 *
	 * @param mediaId a mediaId of the Media
	 * @return a LikesFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LikesFeed getUserLikes(String mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);

        return createInstagramObject(Verbs.GET, LikesFeed.class, apiMethod, null);
    }

	/**
	 * Set a like on this media by the currently authenticated user.
	 *
	 * @param mediaId a mediaId of the Media
	 * @return a LikesFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LikesFeed setUserLike(String mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);
 		return createInstagramObject(Verbs.POST, LikesFeed.class, apiMethod, null);
    }

	/**
	 * Remove a like on this media by the currently authenticated user.
	 *
	 * @param mediaId a mediaId of the Media
	 * @return a LikesFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LikesFeed deleteUserLike(String mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);

 		return createInstagramObject(Verbs.DELETE, LikesFeed.class, apiMethod, null);
    }

	/**
	 * Get information about a tag object.
	 *
	 * @param tagName name of the tag.
	 * @return a TagInfoFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagInfoFeed getTagInfo(String tagName) throws InstagramException {
		String apiMethod = String.format(Methods.TAGS_BY_NAME, tagName);
 		return createInstagramObject(Verbs.GET, TagInfoFeed.class, apiMethod, null);
    }

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName name of the tag.
	 * @return a TagMediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagMediaFeed getRecentMediaTags(String tagName) throws InstagramException {
		return getRecentMediaTags(tagName, 0);
	}

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName name of the tag.
	 * @param count, set to 0 to use default
	 * @return a TagMediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagMediaFeed getRecentMediaTags(String tagName, long count) throws InstagramException {
		return getRecentMediaTags(tagName, null, null, count);
	}

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName name of the tag.
	 * @param minTagId (return media before this tag_id), can be null
	 * @param maxTagId (return media before this tag_id), can be null
	 * @return a TagMediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagMediaFeed getRecentMediaTags(String tagName, String minTagId, String maxTagId) throws InstagramException {
		return getRecentMediaTags(tagName, minTagId, maxTagId, 0);
	}

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName name of the tag.
	 * @param minTagId (return media before this tag_id), can be null
	 * @param maxTagId (return media before this tag_id), can be null
	 * @param count, set to 0 to use default
	 * @return a TagMediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagMediaFeed getRecentMediaTags(String tagName, String minTagId, String maxTagId, long count)
			throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (!StringUtils.isEmpty(minTagId))
			params.put(QueryParam.MIN_TAG_ID, String.valueOf(minTagId));

		if (!StringUtils.isEmpty(maxTagId))
			params.put(QueryParam.MAX_TAG_ID, String.valueOf(maxTagId));

		if (count != 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

        String apiMethod = String.format(Methods.TAGS_RECENT_MEDIA, URLUtils.encodeURIComponent(tagName));

        return createInstagramObject(Verbs.GET, TagMediaFeed.class, apiMethod, params);
    }

	/**
	 * Get a list of recently tagged media.
	 *
	 * @param tagName name of the tag.
	 * @return a TagMediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	@Deprecated
	public TagMediaFeed getRecentMediaTagsByRegularIds(String tagName, String minId, String maxId)
			throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (!StringUtils.isEmpty(minId))
			params.put(QueryParam.MIN_ID, String.valueOf(minId));

		if (!StringUtils.isEmpty(maxId))
			params.put(QueryParam.MAX_ID, String.valueOf(maxId));

		String apiMethod = String.format(Methods.TAGS_RECENT_MEDIA, tagName);
;
        return createInstagramObject(Verbs.GET, TagMediaFeed.class, apiMethod, params);
    }

	/**
	 * Search for tags by name - results are ordered first as an exact match,
	 * then by popularity.
	 *
	 * @param tagName name of the tag
	 * @return a TagSearchFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public TagSearchFeed searchTags(String tagName) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.SEARCH_QUERY, tagName);

 		return createInstagramObject(Verbs.GET, TagSearchFeed.class, Methods.TAGS_SEARCH, params);
    }

	/**
	 * Get information about a location.
	 *
	 * @param locationId an id of the Location
	 * @return a LocationInfo object.
	 * @throws InstagramException if any error occurs.
	 */
	public LocationInfo getLocationInfo(String locationId) throws InstagramException {
		String apiMethod = String.format(Methods.LOCATIONS_BY_ID, locationId);

 		return createInstagramObject(Verbs.GET, LocationInfo.class, apiMethod, null);
    }

	/**
	 * Get a list of recent media objects from a given location.
	 *
	 * @param locationId a id of the Media.
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaFeed getRecentMediaByLocation(String locationId) throws InstagramException {
		String apiMethod = String.format(Methods.LOCATIONS_RECENT_MEDIA_BY_ID, locationId);

 		return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, null);
    }

	/**
	 * Get a list of recent media objects from a given location.
	 *
	 * @param locationId a id of the Media.
	 * @param minId Return media before this min_id. May be null.
	 * @param maxId Return media before this max_id. May be null.
	 * @param maxTimeStamp Return media before this max date. May be null.
	 * @param minTimeStamp Return media after this min date. May be null.
	 * @return a MediaFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public MediaFeed getRecentMediaByLocation(String locationId, String minId, String maxId, Date maxTimeStamp,
			Date minTimeStamp) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (maxTimeStamp != null) {
			params.put(QueryParam.MAX_TIMESTAMP, String.valueOf(maxTimeStamp.getTime() / 1000));
		}

		if (minTimeStamp != null) {
			params.put(QueryParam.MIN_TIMESTAMP, String.valueOf(minTimeStamp.getTime() / 1000));
		}

		if (minId != null)
			params.put(QueryParam.MIN_ID, minId);

		if (maxId != null)
			params.put(QueryParam.MAX_ID, maxId);

		String apiMethod = String.format(Methods.LOCATIONS_RECENT_MEDIA_BY_ID, locationId);

        return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, params);
    }

	/**
	 * Search for a location by geographic coordinate.
	 *
	 * @param latitude Latitude of the center search coordinate.
	 * @param longitude Longitude of the center search coordinate.
	 * @return a LocationSearchFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LocationSearchFeed searchLocation(double latitude, double longitude) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));

		return createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH, params);
	}

	/**
	 * Search for a location by geographic coordinate.
	 *
	 * @param latitude Latitude of the center search coordinate.
	 * @param longitude Longitude of the center search coordinate.
	 * @param distance Default is 1000m (distance=1000), max distance is 5000.
	 * @return a LocationSearchFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LocationSearchFeed searchLocation(double latitude, double longitude, int distance) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));
		params.put(QueryParam.DISTANCE, Integer.toString(distance));

		LocationSearchFeed feed = createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH,
				params);

		return feed;
	}

	/**
	 * Search for a location by v2 Foursquare id.
	 *
	 * @param foursquareId Foursquare Venue ID of the location
	 * @return a LocationSearchFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LocationSearchFeed searchFoursquareVenue(String foursquareId) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.FOURSQUARE_V2_ID, foursquareId);

		LocationSearchFeed feed = createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH,
				params);

		return feed;
	}

	/**
	 * Search for a location by Facebook places id.
	 *
	 * @param facebookPlacesId Facebook places id of the location
	 * @return a LocationSearchFeed object.
	 * @throws InstagramException if any error occurs.
	 */
	public LocationSearchFeed searchFacebookPlace(String facebookPlacesId) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.FACEBOOK_PLACES_ID, facebookPlacesId);

		LocationSearchFeed feed = createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH,
				params);

		return feed;
	}

	/**
	 * Create a instagram object based on class-name and response.
	 *
	 * @param verbs HTTP State
	 * @param clazz
	 * @param methodName
	 * @param params
	 * @return
	 * @throws InstagramException
	 */
	protected <T extends InstagramObject> T createInstagramObject(Verbs verbs, Class<T> clazz, String methodName,
			Map<String, String> params) throws InstagramException {
		Response response;
        String jsonResponseBody;
 		try {
			response = getApiResponse(verbs, methodName, params);
            jsonResponseBody = response.getBody();
            LogHelper.prettyPrintJSONResponse(logger, jsonResponseBody);
		} catch (IOException e) {
			throw new InstagramException("IOException while retrieving data", e);
		}

        Map<String, String> responseHeaders = response.getHeaders();;
		if (response.getCode() >= 200 && response.getCode() < 300) {
			T object = createObjectFromResponse(clazz, jsonResponseBody);
			object.setHeaders(responseHeaders);
			return object;
		}

        throw handleInstagramError(response.getCode(), jsonResponseBody, responseHeaders);
	}

    @Deprecated
	protected InstagramException handleInstagramError(Response response) throws InstagramException {
		Gson gson = new Gson();
		final InstagramErrorResponse error;
        String responseBody = response.getBody();
        try {
			if (response.getCode() == 400) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(response.getHeaders());
                error.throwException();
			}
			//sending too many requests too quickly;
			//limited to 5000 requests per hour per access_token or client_id overall.  (according to spec)
			else if (response.getCode() == 503) {
				error = InstagramErrorResponse.parse(gson, responseBody);
				error.setHeaders(response.getHeaders());
				error.throwException();
			}
		} catch (JsonSyntaxException e) {
			throw new InstagramException("Failed to decode error response " + responseBody, e,
					response.getHeaders());
		}
		throw new InstagramException("Unknown error response code: " + response.getCode() + " " + responseBody,
				response.getHeaders());
	}

    protected InstagramException handleInstagramError(long responseCode, String responseBody, Map<String,String> responseHeaders) throws InstagramException {
        Gson gson = new Gson();
        final InstagramErrorResponse error;
        try {
            if (responseCode == 400) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(responseHeaders);
                error.throwException();
            }
            //sending too many requests too quickly;
            //limited to 5000 requests per hour per access_token or client_id overall.  (according to spec)
            else if (responseCode == 429) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(responseHeaders);
                error.throwException();
            }
        } catch (JsonSyntaxException e) {
            throw new InstagramException("Failed to decode error response " + responseBody, e,
                    responseHeaders);
        }
        throw new InstagramException("Unknown error response code: " + responseCode + " " + responseBody,
                responseHeaders);
    }

	/**
	 * Get response from Instagram.
	 *
	 * @param verb HTTP Verb
	 * @param methodName Instagram API Method
	 * @param params parameters which would be sent with the request.
	 * @return Response object.
	 */
	protected Response getApiResponse(Verbs verb, String methodName, Map<String, String> params) throws IOException {
		Response response;
		String apiResourceUrl = config.getApiURL() + methodName;
		OAuthRequest request = new OAuthRequest(verb, apiResourceUrl);

        logger.debug("Creating request for Instagram -  " + request.getUrl());

        configureConnectionSettings(request, config);

		if (requestProxy != null) {
			request.setProxy(requestProxy);
		}

		// Additional parameters in url
		if (params != null) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				if (verb == Verbs.GET) {
					request.addQuerystringParameter(entry.getKey(), entry.getValue());
				} else {
					request.addBodyParameter(entry.getKey(), entry.getValue());
				}
			}
		}

		// Add the AccessToken to the Request Url
		if ((verb == Verbs.GET) || (verb == Verbs.DELETE)) {
			if (accessToken == null) {
                logger.debug("Using " + OAuthConstants.CLIENT_ID + " : " + clientId);
				request.addQuerystringParameter(OAuthConstants.CLIENT_ID, clientId);
			} else {
                logger.debug("Using " + OAuthConstants.ACCESS_TOKEN + " : " + accessToken.getToken());
                request.addQuerystringParameter(OAuthConstants.ACCESS_TOKEN, accessToken.getToken());
			}
		} else {
			if (accessToken == null) {
                logger.debug("Using " + OAuthConstants.CLIENT_ID + " : " + clientId);
                request.addBodyParameter(OAuthConstants.CLIENT_ID, clientId);
			} else {
                logger.debug("Using " + OAuthConstants.ACCESS_TOKEN + " : " + accessToken.getToken());
                request.addBodyParameter(OAuthConstants.ACCESS_TOKEN, accessToken.getToken());
			}
		}

		// check if we are enforcing a signed request and add the 'sig' parameter
		if (config.isEnforceSignedRequest()) {
			if ((verb == Verbs.GET) || (verb == Verbs.DELETE)) {
				request.addQuerystringParameter(QueryParam.SIGNATURE, EnforceSignedRequestUtils.signature(methodName, request.getQueryStringParams(), accessToken.getSecret()));
			} else {
				request.addBodyParameter(QueryParam.SIGNATURE, EnforceSignedRequestUtils.signature(methodName, request.getBodyParams(), accessToken.getSecret()));
			}
		}

        logger.debug("Sending request to Instagram...");
        response = request.send();

		return response;
	}

    /** configure the request with the connection settings of config */
    public static void configureConnectionSettings(final OAuthRequest request, final InstagramConfig config) {
        request.setConnectTimeout(config.getConnectionTimeoutMills(), TimeUnit.MILLISECONDS);
		request.setReadTimeout(config.getReadTimeoutMills(), TimeUnit.MILLISECONDS);

        // #51 Connection Keep Alive
        request.setConnectionKeepAlive(config.isConnectionKeepAlive());
    }

	@Deprecated
	protected String createEnforceSignature(String secret, String ips) {
		if (null != ips) {
			try {
				String signature = EnforceSignedHeaderUtils.signature(secret, ips);
				return ips + "|" + signature;
			} catch (InstagramException e) {
				// do nothing
			}
		}
		return null;
	}

	/**
	 * Creates an object from the JSON response and the class which the object would be mapped to.
	 *
	 * @param clazz a class instance
	 * @param response a JSON feed
	 * @return a object of type <T>
	 * @throws InstagramException if any error occurs.
	 */
	protected <T> T createObjectFromResponse(Class<T> clazz, final String response) throws InstagramException {
		Gson gson = new Gson();
		T object;

		try {
			object = gson.fromJson(response, clazz);
		}  catch (Exception e) {
			throw new InstagramException("Error parsing json to object type " + clazz.getName(), e);
		}

		return object;
	}
}
