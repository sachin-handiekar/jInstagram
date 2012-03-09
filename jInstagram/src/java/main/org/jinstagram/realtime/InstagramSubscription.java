package org.jinstagram.realtime;

import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Response;
import org.jinstagram.http.Verbs;
import org.jinstagram.utils.Preconditions;

import com.google.gson.Gson;

public class InstagramSubscription {
	private String aspect;

	private String callback;

	private String clientId;

	private String clientSecret;

	private SubscriptionType subscriptionType;

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

	public SubscriptionResponse createSubscription() throws InstagramException {

		Preconditions.checkEmptyString(clientId, "You must provide a clientId key");
		Preconditions.checkEmptyString(clientSecret, "You must provide a clientSecret");
		Preconditions.checkEmptyString(clientSecret, "You must provide a clientSecret");

		OAuthRequest request = new OAuthRequest(Verbs.POST, Constants.SUBSCRIPTION_ENDPOINT);

		// Add the oauth parameter in the body
		request.addBodyParameter(Constants.CLIENT_ID, this.clientId);
		request.addBodyParameter(Constants.CLIENT_SECRET, this.clientSecret);
		request.addBodyParameter(Constants.SUBSCRIPTION_TYPE, subscriptionType.toString());
		request.addBodyParameter(Constants.ASPECT, "media");
		request.addBodyParameter(Constants.VERIFY_TOKEN, this.verifyToken);
		request.addBodyParameter(Constants.CALLBACK_URL, callback);

		Response response = request.send();

		SubscriptionResponse subscriptionResponse = getSubscriptionResponse(response.getBody());
		return subscriptionResponse;

	}

	  private SubscriptionResponse getSubscriptionResponse(String jsonBody) throws InstagramException {
	        Gson gson = new Gson();
	        SubscriptionResponse response = null;

	        try {
	            response = gson.fromJson(jsonBody, SubscriptionResponse.class);
	        } catch (Exception e) {
	            throw new InstagramException("Error parsing json to object type ");
	        }

	        return response;
	    }



	public void deleteAllSubscription() {

		OAuthRequest request = new OAuthRequest(Verbs.DELETE, Constants.SUBSCRIPTION_ENDPOINT);

		// Add the oauth parameter in the body
		request.addQuerystringParameter(Constants.CLIENT_ID, this.clientId);
		request.addQuerystringParameter(Constants.CLIENT_SECRET, this.clientSecret);
		request.addQuerystringParameter("object", "all");

		Response response = request.send();
		System.out.println(response.getBody());

	}

	public void getSubscriptionList() {
		OAuthRequest request = new OAuthRequest(Verbs.GET, Constants.SUBSCRIPTION_ENDPOINT);

		// Add the oauth parameter in the body
		request.addQuerystringParameter(Constants.CLIENT_ID, this.clientId);
		request.addQuerystringParameter(Constants.CLIENT_SECRET, this.clientSecret);

		Response response = request.send();
		System.out.println(response.getBody());
	}

}
