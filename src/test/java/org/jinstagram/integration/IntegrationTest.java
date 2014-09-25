package org.jinstagram.integration;

import java.util.Date;
import java.util.List;

import org.jinstagram.Instagram;
import org.jinstagram.auth.model.Token;
import org.jinstagram.entity.media.MediaInfoFeed;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.jinstagram.exceptions.InstagramException;


public class IntegrationTest {


    public static void main(String[] args) throws InstagramException {
      /*
        String clientId = "44e6baf1dc5d45a082cae725ffa2f36d";
        String clientSecret = "c9209756c7fa49bd9de195eda95f0b54";

        String callbackUrl = "http://reveal-it.appspot.com/oauthtest";

        InstagramService service = new InstagramAuthService().apiKey(clientId)
                .apiSecret(clientSecret).callback(callbackUrl).scope("comments").build();

        String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);

        System.out.println("** Instagram Authorization ** \n\n");

        System.out.println("Copy & Paste the below Authorization URL in your browser...");
        System.out.println("Authorization URL : " + authorizationUrl);

        Scanner sc = new Scanner(System.in);

        String verifierCode;

        System.out.print("Your Verifier Code : ");
        verifierCode = sc.next();

        System.out.println();

        Verifier verifier = new Verifier(verifierCode);
        Token token = service.getAccessToken(EMPTY_TOKEN, verifier);


        System.out.println("Token : " + token.getToken());
                */
        String accessToken = "7073519.44e6baf.d44336e2e99741f6a5bed94b26f1699c";

        Token secretToken  = new Token(accessToken,null);

        Instagram instagram = new Instagram(secretToken);


        UserInfo userInfo = instagram.getCurrentUserInfo();

        MediaFeed mediaFeed =  instagram.getRecentMediaFeed(userInfo.getData().getId());
        // MediaFeed mediaFeed =  instagram.getUserFeeds();

        List<MediaFeedData> mediaList = mediaFeed.getData();

        for(MediaFeedData data : mediaList) {
            System.out.println("data : " + data.getId());

            instagram.setMediaComments(data.getId(), "Comment was created at " + new Date().toString());
        }

        System.out.println("***** User Info ******");
        System.out.println("Username : " + userInfo.getData());

        MediaInfoFeed infoFeed = instagram.getMediaInfoByShortcode("svzdnlDBLs");
        System.out.print("***** Feed Info ******");
        System.out.print("Caption : " + infoFeed.getData().getCaption().getText());
    }
}
