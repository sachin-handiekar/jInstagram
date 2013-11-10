package org.jinstagram.realtime;

import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Response;
import org.jinstagram.http.Verbs;
import org.jinstagram.utils.Preconditions;

import com.google.gson.Gson;

import java.io.IOException;

public class InstagramSubscription {
	private String aspect;

	private String callback;

	private String clientId;

	private String clientSecret;

	private SubscriptionType subscriptionType;

    private String objectId;

	private String verifyToken;

	/**
	 * Default constructor
	 */
	public InstagramSubscription() {
		this.callback = OAuthConstants.OUT_OF_BAND;
	}

	/**
	 * Configures the callback url
	 *
	 * @param callback The callback for your application
	 * @return the {@link InstagramSubscription} instance for method chaining
	 */
	public InstagramSubscription callback(String callback) {
		Preconditions.checkValidUrl(callback, "Invalid Callback Url");

		this.callback = callback;

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

		this.clientId = clientId;

		return this;
	}

	public InstagramSubscription clientSecret(String clientSecret) {
		Preconditions.checkEmptyString(clientSecret, "Invalid 'clientSecret' key");

		this.clientSecret = clientSecret;

		return this;
	}

	public InstagramSubscription object(SubscriptionType type) {

		this.subscriptionType = type;

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
        this.objectId = objectId;
        return this;
    }

	public InstagramSubscription verifyToken(String verifyToken) {
		Preconditions.checkEmptyString(verifyToken, "Invalid 'verifyToken' key");

		this.verifyToken = verifyToken;

		return this;
	}

	public InstagramSubscription aspect(String aspect) {
		Preconditions.checkEmptyString(aspect, "Invalid 'aspect' key");

		this.aspect = aspect;

		return this;
	}

    /**
     * Creates a subscription with the current state of this instance.
     * <p/>
     * The {@link SubscriptionResponse} holds the result of the subscription such as the identifier
     * of the subscription that can be used later to {@linkplain #deleteSubscription(long) delete it}.
     *
     * @return the result of the subscription
     * @throws InstagramException
     */
	public SubscriptionResponse createSubscription() throws InstagramException {
		Preconditions.checkEmptyString(callback, "You must provide a callback url");

        final OAuthRequest request = prepareOAuthRequest(Verbs.POST);
		request.addBodyParameter(Constants.SUBSCRIPTION_TYPE, subscriptionType.toString());
        request.addBodyParameter(Constants.OBJECT_ID, objectId);
		request.addBodyParameter(Constants.ASPECT, "media");
		request.addBodyParameter(Constants.VERIFY_TOKEN, this.verifyToken);
		request.addBodyParameter(Constants.CALLBACK_URL, callback);

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
    public SubscriptionResponse deleteSubscription(long id) throws InstagramException {
        final OAuthRequest request = prepareOAuthRequest(Verbs.DELETE);
        request.addQuerystringParameter("id", String.valueOf(id));

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
		request.addQuerystringParameter("object", "all");

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
        Preconditions.checkEmptyString(clientId, "You must provide a clientId key");
        Preconditions.checkEmptyString(clientSecret, "You must provide a clientSecret");

        final OAuthRequest request = new OAuthRequest(verb, Constants.SUBSCRIPTION_ENDPOINT);
        // Add the oauth parameter in the body
        request.addQuerystringParameter(Constants.CLIENT_ID, this.clientId);
        request.addQuerystringParameter(Constants.CLIENT_SECRET, this.clientSecret);

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
        if (aspect != null)
            builder.append("aspect=").append(aspect).append(", ");
        if (callback != null)
            builder.append("callback=").append(callback).append(", ");
        if (clientId != null)
            builder.append("clientId=").append(clientId).append(", ");
        if (clientSecret != null)
            builder.append("clientSecret=").append(clientSecret).append(", ");
        if (subscriptionType != null)
            builder.append("subscriptionType=").append(subscriptionType).append(", ");
        if (verifyToken != null)
            builder.append("verifyToken=").append(verifyToken);
        builder.append("]");
        return builder.toString();
    }

}
