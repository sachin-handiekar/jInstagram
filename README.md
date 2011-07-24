#jInstagram

A Java wrapper for the [Instagram API](http://instagram.com/developer/)

##Usage

* Create the InstagramService object

        InstagramService service =	new InstagramAuthService()
            							.apiKey("your_client_id")
            							.apiSecret("your_client_secret")
            							.callback("your_callback_url")             
            							.build();
            							
         
Note : An empty token can be define as follows -

	     private static final Token EMPTY_TOKEN = null;

* Validate your user against Instagram

		String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);

* Getting the Access Token 

		Verifier verifier = new Verifier("verifier you get from the user");
		Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
 
* Creating the Instagram Object

	    Instagram instagram = new Instagram(accessToken);
	    
	    
##Instagram API Endpoints 

### Please see the [API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/jInstagram-Usage) for more details.

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)

##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)