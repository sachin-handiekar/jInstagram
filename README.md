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

###Users

* Get basic information about a user.

 		UserInfo userInfo = instagram.getUserInfo(1574083);

		UserInfoData userData = userInfo.getData();
		
		System.out.println("id : " + userData.getId());
		System.out.println("first_name : " + userData.getFirst_name());
		System.out.println("last_name : " + userData.getLast_name());
		System.out.println("profile_picture : " + userData.getProfile_picture());
		System.out.println("website : " + userData.getWebsite());

	}
	
* See the authenticated user's feed.

		MediaFeed mediaFeed = instagram.getUserFeeds();
		List<MediaFeedData> mediaFeeds = mediaFeed.getData();

		for (MediaFeedData mediaData : mediaFeeds) {
			System.out.println("id : " + mediaData.getId());
			System.out.println("created time : " + mediaData.getCreatedTime());
			System.out.println("link : " + mediaData.getLink());
			System.out.println("tags : " + mediaData.getTags().toString());
			System.out.println("filter : " + mediaData.getImageFilter());
			System.out.println("type : " + mediaData.getType());
			System.out.println("-- Comments --");

			// Please see the Usage page for more detail...
		}


### Please see the [API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/Usage)

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)

##About me

[LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)

Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)