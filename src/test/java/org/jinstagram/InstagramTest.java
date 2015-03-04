package org.jinstagram;

import org.jinstagram.auth.model.Token;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationSearchFeed;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Ignore
public class InstagramTest {

    private final Logger logger = LoggerFactory.getLogger(InstagramTest.class);

    private final String ACCESS_TOKEN = "[Add your access token here]";

    private Token token = new Token(ACCESS_TOKEN, null);

    private Instagram instagram = new Instagram(token);

    @Test
    public void testCurrentUserInfo() throws Exception {

        UserInfo userInfo = instagram.getCurrentUserInfo();
        UserInfoData userInfoData = userInfo.getData();

        logger.info("Username : " + userInfoData.getUsername());
        logger.info("Full name : " + userInfoData.getFullName());
        logger.info("Bio : " + userInfoData.getBio());

    }


    @Test
    public void testPopularMedia() throws Exception {

        logger.info("Printing a list of popular media...");
        MediaFeed popularMedia = instagram.getPopularMedia();

        printMediaFeedList(popularMedia.getData());

    }

    @Test
    public void searchLocation() throws Exception {

        // London  - 51.5072° N, 0.1275° W
        double latitude = 51.5072;
        double longitude = 0.1275;

        LocationSearchFeed locationSearchFeed = instagram.searchLocation(latitude, longitude);

        List<Location> locationList = locationSearchFeed.getLocationList();
        logger.info("Printing Location Details for Latitude " + latitude +" and longitude " + longitude);

        for (Location location : locationList) {
            logger.info("-------------------------------------------");

            logger.info("Id : " + location.getId());
            logger.info("Name : " + location.getName());
            logger.info("Latitude : " + location.getLatitude());
            logger.info("Longitude : " + location.getLatitude());

            logger.info("-------------------------------------------");

        }
    }


    private void printMediaFeedList(List<MediaFeedData> mediaFeedDataList) {

        for (MediaFeedData mediaFeedData : mediaFeedDataList) {
            logger.info("-------------------------------------------");

            logger.info("Id : " + mediaFeedData.getId());
            logger.info("Image Filter : " + mediaFeedData.getImageFilter());
            logger.info("Link : " + mediaFeedData.getLink());

            logger.info("-------------------------------------------");


        }
    }

}
