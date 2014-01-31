package org.jinstagram;

import org.jinstagram.model.Constants;

public class InstagramConfig {
	
	private String baseURI;
	private String version;
	private String apiURL;
	private Integer connectionTimeoutMills;
	
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
	

	public Integer getConnectionTimeoutMills() {
		return connectionTimeoutMills;
	}
	
	public void setConnectionTimeoutMills(Integer connectionTimeoutMills) {
		this.connectionTimeoutMills = connectionTimeoutMills;
	}
}
