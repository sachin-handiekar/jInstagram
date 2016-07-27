package org.jinstagram;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.jinstagram.auth.model.OAuthConstants;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.auth.model.Token;
import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.http.Request;
import org.jinstagram.http.Verbs;
import org.jinstagram.model.QueryParam;
import org.jinstagram.utils.EnforceSignedHeaderUtils;
import org.jinstagram.utils.EnforceSignedRequestUtils;
import org.jinstagram.utils.Preconditions;

/**
 * Instagram
 *
 * @author Sachin Handiekar
 * @since 1.0
 */
public class Instagram extends InstagramBase {

    private static final String USING = "Using ";

    private Token accessToken;
    private final String clientId;

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
        super(new InstagramConfig());
        accessToken = new Token(token, secret);
        clientId = null;
        enforceSignature = createEnforceSignature(secret, ips);
    }

    public Instagram(Token accessToken, InstagramConfig config) {
        this(accessToken, null, config);
    }

    /**
     * Create a new Instagram instance only appropriate for unauthenticated
     * requests (i.e. on behalf of the application but not any particular user)
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
     * @param accessToken
     *            the access Token object
     * @param clientId
     *            the client ID for unauthenticated requests
     * @param config
     *            the Instagram Config
     * @throws IllegalArgumentException
     *             if any of the arguments are invalid
     */
    private Instagram(Token accessToken, String clientId, InstagramConfig config) {
        super(config);
        // pre-checks
        Preconditions.checkBothNotNull(accessToken, clientId, "accessToken and clientId cannot both be null");
        if (accessToken == null) {
            Preconditions.checkEmptyString(clientId, "clientId cannot be an empty string");
        } else {
            // accessToken not null, check we have secret if enforcing signed
            // requests
            if (config.isEnforceSignedRequest()) {
                Preconditions.checkEmptyString(accessToken.getSecret(), "enforce signed requests need a client secret");
            }
        }

        this.accessToken = accessToken;
        this.clientId = clientId;
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
     * @param accessToken
     *            the accessToken to set
     */
    public void setAccessToken(Token accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    protected OAuthRequest request(Verbs verb, String methodName, String rawMethodName, Map<String, String> params) throws InstagramException {
        Request request=super.request(verb, methodName, rawMethodName, params);
        OAuthRequest result=new OAuthRequest(request.getVerb(), request.getUrl());
        result.setCharset(request.getCharset());
        result.setConnectionKeepAlive(request.getConnectionKeepAlive());
        result.setConnectTimeout(request.getConnectTimeoutInMillis(), TimeUnit.MILLISECONDS);
        result.setProxy(request.getProxy());
        result.setReadTimeout(request.getReadTimeoutInMillis(), TimeUnit.MILLISECONDS);
        
        // Additional parameters in url
        if (verb == Verbs.GET) {
            for(Map.Entry<String, String> entry : request.getQueryStringParams().entrySet())
                result.addQuerystringParameter(entry.getKey(), entry.getValue());
        } else {
            for(Map.Entry<String, String> entry : request.getBodyParams().entrySet())
                result.addBodyParameter(entry.getKey(), entry.getValue());
        }
    
        // Add the AccessToken to the Request Url
        if ((verb == Verbs.GET) || (verb == Verbs.DELETE)) {
            if (accessToken == null) {
                logger.debug(USING + OAuthConstants.CLIENT_ID + " : " + clientId);
                result.addQuerystringParameter(OAuthConstants.CLIENT_ID, clientId);
            } else {
                logger.debug(USING + OAuthConstants.ACCESS_TOKEN + " : " + accessToken.getToken());
                result.addQuerystringParameter(OAuthConstants.ACCESS_TOKEN, accessToken.getToken());
            }
        } else {
            if (accessToken == null) {
                logger.debug(USING + OAuthConstants.CLIENT_ID + " : " + clientId);
                result.addBodyParameter(OAuthConstants.CLIENT_ID, clientId);
            } else {
                logger.debug(USING + OAuthConstants.ACCESS_TOKEN + " : " + accessToken.getToken());
                result.addBodyParameter(OAuthConstants.ACCESS_TOKEN, accessToken.getToken());
            }
        }

        // check if we are enforcing a signed request and add the 'sig'
        // parameter.  Must use rawMethodName here (i.e. sign the non-URI-encoded version).
        if (config.isEnforceSignedRequest()) {
            boolean useQueryParam = (verb == Verbs.GET) || (verb == Verbs.DELETE);

            Map<String,String> sigParams = useQueryParam ? result.getQueryStringParams() : result.getBodyParams();

            String sig = EnforceSignedRequestUtils.signature(rawMethodName,
                                    sigParams, accessToken != null ? accessToken.getSecret() : null);

            if (useQueryParam) {
                result.addQuerystringParameter(QueryParam.SIGNATURE, sig);
            } else {
                result.addBodyParameter(QueryParam.SIGNATURE, sig);
            }
        }
        
        return result;
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
}
