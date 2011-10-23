package org.jinstagram.realtime;

import com.google.gson.Gson;

import org.jinstagram.exceptions.InstagramException;

public class SubscriptionUtil {
  
    
    public static SubscriptionResponseObject[] getSubscriptionResponseData(String jsonBody) throws InstagramException {
    	  Gson gson = new Gson();
    	  SubscriptionResponseObject[] responseData = null;

          try {
        	  responseData = gson.fromJson(jsonBody, SubscriptionResponseObject[].class);
          } catch (Exception e) {
              throw new InstagramException("Error parsing json to object type ");
          }

          return responseData;
    }
    
    
}
