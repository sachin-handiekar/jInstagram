package org.jinstagram;

import org.jinstagram.auth.model.Token;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Ignore
public class InstagramTest {

	private final Logger logger = LoggerFactory.getLogger(InstagramTest.class);

	private final String ACCESS_TOKEN = "-- access token --";

	private Token token = new Token(ACCESS_TOKEN, null);

	private Instagram instagram = new Instagram(token);

	@Test
	public void testCurrentUserInfo() throws Exception {

		UserInfo userInfo = instagram.getCurrentUserInfo();
		UserInfoData userInfoData = userInfo.getData();

		logger.info("Username : " + userInfoData.getUsername());
		logger.info("Full name : " + userInfoData.getFullName());
		logger.info("Bio : " + userInfoData.getBio());
		logger.info("First Name : " + userInfoData.getFullName());
		logger.info("Last Name : " + userInfoData.getFullName());

	}

}
