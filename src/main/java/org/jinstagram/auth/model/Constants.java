package org.jinstagram.auth.model;

public final class Constants {

    public static final String INSTAGRAM_OAUTH_URL_BASE = "https://api.instagram.com/oauth";

    public static final String ACCESS_TOKEN_ENDPOINT = INSTAGRAM_OAUTH_URL_BASE + "/access_token";

    public static final String AUTHORIZE_URL = INSTAGRAM_OAUTH_URL_BASE + "/authorize/?client_id=%s&redirect_uri=%s&response_type=code";

    public static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL    + "&scope=%s";

    private Constants() {}
}
