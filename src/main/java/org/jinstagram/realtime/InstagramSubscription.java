package org.jinstagram.realtime;

import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Response;
import org.jinstagram.http.Verbs;
import org.jinstagram.utils.Preconditions;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InstagramSubscription {

	private final Map<String, String> params;

	/**
	 * Default constructor
	 */
	public InstagramSubscription() {
		this.params = new HashMap<String, String>();
		this.params.put(Constants.CALLBACK_URL, OAuthConstants.OUT_OF_BAND);
	}

	/**
	 * Configures the callback url
	 *
	 * @param callback The callback for your application
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription callback(String callback) {
		Preconditions.checkValidUrl(callback, "Invalid Callback Url");

		this.params.put(Constants.CALLBACK_URL, callback);

		return this;
	}

	/**
	 * Configures the clientId
	 *
	 * @param clientId The clientId for your application
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription clientId(String clientId) {
		Preconditions.checkEmptyString(clientId, "Invalid 'clientId' key");

		this.params.put(Constants.CLIENT_ID, clientId);
		
		return this;
	}

	/**
	 * Configure the clientSecret
	 * @param clientSecret The clientSecret for your application
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription clientSecret(String clientSecret) {
		Preconditions.checkEmptyString(clientSecret, "Invalid 'clientSecret' key");

		this.params.put(Constants.CLIENT_SECRET, clientSecret);
		
		return this;
	}

	/**
	 * Configure the subscription type
	 * @param type The subscription type for your usage
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription object(SubscriptionType type) {

		this.params.put(Constants.SUBSCRIPTION_TYPE, type.toString());
	
		return this;
	}

    /**
     * Configures the target id for the subscription, if any. In case of a a real-time tag update, this
     * defines the target tag to use.
     *
     * @param objectId the object to target for this real-time subscription
     * @return the {@link InstagramSubscription} instance for method chaining
     */
    public InstagramSubscription objectId(String objectId) {
    	this.params.put(Constants.OBJECT_ID, objectId);
        return this;
    }

    /**
     * Configure the verifyToken for the subscription
     * 
     * @param verifyToken The token for the subscription
     * @return the {@link InstagramSubscription} instance for method chaining
     */
	public InstagramSubscription verifyToken(String verifyToken) {
		Preconditions.checkEmptyString(verifyToken, "Invalid 'verifyToken' key");

		this.params.put(Constants.VERIFY_TOKEN, verifyToken);

		return this;
	}

	/**
	 * Configure the aspect for the subscription
	 * 
	 * @param aspect The aspect of the subscription
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription aspect(String aspect) {
		Preconditions.checkEmptyString(aspect, "Invalid 'aspect' key");
		
		this.params.put(Constants.ASPECT, aspect);

		return this;
	}
	
	/**
	 * Configure the latitude for geography subscription
	 * @param latitude The latitude for geography subscription
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription latitute(String latitude){
		Preconditions.checkValidLatLong(latitude, "Invalid 'lat' key");
		
		this.params.put(Constants.LATITUDE, latitude);
		
		return this;
	}
	
	/**
	 * Configure the longitude for geography subscription
	 * @param longitude The longitude for geography subscription
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription longitude(String longitude){
		Preconditions.checkValidLatLong(longitude, "Invalid 'lng' key");
		
		this.params.put(Constants.LONGITUDE, longitude);
		
		return this;
	}
	
	/**
	 * Configure the radius for geography subscription
	 * @param radius The radius for geography subscription in metre
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription radius(String radius){
		Preconditions.checkValidRadius(radius, "Invalid 'radius' key");
		
		this.params.put(Constants.RADIUS, radius);
		
		return this;
	}

    /**
     * Creates a subscription with the current state of this instance.
     * <p/>
     * The {@link SubscriptionResponse} holds the result of the subscription such as the identifier
     * of the subscription that can be used later to {@linkplain #deleteSubscription(String) delete it}.
     *
     * @return the result of the subscription
     * @throws InstagramException
     */
	public SubscriptionResponse createSubscription() throws InstagramException {
		String callback = params.get(Constants.CALLBACK_URL);
		if(callback == null){
			callback = "";
		}
		Preconditions.checkEmptyString(callback, "You must provide a callback url");

        final OAuthRequest request = prepareOAuthRequest(Verbs.POST);
		request.addBodyParameter(Constants.ASPECT, "media");
		
		for(Map.Entry<String, String> entry: this.params.entrySet()){
			request.addBodyParameter(entry.getKey(), entry.getValue());
		}

        try {
            final Response response = request.send();
            return getSubscriptionResponse(response.getBody());
        } catch (IOException e) {
            throw new InstagramException("Failed to create subscription", e);
        }
	}

    /**
     * Deletes a subscription with the specified identifier.
     *
     * @param id the id of the subscription to remove
     */
    public SubscriptionResponse deleteSubscription(String id) throws InstagramException {
        final OAuthRequest request = prepareOAuthRequest(Verbs.DELETE);
        request.addQuerystringParameter("id", id);

        try {
            final Response response = request.send();
            return getSubscriptionResponse(response.getBody());
        } catch (IOException e) {
            throw new InstagramException("Failed to delete subscription with id ["+id+"]", e);
        }
    }

    /**
     * Deletes all the known subscription.
     *
     * @return the response of this request, holding mainly the code
     */
	public SubscriptionResponse deleteAllSubscription() throws InstagramException {
        final OAuthRequest request = prepareOAuthRequest(Verbs.DELETE);
		request.addQuerystringParameter(Constants.SUBSCRIPTION_TYPE, "all");

        try {
            final Response response = request.send();
            return getSubscriptionResponse(response.getBody());
        } catch (IOException e) {
            throw new InstagramException("Failed to delete all subscriptions", e);
        }
	}

    /**
     * Returns the currently active subscription.
     *
     * @return the active subscription
     */
	public SubscriptionsListResponse getSubscriptionList() throws InstagramException {
		final OAuthRequest request = prepareOAuthRequest(Verbs.GET);

        try {
            final Response response = request.send();
            return getSubscriptionsListResponse(response.getBody());
        } catch (IOException e) {
            throw new InstagramException("Failed to get subscription list", e);
        }
	}

    private OAuthRequest prepareOAuthRequest(Verbs verb) {
    	String clientId = params.get(Constants.CLIENT_ID);
        Preconditions.checkEmptyString(clientId, "You must provide a clientId key");
  
        String clientSecret = params.get(Constants.CLIENT_SECRET);
        Preconditions.checkEmptyString(clientSecret, "You must provide a clientSecret");

        final OAuthRequest request = new OAuthRequest(verb, Constants.SUBSCRIPTION_ENDPOINT);
        // Add the oauth parameter in the body
        request.addQuerystringParameter(Constants.CLIENT_ID, clientId);
        request.addQuerystringParameter(Constants.CLIENT_SECRET, clientSecret);

        return request;
    }

    private SubscriptionResponse getSubscriptionResponse(String jsonBody) throws InstagramException {
        Gson gson = new Gson();
        SubscriptionResponse response;

        try {
            response = gson.fromJson(jsonBody, SubscriptionResponse.class);
        } catch (Exception e) {
            throw new InstagramException("Error parsing json to object type ");
        }

        return response;
    }

    private SubscriptionsListResponse getSubscriptionsListResponse(String jsonBody) throws InstagramException {
        Gson gson = new Gson();
        SubscriptionsListResponse response = null;

        try {
            response = gson.fromJson(jsonBody, SubscriptionsListResponse.class);
        } catch (Exception e) {
            throw new InstagramException("Error parsing json to object type ");
        }

        return response;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("InstagramSubscription [");
        
        for(Map.Entry<String, String> entry: this.params.entrySet()){
        	builder.append(entry.getKey()).append('=').append(entry.getValue()).append(',');
        }
        int lastIndexOfComma = builder.lastIndexOf(",");
        builder.replace(lastIndexOfComma, lastIndexOfComma + 1, "");
        
        builder.append("]");
        return builder.toString();
    }

}
