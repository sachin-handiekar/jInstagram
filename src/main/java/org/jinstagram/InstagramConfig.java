package org.jinstagram;

import org.jinstagram.model.Constants;

public class InstagramConfig {

    private String baseURI;
    private String version;
    private String apiURL;
    private int connectionTimeoutMills = 0;
    private int readTimeoutMills = 0;
    private boolean connectionKeepAlive = false;
    private boolean enforceSignedRequest = false;

    public InstagramConfig() {
        baseURI = Constants.BASE_URI;
        version = Constants.VERSION;
        apiURL = Constants.API_URL;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
        apiURL = String.format("%s/%s", baseURI, version);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        apiURL = String.format("%s/%s", baseURI, version);
    }

    public String getApiURL() {
        return apiURL;
    }

    public int getConnectionTimeoutMills() {
        return connectionTimeoutMills;
    }

    public void setConnectionTimeoutMills(int connectionTimeoutMills) {
        this.connectionTimeoutMills = connectionTimeoutMills;
    }

    public int getReadTimeoutMills() {
        return readTimeoutMills;
    }

    public void setReadTimeoutMills(int readTimeoutMills) {
        this.readTimeoutMills = readTimeoutMills;
    }

    public boolean isConnectionKeepAlive() {
        return connectionKeepAlive;
    }

    public void setConnectionKeepAlive(boolean connectionKeepAlive) {
        this.connectionKeepAlive = connectionKeepAlive;
    }

    public boolean isEnforceSignedRequest() {
        return enforceSignedRequest;
    }

    public void setEnforceSignedRequest(boolean enforceSignedRequest) {
        this.enforceSignedRequest = enforceSignedRequest;
    }
}
