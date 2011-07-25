package org.jinstagram;

import com.google.gson.Gson;

import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.auth.model.Token;
import org.jinstagram.entity.comments.MediaCommentsFeed;
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
import org.jinstagram.http.Verbs;
import org.jinstagram.model.Constants;
import org.jinstagram.model.Methods;
import org.jinstagram.model.QueryParam;
import org.jinstagram.model.Relationship;
import org.jinstagram.utils.Preconditions;

import java.util.HashMap;
import java.util.Map;

public class Instagram {
	private Token accessToken;

	public Instagram(Token accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 * @throws InstagramException
	 */
	public UserInfo getUserInfo(long userId) throws InstagramException {
		Preconditions.checkNotNull(userId, "UserId cannot be null.");

		String apiMethod = String.format(Methods.USERS_WITH_ID, userId);
		UserInfo userInfo = this.createInstagramObject(Verbs.GET, UserInfo.class, apiMethod, null);

		return userInfo;
	}

	/**
	 * 
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed getUserFeeds() throws InstagramException {
		MediaFeed userFeed = this.createInstagramObject(Verbs.GET, MediaFeed.class, Methods.USERS_SELF_FEED, null);

		return userFeed;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed getRecentMediaFeed(long userId) throws InstagramException {
		Preconditions.checkNotNull(userId, "UserId cannot be null.");

		String methodName = String.format(Methods.USERS_RECENT_MEDIA, userId);
		MediaFeed recentMediaFeed = this.createInstagramObject(Verbs.GET, MediaFeed.class, methodName, null);

		return recentMediaFeed;
	}

	/**
	 * 
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed getUserLikedMediaFeed() throws InstagramException {
		MediaFeed userLikedMedia = this.createInstagramObject(Verbs.GET, MediaFeed.class,
				Methods.USERS_SELF_LIKED_MEDIA, null);

		return userLikedMedia;
	}

	/**
	 * 
	 * @param query
	 * @return
	 * @throws InstagramException
	 */
	public UserFeed searchUser(String query) throws InstagramException {
		Preconditions.checkNotNull(query, "search query cannot be null.");

		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.SEARCH_QUERY, query);

		UserFeed userFeed = this.createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SEARCH, params);

		return userFeed;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 * @throws InstagramException
	 */
	public UserFeed getUserFollowList(long userId) throws InstagramException {
		Preconditions.checkNotNull(userId, "userId cannot be null.");

		String apiMethod = String.format(Methods.USERS_ID_FOLLOWS, userId);
		UserFeed userFeed = this.createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, null);

		return userFeed;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 * @throws InstagramException
	 */
	public UserFeed getUserFollowedByList(long userId) throws InstagramException {
		Preconditions.checkNotNull(userId, "userId cannot be null.");

		String apiMethod = String.format(Methods.USERS_ID_FOLLOWED_BY, userId);
		UserFeed userFeed = this.createInstagramObject(Verbs.GET, UserFeed.class, apiMethod, null);

		return userFeed;
	}

	/**
	 * 
	 * @return
	 * @throws InstagramException
	 */
	public UserFeed getUserRequestedBy() throws InstagramException {
		UserFeed userFeed = this
				.createInstagramObject(Verbs.GET, UserFeed.class, Methods.USERS_SELF_REQUESTED_BY, null);

		return userFeed;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 * @throws InstagramException
	 */
	public RelationshipFeed getUserRelationship(long userId) throws InstagramException {
		Preconditions.checkNotNull(userId, "userId cannot be null.");

		String apiMethod = String.format(Methods.USERS_ID_RELATIONSHIP, userId);
		RelationshipFeed feed = this.createInstagramObject(Verbs.GET, RelationshipFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param userId
	 * @param relationship
	 * @return
	 * @throws InstagramException
	 */
	public RelationshipFeed setUserRelationship(long userId, Relationship relationship) throws InstagramException {
		Preconditions.checkNotNull(userId, "userId cannot be null.");
		Preconditions.checkNotNull(relationship, "relationship cannot be null.");

		String apiMethod = String.format(Methods.USERS_ID_RELATIONSHIP, userId);
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.ACTION, relationship.toString());

		RelationshipFeed feed = this.createInstagramObject(Verbs.POST, RelationshipFeed.class, apiMethod, params);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public MediaInfoFeed getMediaInfo(long mediaId) throws InstagramException {
		Preconditions.checkNotNull(mediaId, "mediaId cannot be null.");

		String apiMethod = String.format(Methods.MEDIA_BY_ID, mediaId);
		MediaInfoFeed feed = this.createInstagramObject(Verbs.GET, MediaInfoFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed searchMedia(double latitude, double longitude) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));

		MediaFeed mediaFeed = createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_SEARCH, params);

		return mediaFeed;
	}

	/**
	 * 
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed getPopularMedia() throws InstagramException {
		MediaFeed mediaFeed = createInstagramObject(Verbs.GET, MediaFeed.class, Methods.MEDIA_POPULAR, null);

		return mediaFeed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public MediaCommentsFeed getMediaComments(long mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.MEDIA_COMMENTS, mediaId);
		MediaCommentsFeed feed = createInstagramObject(Verbs.GET, MediaCommentsFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @param text
	 * @return
	 * @throws InstagramException
	 */
	public MediaCommentsFeed setMediaComments(long mediaId, String text) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.TEXT, text);

		String apiMethod = String.format(Methods.MEDIA_BY_ID, mediaId);
		MediaCommentsFeed feed = createInstagramObject(Verbs.POST, MediaCommentsFeed.class, apiMethod, params);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @param commentId
	 * @return
	 * @throws InstagramException
	 */
	public MediaCommentsFeed deleteMediaCommentById(long mediaId, long commentId) throws InstagramException {
		String apiMethod = String.format(Methods.DELETE_MEDIA_COMMENTS, mediaId, commentId);
		MediaCommentsFeed feed = createInstagramObject(Verbs.DELETE, MediaCommentsFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public LikesFeed getUserLikes(long mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);
		LikesFeed feed = createInstagramObject(Verbs.GET, LikesFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public LikesFeed setUserLike(long mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);
		LikesFeed feed = createInstagramObject(Verbs.POST, LikesFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public LikesFeed deleteUserLike(long mediaId) throws InstagramException {
		String apiMethod = String.format(Methods.LIKES_BY_MEDIA_ID, mediaId);
		LikesFeed feed = createInstagramObject(Verbs.DELETE, LikesFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param tagName
	 * @return
	 * @throws InstagramException
	 */
	public TagInfoFeed getTagInfo(String tagName) throws InstagramException {
		TagInfoFeed feed = createInstagramObject(Verbs.GET, TagInfoFeed.class, Methods.TAGS_BY_NAME, null);

		return feed;
	}

	/**
	 * 
	 * @param tagName
	 * @return
	 * @throws InstagramException
	 */
	public TagMediaFeed getRecentMediaTags(String tagName) throws InstagramException {
		String apiMethod = String.format(Methods.TAGS_RECENT_MEDIA, tagName);
		TagMediaFeed feed = createInstagramObject(Verbs.GET, TagMediaFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param tagName
	 * @return
	 * @throws InstagramException
	 */
	public TagSearchFeed searchTags(String tagName) throws InstagramException {
		String apiMethod = String.format(Methods.TAGS_SEARCH, tagName);
		TagSearchFeed feed = createInstagramObject(Verbs.GET, TagSearchFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param locationId
	 * @return
	 * @throws InstagramException
	 */
	public LocationInfo getLocationInfo(long locationId) throws InstagramException {
		String apiMethod = String.format(Methods.LOCATIONS_BY_ID, locationId);
		LocationInfo feed = createInstagramObject(Verbs.GET, LocationInfo.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param mediaId
	 * @return
	 * @throws InstagramException
	 */
	public MediaFeed getRecentMediaByLocation(long locationId) throws InstagramException {
		String apiMethod = String.format(Methods.LOCATIONS_RECENT_MEDIA_BY_ID, locationId);
		MediaFeed feed = createInstagramObject(Verbs.GET, MediaFeed.class, apiMethod, null);

		return feed;
	}

	/**
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 * @throws InstagramException
	 */
	public LocationSearchFeed searchLocation(double latitude, double longitude) throws InstagramException {
		Map<String, String> params = new HashMap<String, String>();

		params.put(QueryParam.LATITUDE, Double.toString(latitude));
		params.put(QueryParam.LONGITUDE, Double.toString(longitude));

		LocationSearchFeed feed = createInstagramObject(Verbs.GET, LocationSearchFeed.class, Methods.LOCATIONS_SEARCH,
				params);

		return feed;
	}

	 

	/**
	 * 
	 * @param verbs
	 * @param clazz
	 * @param methodName
	 * @param params
	 * @return
	 * @throws InstagramException
	 */
	private <T> T createInstagramObject(Verbs verbs, Class<T> clazz, String methodName, Map<String, String> params)
			throws InstagramException {
		Response response = getApiResponse(verbs, methodName, params);
		T object = createObjectFromResponse(clazz, response.getBody());

		return object;
	}

 

	/**
	 * 
	 * @param verb
	 * @param methodName
	 * @param params
	 * @return
	 */
	private Response getApiResponse(Verbs verb, String methodName, Map<String, String> params) {
		Response response = null;
		String apiResourceUrl = Constants.API_URL + methodName;
		OAuthRequest request = new OAuthRequest(verb, apiResourceUrl);

		// Additional parameters in url
		if (params != null) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				request.addQuerystringParameter(entry.getKey(), entry.getValue());
			}
		}

		// Add the AccessToken to the Request Url
		request.addQuerystringParameter(OAuthConstants.ACCESS_TOKEN, accessToken.getToken());

		response = request.send();

		return response;
	}

	/**
	 * 
	 * @param clazz
	 * @param response
	 * @return
	 * @throws InstagramException
	 */
	private <T> T createObjectFromResponse(Class<T> clazz, final String response) throws InstagramException {
		Gson gson = new Gson();
		T object = null;

		try {
			object = clazz.newInstance();
			object = gson.fromJson(response, clazz);
		}
		catch (InstantiationException e) {
			throw new InstagramException("Problem in Instantiation of type " + clazz.getName(), e);
		}
		catch (IllegalAccessException e) {
			throw new InstagramException("Couldn't create object of type " + clazz.getName(), e);
		}
		catch (Exception e) {
			throw new InstagramException("Error parsing json to object type " + clazz.getName(), e);
		}

		return object;
	}
}
