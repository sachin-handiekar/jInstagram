package org.jinstagram;

import java.util.Scanner;

import org.jinstagram.auth.InstagramAuthService;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.model.Verifier;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.entity.users.basicinfo.UserInfo;

/**
 * @author Sachin Handiekar (sachin.handiekar@gmail.com)
 */
public class InstagramAuthenticationTest {

	public static void main(String[] args) throws Exception {

		String clientId = "44e6baf1dc5d45a082cae725ffa2f36d";
		String clientSecret = "c9209756c7fa49bd9de195eda95f0b54";

		String callbackUrl = "http://reveal-it.appspot.com/oauthtest";

		InstagramService service = new InstagramAuthService()
                                           .apiKey(clientId)
                                           .apiSecret(clientSecret)
				                           .callback(callbackUrl)
                                           .build();

		String authorizationUrl = service.getAuthorizationUrl();

		System.out.println("** Instagram Authorization ** \n\n");

		System.out.println("Copy & Paste the below Authorization URL in your browser...");
		System.out.println("Authorization URL : " + authorizationUrl);

		Scanner sc = new Scanner(System.in);

		String verifierCode;

		System.out.print("Your Verifier Code : ");
		verifierCode = sc.next();

		System.out.println();

		Verifier verifier = new Verifier(verifierCode);
		Token accessToken = service.getAccessToken(verifier);

		System.out.println("Access Token :: " + accessToken.getToken());
		Instagram instagram = new Instagram(accessToken);

		UserInfo userInfo = instagram.getCurrentUserInfo();

		System.out.println("***** User Info ******");
		System.out.println("Username : " + userInfo.getData().getUsername());
		System.out.println("First Name : " + userInfo.getData().getFirstName());
		System.out.println("Last Name : " + userInfo.getData().getLastName());
		System.out.println("Website : " + userInfo.getData().getWebsite());

	}

}
