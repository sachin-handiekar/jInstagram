package org.jinstagram.auth.model;

public class Constants {
	public static final String ACCESS_TOKEN_ENDPOINT = "https://api.instagram.com/oauth/access_token";

	public static final String AUTHORIZE_URL = "https://api.instagram.com/oauth/authorize/?client_id=%s&redirect_uri=%s&response_type=code";

	public static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL	+ "&scope=%s";
	
	public static final String ACCESS_TOKEN_EXTRACTOR_REGEX = "\"access_token\":\"(\\S*?)\"";
}
