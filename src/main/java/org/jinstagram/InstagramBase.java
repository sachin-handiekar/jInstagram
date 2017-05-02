package org.jinstagram;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;
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
import org.jinstagram.http.Request;
import org.jinstagram.http.Response;
import org.jinstagram.http.URLUtils;
import org.jinstagram.http.Verbs;
import org.jinstagram.model.Methods;
import org.jinstagram.model.QueryParam;
import org.jinstagram.model.Relationship;
import org.jinstagram.utils.LogHelper;
import org.jinstagram.utils.PaginationHelper;
import org.jinstagram.utils.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.Proxy;
import java.net.SocketException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.lang.String.format;

/**
 * Instagram base class that performs no authentication
 */
public abstract class InstagramBase implements InstagramClient {

    protected static final String USER_ID_CANNOT_BE_NULL_OR_EMPTY = "UserId cannot be null or empty.";
    protected static final Logger logger = LoggerFactory.getLogger(InstagramBase.class);

    protected final InstagramConfig config;
    private Proxy requestProxy;

    public InstagramBase() {
        this(new InstagramConfig());
    }
    
    public InstagramBase(InstagramConfig config) {
        Preconditions.checkNotNull(config, "config cannot be null");
        this.config = config;
    }

    /**
     * @param requestProxy
     *            the proxy to set
     */
    public void setRequestProxy(Proxy requestProxy) {
        this.requestProxy = requestProxy;
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserInfo(java.lang.String)
     */
    @Override
    public UserInfo getUserInfo(String userId) throws InstagramException {

        logger.info("Getting user info for : " + userId);

        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);

        String apiMethod = format(Methods.USERS_WITH_ID, userId);

        return createInstagramObject(Verbs.GET, UserInfo.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getCurrentUserInfo()
     */
    @Override
    public UserInfo getCurrentUserInfo() throws InstagramException {
        LogHelper.logEntrance(logger, "getCurrentUserInfo", null);

        logger.info("Getting current user info...");

        return createInstagramObject(Verbs.GET, UserInfo.class, Methods.USERS_SELF, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFeeds()
     */
    @Override
    @Deprecated
    public MediaFeed getUserFeeds() throws InstagramException {
        LogHelper.logEntrance(logger, "getUserFeeds", null);

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_FEED, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserRecentMedia()
     */
    @Override
    public MediaFeed getUserRecentMedia() throws InstagramException {
        LogHelper.logEntrance(logger, "getUserRecentMedia", null);
        logger.info("Getting current user recent media...");

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_RECENT_MEDIA, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserRecentMedia(int, java.lang.String, java.lang.String)
     */
    @Override
    public MediaFeed getUserRecentMedia(int count, String minId, String maxId) throws InstagramException {
        LogHelper.logEntrance(logger, "getUserRecentMedia",
                "[ count : " + count + ", minId : " + minId + ", maxId : " + maxId + "]");
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

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFeeds(java.lang.String, java.lang.String, long)
     */
    @Override
    @Deprecated
    public MediaFeed getUserFeeds(String maxId, String minId, long count) throws InstagramException {
        LogHelper.logEntrance(logger, "getUserFeeds",
                "[ maxId : " + maxId + ", minId : " + minId + ", count : " + count + "]");

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

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaFeed(java.lang.String)
     */
    @Override
    public MediaFeed getRecentMediaFeed(String userId) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);

        String methodName = format(Methods.USERS_RECENT_MEDIA, userId);

        return createInstagramObject(Verbs.GET, MediaFeed.class, methodName, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaFeed(java.lang.String, int, java.lang.String, java.lang.String, java.util.Date, java.util.Date)
     */
    @Override
    public MediaFeed getRecentMediaFeed(String userId, int count, String minId, String maxId, Date maxTimeStamp,
            Date minTimeStamp) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);
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

        String methodName = format(Methods.USERS_RECENT_MEDIA, userId);

        return createInstagramObject(Verbs.GET, MediaFeed.class, methodName, params);

    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaNextPage(org.jinstagram.entity.common.Pagination)
     */
    @Override
    public MediaFeed getRecentMediaNextPage(Pagination pagination) throws InstagramException {
        PaginationHelper.Page page = PaginationHelper.parseNextUrl(pagination, config.getApiURL());
        return createInstagramObject(Verbs.GET, MediaFeed.class,
                page.getMethodName(), page.getRawMethodName(), page.getQueryStringParams());
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFeedInfoNextPage(org.jinstagram.entity.common.Pagination)
     */
    @Override
    public UserFeed getUserFeedInfoNextPage(Pagination pagination) throws InstagramException {
        PaginationHelper.Page page = PaginationHelper.parseNextUrl(pagination, config.getApiURL());
        return createInstagramObject(Verbs.GET, UserFeed.class,
                page.getMethodName(), page.getQueryStringParams());
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getTagMediaInfoNextPage(org.jinstagram.entity.common.Pagination)
     */
    @Override
    public TagMediaFeed getTagMediaInfoNextPage(Pagination pagination) throws InstagramException {
        PaginationHelper.Page page = PaginationHelper.parseNextUrl(pagination,config.getApiURL());
        return createInstagramObject(Verbs.GET, TagMediaFeed.class,
                page.getMethodName(), page.getRawMethodName(), page.getQueryStringParams());
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserLikedMediaFeed()
     */
    @Override
    public MediaFeed getUserLikedMediaFeed() throws InstagramException {

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_LIKED_MEDIA, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserLikedMediaFeed(long, int)
     */
    @Override
    public MediaFeed getUserLikedMediaFeed(long maxLikeId, int count) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        if (maxLikeId > 0) {
            params.put(QueryParam.MAX_LIKE_ID, String.valueOf(maxLikeId));
        }

        if (count > 0) {
            params.put(QueryParam.COUNT, String.valueOf(count));
        }

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_LIKED_MEDIA, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchUser(java.lang.String)
     */
    @Override
    public UserFeed searchUser(String query) throws InstagramException {
        Preconditions.checkNotNull(query, "search query cannot be null.");

        Map<String, String> params = new HashMap<String, String>();
        params.put(QueryParam.SEARCH_QUERY, query);

        return createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchUser(java.lang.String, int)
     */
    @Override
    public UserFeed searchUser(String query, int count) throws InstagramException {
        Preconditions.checkNotNull(query, "search query cannot be null.");

        Map<String, String> params = new HashMap<String, String>();
        params.put(QueryParam.SEARCH_QUERY, query);

        if (count > 0) {
            params.put(QueryParam.COUNT, String.valueOf(count));
        }

        return createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SEARCH, params);

    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowList(java.lang.String)
     */
    @Override
    public UserFeed getUserFollowList(String userId) throws InstagramException {
        return getUserFollowListNextPage(userId, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowListNextPage(java.lang.String, java.lang.String)
     */
    @Override
    public UserFeed getUserFollowListNextPage(String userId, String cursor) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);

        Map<String, String> params = new HashMap<String, String>(1);
        if (cursor != null)
            params.put("cursor", cursor);

        String apiMethod = format(Methods.USERS_ID_FOLLOWS, userId);
        return createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowListNextPage(org.jinstagram.entity.common.Pagination)
     */
    @Override
    public UserFeed getUserFollowListNextPage(Pagination pagination) throws InstagramException {
        return getUserFeedInfoNextPage(pagination);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowedByList(java.lang.String)
     */
    @Override
    public UserFeed getUserFollowedByList(String userId) throws InstagramException {
        return getUserFollowedByListNextPage(userId, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowedByListNextPage(java.lang.String, java.lang.String)
     */
    @Override
    public UserFeed getUserFollowedByListNextPage(String userId, String cursor) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);

        Map<String, String> params = new HashMap<String, String>(1);
        if (cursor != null)
            params.put("cursor", cursor);

        String apiMethod = format(Methods.USERS_ID_FOLLOWED_BY, userId);
        return createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserFollowedByListNextPage(org.jinstagram.entity.common.Pagination)
     */
    @Override
    public UserFeed getUserFollowedByListNextPage(Pagination pagination) throws InstagramException {
        return getUserFeedInfoNextPage(pagination);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserRequestedBy()
     */
    @Override
    public UserFeed getUserRequestedBy() throws InstagramException {
        return createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SELF_REQUESTED_BY, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserRelationship(java.lang.String)
     */
    @Override
    public RelationshipFeed getUserRelationship(String userId) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);

        String apiMethod = format(Methods.USERS_ID_RELATIONSHIP, userId);
        return createInstagramObject(Verbs.GET, RelationshipFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#setUserRelationship(java.lang.String, org.jinstagram.model.Relationship)
     */
    @Override
    public RelationshipFeed setUserRelationship(String userId, Relationship relationship) throws InstagramException {
        Preconditions.checkEmptyString(userId, USER_ID_CANNOT_BE_NULL_OR_EMPTY);
        Preconditions.checkNotNull(relationship, "relationship cannot be null.");

        String apiMethod = format(Methods.USERS_ID_RELATIONSHIP, userId);
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.ACTION, relationship.toString());

        return createInstagramObject(Verbs.POST, RelationshipFeed.class, apiMethod, params);

    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getMediaInfo(java.lang.String)
     */
    @Override
    public MediaInfoFeed getMediaInfo(String mediaId) throws InstagramException {
        Preconditions.checkNotNull(mediaId, "mediaId cannot be null.");

        String apiMethod = format(Methods.MEDIA_BY_ID, mediaId);

        return createInstagramObject(Verbs.GET, MediaInfoFeed.class, apiMethod, null);

    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getMediaInfoByShortcode(java.lang.String)
     */
    @Override
    public MediaInfoFeed getMediaInfoByShortcode(String shortcode) throws InstagramException {
        Preconditions.checkNotNull(shortcode, "shortcode cannot be null.");

        String apiMethod = format(Methods.MEDIA_BY_SHORTCODE, shortcode);

        return createInstagramObject(Verbs.GET, MediaInfoFeed.class, apiMethod, null);

    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchMedia(double, double)
     */
    @Override
    public MediaFeed searchMedia(double latitude, double longitude) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.LATITUDE, Double.toString(latitude));
        params.put(QueryParam.LONGITUDE, Double.toString(longitude));

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_SEARCH, params);
    }
    
    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchMedia(double, double, int)
     */
    @Override
    public MediaFeed searchMedia(double latitude, double longitude,  int distance)
            throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.LATITUDE, Double.toString(latitude));
        params.put(QueryParam.LONGITUDE, Double.toString(longitude));

        params.put(QueryParam.DISTANCE, String.valueOf(distance));

        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchMedia(double, double, java.util.Date, java.util.Date, int)
     */
    @Override
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

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getPopularMedia()
     */
    @Override
    @Deprecated
    public MediaFeed getPopularMedia() throws InstagramException {
        return createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_POPULAR, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getMediaComments(java.lang.String)
     */
    @Override
    public MediaCommentsFeed getMediaComments(String mediaId) throws InstagramException {
        String apiMethod = format(Methods.MEDIA_COMMENTS, mediaId);

        return createInstagramObject(Verbs.GET, MediaCommentsFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#setMediaComments(java.lang.String, java.lang.String)
     */
    @Override
    public MediaCommentResponse setMediaComments(String mediaId, String text) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.TEXT, text);

        String apiMethod = format(Methods.MEDIA_COMMENTS, mediaId);
        return createInstagramObject(Verbs.POST, MediaCommentResponse.class, apiMethod, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#deleteMediaCommentById(java.lang.String, java.lang.String)
     */
    @Override
    public MediaCommentResponse deleteMediaCommentById(String mediaId, String commentId) throws InstagramException {
        String apiMethod = format(Methods.DELETE_MEDIA_COMMENTS, mediaId, commentId);
        return createInstagramObject(Verbs.DELETE, MediaCommentResponse.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getUserLikes(java.lang.String)
     */
    @Override
    public LikesFeed getUserLikes(String mediaId) throws InstagramException {
        String apiMethod = format(Methods.LIKES_BY_MEDIA_ID, mediaId);

        return createInstagramObject(Verbs.GET, LikesFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#setUserLike(java.lang.String)
     */
    @Override
    public LikesFeed setUserLike(String mediaId) throws InstagramException {
        String apiMethod = format(Methods.LIKES_BY_MEDIA_ID, mediaId);
        return createInstagramObject(Verbs.POST, LikesFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#deleteUserLike(java.lang.String)
     */
    @Override
    public LikesFeed deleteUserLike(String mediaId) throws InstagramException {
        String apiMethod = format(Methods.LIKES_BY_MEDIA_ID, mediaId);

        return createInstagramObject(Verbs.DELETE, LikesFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getTagInfo(java.lang.String)
     */
    @Override
    public TagInfoFeed getTagInfo(String tagName) throws InstagramException {
        String apiMethod = format(Methods.TAGS_BY_NAME, URLUtils.encodeURIComponent(tagName));
        String rawApiMethod = format(Methods.TAGS_BY_NAME, tagName);
        return createInstagramObject(Verbs.GET, TagInfoFeed.class, apiMethod, rawApiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaTags(java.lang.String)
     */
    @Override
    public TagMediaFeed getRecentMediaTags(String tagName) throws InstagramException {
        return getRecentMediaTags(tagName, 0);
    }

	/* (non-Javadoc)
	 * @see org.jinstagram.InstagramClient#getRecentMediaFeedTags(java.lang.String)
	 */
	@Override
	public MediaFeed getRecentMediaFeedTags(String tagName) throws InstagramException {
		return getRecentMediaFeedTags(tagName, 0);
	}

	/* (non-Javadoc)
		 * @see org.jinstagram.InstagramClient#getRecentMediaTags(java.lang.String, long)
		 */
    @Override
    public TagMediaFeed getRecentMediaTags(String tagName, long count) throws InstagramException {
        return getRecentMediaTags(tagName, null, null, count);
    }

	/* (non-Javadoc)
	 * @see org.jinstagram.InstagramClient#getRecentMediaFeedTags(java.lang.String, long)
	 */
	@Override
	public MediaFeed getRecentMediaFeedTags(String tagName, long count) throws InstagramException {
		return getRecentMediaFeedTags(tagName, null, null, count);
	}

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaTags(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public TagMediaFeed getRecentMediaTags(String tagName, String minTagId, String maxTagId) throws InstagramException {
        return getRecentMediaTags(tagName, minTagId, maxTagId, 0);
    }

	/* (non-Javadoc)
	 * @see org.jinstagram.InstagramClient#getRecentMediaFeedTags(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public MediaFeed getRecentMediaFeedTags(String tagName, String minTagId, String maxTagId) throws InstagramException {
		return getRecentMediaFeedTags(tagName, minTagId, maxTagId, 0);
	}

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaTags(java.lang.String, java.lang.String, java.lang.String, long)
     */
    @Override
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

        String apiMethod = format(Methods.TAGS_RECENT_MEDIA, URLUtils.encodeURIComponent(tagName));
        String rawApiMethod = format(Methods.TAGS_RECENT_MEDIA, tagName);

        return createInstagramObject(Verbs.GET, TagMediaFeed.class, apiMethod, rawApiMethod, params);
    }

	/* (non-Javadoc)
	 * @see org.jinstagram.InstagramClient#getRecentMediaFeedTags(java.lang.String, java.lang.String, java.lang.String, long)
	 */
	@Override
	public MediaFeed getRecentMediaFeedTags(String tagName, String minTagId, String maxTagId, long count)
			throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (!StringUtils.isEmpty(minTagId))
			params.put(QueryParam.MIN_TAG_ID, String.valueOf(minTagId));

		if (!StringUtils.isEmpty(maxTagId))
			params.put(QueryParam.MAX_TAG_ID, String.valueOf(maxTagId));

		if (count != 0) {
			params.put(QueryParam.COUNT, String.valueOf(count));
		}

		String apiMethod = format(Methods.TAGS_RECENT_MEDIA, URLUtils.encodeURIComponent(tagName));
		String rawApiMethod = format(Methods.TAGS_RECENT_MEDIA, tagName);

		return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, rawApiMethod, params);
	}

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaTagsByRegularIds(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    @Deprecated
    public TagMediaFeed getRecentMediaTagsByRegularIds(String tagName, String minId, String maxId)
            throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        if (!StringUtils.isEmpty(minId))
            params.put(QueryParam.MIN_ID, String.valueOf(minId));

        if (!StringUtils.isEmpty(maxId))
            params.put(QueryParam.MAX_ID, String.valueOf(maxId));

        String apiMethod = format(Methods.TAGS_RECENT_MEDIA, URLUtils.encodeURIComponent(tagName));
        String rawApiMethod = format(Methods.TAGS_RECENT_MEDIA, tagName);
        return createInstagramObject(Verbs.GET, TagMediaFeed.class, apiMethod, rawApiMethod, params);
    }

	/* (non-Javadoc)
	 * @see org.jinstagram.InstagramClient#getRecentMediaFeedTagsByRegularIds(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public MediaFeed getRecentMediaFeedTagsByRegularIds(String tagName, String minId, String maxId)
			throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		if (!StringUtils.isEmpty(minId))
			params.put(QueryParam.MIN_ID, String.valueOf(minId));

		if (!StringUtils.isEmpty(maxId))
			params.put(QueryParam.MAX_ID, String.valueOf(maxId));

		String apiMethod = format(Methods.TAGS_RECENT_MEDIA, URLUtils.encodeURIComponent(tagName));
		String rawApiMethod = format(Methods.TAGS_RECENT_MEDIA, tagName);
		return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, rawApiMethod, params);
	}

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchTags(java.lang.String)
     */
    @Override
    public TagSearchFeed searchTags(String tagName) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.SEARCH_QUERY, tagName);

        return createInstagramObject(Verbs.GET, TagSearchFeed.class, Methods.TAGS_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getLocationInfo(java.lang.String)
     */
    @Override
    public LocationInfo getLocationInfo(String locationId) throws InstagramException {
        String apiMethod = format(Methods.LOCATIONS_BY_ID, locationId);

        return createInstagramObject(Verbs.GET, LocationInfo.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaByLocation(java.lang.String)
     */
    @Override
    public MediaFeed getRecentMediaByLocation(String locationId) throws InstagramException {
        String apiMethod = format(Methods.LOCATIONS_RECENT_MEDIA_BY_ID, locationId);

        return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaByLocation(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public MediaFeed getRecentMediaByLocation(String locationId, String minId, String maxId) throws InstagramException {
    	return getRecentMediaByLocation(locationId, minId, maxId, null, null);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#getRecentMediaByLocation(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date)
     */
    @Override
    @Deprecated
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

        String apiMethod = format(Methods.LOCATIONS_RECENT_MEDIA_BY_ID, locationId);

        return createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchLocation(double, double)
     */
    @Override
    public LocationSearchFeed searchLocation(double latitude, double longitude) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.LATITUDE, Double.toString(latitude));
        params.put(QueryParam.LONGITUDE, Double.toString(longitude));

        return createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchLocation(double, double, int)
     */
    @Override
    public LocationSearchFeed searchLocation(double latitude, double longitude, int distance)
            throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.LATITUDE, Double.toString(latitude));
        params.put(QueryParam.LONGITUDE, Double.toString(longitude));
        params.put(QueryParam.DISTANCE, Integer.toString(distance));

        return createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchFoursquareVenue(java.lang.String)
     */
    @Override
    public LocationSearchFeed searchFoursquareVenue(String foursquareId) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.FOURSQUARE_V2_ID, foursquareId);

        return createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH, params);
    }

    /* (non-Javadoc)
     * @see org.jinstagram.InstagramClient#searchFacebookPlace(java.lang.String)
     */
    @Override
    public LocationSearchFeed searchFacebookPlace(String facebookPlacesId) throws InstagramException {
        Map<String, String> params = new HashMap<String, String>();

        params.put(QueryParam.FACEBOOK_PLACES_ID, facebookPlacesId);

        return createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH, params);
    }

    /**
     * Create a instagram object based on class-name and response.
     *
     * This method must be used when signing requests if the methodName
     * could contain characters that required URI encoding
     *
     * @param verbs
     *            HTTP State
     * @param clazz
     * @param methodName
     * @param rawMethodName
     * @param params
     * @return
     * @throws InstagramException
     */
    protected <T extends InstagramObject> T createInstagramObject(Verbs verbs, Class<T> clazz, String methodName,
            String rawMethodName, Map<String, String> params) throws InstagramException {
        Response response;
        String jsonResponseBody;
        try {
            response = getApiResponse(verbs, methodName, rawMethodName, params);

	        if (config.isRetryOnServerError() && wasResponseAnError(response)) {
		        Exception responseException = testResponseBody(response);

		        int numberOfRetries = 2;
		        int retryAttemptNumber = 0;
		        while (responseException != null && retryAttemptNumber < numberOfRetries) {
			        try { Thread.sleep(1000); } catch (InterruptedException e) { /* ignore */ }
			        // Retry request
			        logger.warn("(Retry #{}) Retrying request for {}", retryAttemptNumber, response.getURL());
			        response = getApiResponse(verbs, methodName, rawMethodName, params);
			        responseException = testResponseBody(response);
			        retryAttemptNumber++;
		        }
	        }

			jsonResponseBody = response.getBody();
            LogHelper.prettyPrintJSONResponse(logger, jsonResponseBody);
        } catch (IOException e) {
            throw new InstagramException("IOException while retrieving data", e);
        }

        Map<String, String> responseHeaders = response.getHeaders();
        if (response.getCode() >= 200 && response.getCode() < 300) {
	        T object = createObjectFromResponse(clazz, jsonResponseBody);
            object.setHeaders(responseHeaders);
            return object;
        }

        throw handleInstagramError(response.getCode(), jsonResponseBody, responseHeaders);
    }

	private Exception testResponseBody(Response response) {
		Exception capturedException = null;
		int code = response.getCode();

		try {
			// get response entity, attempt parse as JSON.
			String jsonString = response.getBody();
			new Gson().fromJson(jsonString, JsonObject.class);
		} catch (IllegalStateException e) {
			// this indicates a socket error (e.g. connection reset) when attempting
			// to read HTTP response entity, capture the latest exception to be thrown
			// at the end
			capturedException = e;
			if (e.getCause() instanceof SocketException) {
				logger.warn(
						format("Socket error with HTTP response (code %d).", code),
						e.getCause());
			} else {
				logger.warn(
						format("IllegalState exception with HTTP response (code %d).", code),
						e.getCause());
			}
		} catch (JsonSyntaxException e) {
			// HTTP response body contained malformed JSON
			logger.warn(
					format("HTTP response body contained malformed JSON (code %d).", code),
					response.getCode());
			capturedException = e;
		}

		return capturedException;
	}

	private boolean wasResponseAnError(Response response) {
		return (response.getCode() >= 200 && response.getCode() < 300) || response.getCode() >= 500;
	}

    /**
     * Create a instagram object based on class-name and response.
     *
     * If using signed requests this is only safe if there are no characters
     * requiring URI encoding in the methodName
     *
     * @param verbs
     *            HTTP State
     * @param clazz
     * @param methodName
     * @param params
     * @return
     * @throws InstagramException
     */
    protected <T extends InstagramObject> T createInstagramObject(Verbs verbs, Class<T> clazz, String methodName,
            Map<String, String> params) throws InstagramException {
        return createInstagramObject(verbs, clazz, methodName, methodName, params);
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
            // sending too many requests too quickly;
            // limited to 5000 requests per hour per access_token or client_id
            // overall. (according to spec)
            else if (response.getCode() == 503) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(response.getHeaders());
                error.throwException();
            }
        } catch (JsonSyntaxException e) {
            throw new InstagramException("Failed to decode error response " + responseBody, e, response.getHeaders());
        }
        throw new InstagramException("Unknown error response code: " + response.getCode() + " " + responseBody,
                response.getHeaders());
    }

    protected InstagramException handleInstagramError(long responseCode, String responseBody,
            Map<String, String> responseHeaders) throws InstagramException {
        Gson gson = new Gson();
        final InstagramErrorResponse error;
        try {
            if (responseCode == 400) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(responseHeaders);
                error.throwException();
            }
            // sending too many requests too quickly;
            // limited to 5000 requests per hour per access_token or client_id
            // overall. (according to spec)
            else if (responseCode == 429) {
                error = InstagramErrorResponse.parse(gson, responseBody);
                error.setHeaders(responseHeaders);
                error.throwException();
            }
        } catch (JsonSyntaxException e) {
            throw new InstagramException("Failed to decode error response " + responseBody, e, responseHeaders);
        }
        throw new InstagramException("Unknown error response code: " + responseCode + " " + responseBody,
                responseHeaders);
    }

    /**
     * Get response from Instagram.
     *
     * @param verb
     *            HTTP Verb
     * @param methodName
     *            Instagram API Method
     * @param rawMethodName
     *            Unencoded Instagram API Method
     * @param params
     *            parameters which would be sent with the request.
     * @return Response object.
     */
    protected Response getApiResponse(Verbs verb, String methodName, String rawMethodName, Map<String, String> params) throws IOException {
        Request request=request(verb, methodName, rawMethodName, params);
        logger.debug("Sending request to Instagram...");
        Response response=request.send();
        return response;
    }
    
    protected Request request(Verbs verb, String methodName, String rawMethodName, Map<String, String> params) throws InstagramException {
        String apiResourceUrl = config.getApiURL() + methodName;
        Request request = new Request(verb, apiResourceUrl);

        logger.debug("Creating request for Instagram -  " + request.getUrl());

        configureConnectionSettings(request, config);

        if (requestProxy != null) {
            request.setProxy(requestProxy);
        }

        // Additional parameters in url
        if (params != null) {
            
            params.remove(QueryParam.SIGNATURE); // needs to be recalculated last for every request
            
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (verb == Verbs.GET) {
                    request.addQuerystringParameter(entry.getKey(), entry.getValue());
                } else {
                    request.addBodyParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        
        return request;
    }

    /**
     * Configure the request with the connection settings of config
     * @param request OAuthRequest object
     * @param config InstagramConfig object
     */
    public static void configureConnectionSettings(final Request request, final InstagramConfig config) {
        request.setConnectTimeout(config.getConnectionTimeoutMills(), TimeUnit.MILLISECONDS);
        request.setReadTimeout(config.getReadTimeoutMills(), TimeUnit.MILLISECONDS);

        // #51 Connection Keep Alive
        request.setConnectionKeepAlive(config.isConnectionKeepAlive());
    }

    /**
     * Creates an object from the JSON response and the class which the object
     * would be mapped to.
     *
     * @param clazz
     *            a class instance
     * @param response
     *            a JSON feed
     * @return a object of type <T>
     * @throws InstagramException
     *             if any error occurs.
     */
    public static <T> T createObjectFromResponse(Class<T> clazz, final String response) throws InstagramException {
        Gson gson = new Gson();
        T object;

        try {
	        object = gson.fromJson(response, clazz);
        } catch (Exception e) {
            throw new InstagramException("Error parsing json to object type " + clazz.getName(), e);
        }

        return object;
    }
}
