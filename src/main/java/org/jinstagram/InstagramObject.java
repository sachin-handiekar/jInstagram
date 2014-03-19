package org.jinstagram;

import java.util.Map;

import org.jinstagram.http.APILimitUtils;

/**
 * InstagramObject is a super abstract class that contains the HTTP headers from Response instance
 * when we create an entity via Instagram.createInstagramObject.
 * 
 * @author Arinto Murdopo
 *
 */
public abstract class InstagramObject implements InstagramResponse{
	
	private Map<String, String> headers;
	
	/**
	 * Package-private method so that Instagram can set HTTP headers 
	 * when creating the entity.
	 * 
	 * @param headers
	 */
	void setHeaders(Map<String, String> headers){
		this.headers = headers;
	}
	
	/**
	 * Get the HTTP headers
	 * @return HTTP headers from the respective Response instance
	 */
	public Map<String, String> getHeaders(){
		return this.headers;
	}
	
	/**
	 * Get the available API limit. It correspond to the value of 
	 * X-Ratelimit-Limit key in HTTP response headers. For Instagram 
	 * v1 API, this method should return 5000.
	 * @return Available API limit
	 */
	public int getAPILimitStatus(){
		return APILimitUtils.getAPILimitStatus(this.headers);
	}
	
	/**
	 * Get the remaining API limit. It correspond to the value of 
	 * X-Ratelimit-Remaining key in HTTP response headers.
	 * @return Remaining API limit
	 */
	public int getRemainingLimitStatus(){
		return APILimitUtils.getRemainingLimitStatus(this.headers);
	}

}
