#jInstagram

A Java wrapper for the [Instagram API](http://instagram.com/developer/)

###How to use ?

* Getting an OAuth Token

		String clientId = "-- Your Client Id --";
        String clientSecret = "-- Your Client Secret --";
        InstagramService service =	new InstagramAuthService().
            							apiKey(clientId).
            							apiSecret(clientSecret).
            							callback("http://your-callback-url").             
            							build();

** Getting the Authorization Url

		String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);

** Getting the Access Token 

		// verifyCode = Which you have recieved after the user authorizes on Instagram.		
 		Verifier verifier = new Verifier(verifyCode);

		Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
 
** Initiating the Instagram Object



###Dependencies

* Google GSON (http://code.google.com/p/google-gson/)