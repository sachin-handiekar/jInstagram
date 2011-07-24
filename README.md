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

** Getting the Access Token 

		Verifier verifier = new Verifier("verifier you get from the user");
		Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
 
** Creating the Instagram Object

	    Instagram instagram = new Instagram(accessToken);
	    
	    
##Instagram API Endpoints

###Users

** Get basic information about a user.

 		UserInfo userInfo = instagram.getUserInfo(1574083);

		UserInfoData userData = userInfo.getData();
		
		System.out.println("id : " + userData.getId());
		System.out.println("first_name : " + userData.getFirst_name());
		System.out.println("last_name : " + userData.getLast_name());
		System.out.println("profile_picture : " + userData.getProfile_picture());
		System.out.println("website : " + userData.getWebsite());

	}
	
** See the authenticated user's feed.

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

			Comments comments = mediaData.getComments();
			List<CommentData> commentList = comments.getComments();

			for (CommentData comment : commentList) {
				System.out.println("commentId : " + comment.getId());
				System.out.println("created Time : " + comment.getCreatedTime());
				System.out.println("text : " + comment.getText());
				System.out.println("** From **");
				System.out.println("id : " + comment.getCommentFrom().getId());
				System.out.println("full name : " + comment.getCommentFrom().getFullName());
				System.out.println("user name : " + comment.getCommentFrom().getUsername());
				System.out.println("profile picture : " + comment.getCommentFrom().getProfilePicture());
			}

			System.out.println("-- Caption --");

			Caption caption = mediaData.getCaption();

			System.out.println("id : " + caption.getId());
			System.out.println("created time : " + caption.getCreatedTime());
			System.out.println("text : " + caption.getText());
			System.out.println("** From **");
			System.out.println("id : " + caption.getFrom().getId());
			System.out.println("full name : " + caption.getFrom().getFullName());
			System.out.println("user name : " + caption.getFrom().getUsername());
			System.out.println("profile picture : " + caption.getFrom().getProfilePicture());
			System.out.println("-- Likes --");

			Likes likes = mediaData.getLikes();

			System.out.println("count : " + likes.getCount());
			likes.getLikesUserList();
			System.out.println("-- Images --");

			Images images = mediaData.getImages();

			System.out.println("-- Low Resolution Image --");

			ImageData lowResolutionImg = images.getLowResolution();

			System.out.println("url : " + lowResolutionImg.getImageUrl());
			System.out.println("width : " + lowResolutionImg.getImageWidth());
			System.out.println("height : " + lowResolutionImg.getImageHeight());
			System.out.println("-- Location --");

			Location location = mediaData.getLocation();

			System.out.println("id : " + location.getId());
			System.out.println("name : " + location.getName());
			System.out.println("latitude : " + location.getLatitude());
			System.out.println("longitude : " + location.getLongitude());
			System.out.println();
		}


## For more usage, please see the WIKI


###Dependencies

* Google GSON (http://code.google.com/p/google-gson/)