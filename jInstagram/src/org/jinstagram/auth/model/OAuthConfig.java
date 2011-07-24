package org.jinstagram.auth.model;

public class OAuthConfig {
	private final String apiKey;

	private final String apiSecret;

	private final String callback;

	private final String display;

	private final String scope;

	public OAuthConfig(String key, String secret) {
		this(key, secret, null, null);
	}

	public OAuthConfig(String key, String secret, String callback, String scope) {
		this(key, secret, callback, scope, null);
	}

	public OAuthConfig(String key, String secret, String callback, String scope, String display) {
		this.apiKey = key;
		this.apiSecret = secret;
		this.callback = (callback != null) ? callback : OAuthConstants.OUT_OF_BAND;
		this.scope = scope;
		this.display = display;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getApiSecret() {
		return apiSecret;
	}

	public String getCallback() {
		return callback;
	}

	public String getScope() {
		return scope;
	}

	public boolean hasScope() {
		return scope != null;
	}

	public String getDisplay() {
		return display;
	}
}
