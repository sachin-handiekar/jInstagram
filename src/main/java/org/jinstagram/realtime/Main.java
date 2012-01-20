package org.jinstagram.realtime;

import org.jinstagram.exceptions.InstagramException;

public class Main {
	public static void main(String[] args) throws InstagramException {
		
		String clientId = "e27d086b16f94a318b1c15b83a12f09c";
		String clientSecret = "87299d31e637428bb0f78740661c554d";
		 
		String callbackUrl = "http://jinstagram.appspot.com/sub-redirect";
		
		InstagramSubscription sub = new InstagramSubscription()
		.clientId(clientId)
		.clientSecret(clientSecret)
		.object(SubscriptionType.USERS)
		.callback(callbackUrl)
		.verifyToken("sampleService");
		
		
		 sub.getSubscriptionList();
		/*
		 
		SubscriptionResponse response = sub.createSubscription();
		
		System.out.println("Code : " + response.getMeta().getCode());
		System.out.println("\t Data " );
		System.out.println("\t\t Object  : " + response.getData().getObject() );
		System.out.println("\t\t object_id :  " + response.getData().getObjectId() );
		System.out.println("\t\t aspect :  " + response.getData().getAspect() );
		System.out.println("\t\t callback_url :  " + response.getData().getCallbackUrl() );
		System.out.println("\t\t type :  " + response.getData().getType() );
		System.out.println("\t\t id :  " + response.getData().getId() );
		*/
		 
		
	}
}
