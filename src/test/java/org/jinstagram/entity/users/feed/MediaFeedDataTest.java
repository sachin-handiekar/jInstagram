package org.jinstagram.entity.users.feed;

import java.util.ArrayList;
import java.util.List;
import org.jinstagram.entity.common.Caption;
import org.jinstagram.entity.common.Comments;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.Likes;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MediaFeedDataTest</code> contains tests for the class <code>{@link MediaFeedData}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class MediaFeedDataTest {
	/**
	 * Run the MediaFeedData() constructor test.
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testMediaFeedData_1()
		throws Exception {
		MediaFeedData result = new MediaFeedData();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Caption getCaption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetCaption_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Caption result = fixture.getCaption();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Caption [createdTime=null, from=null, id=null, text=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getFrom());
		assertEquals(null, result.getText());
		assertEquals(null, result.getCreatedTime());
	}

	/**
	 * Run the Comments getComments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetComments_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Comments result = fixture.getComments();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Comments [comments=null, count=0]", result.toString());
		assertEquals(0, result.getCount());
		assertEquals(null, result.getComments());
	}

	/**
	 * Run the String getCreatedTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetCreatedTime_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.getCreatedTime();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getImageFilter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetImageFilter_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.getImageFilter();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Images getImages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetImages_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Images result = fixture.getImages();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Images [lowResolution=null, standardResolution=null, thumbnail=null]", result.toString());
		assertEquals(null, result.getStandardResolution());
		assertEquals(null, result.getThumbnail());
		assertEquals(null, result.getLowResolution());
	}

	/**
	 * Run the Likes getLikes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetLikes_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Likes result = fixture.getLikes();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Likes [count=0, likesUserList=null]", result.toString());
		assertEquals(0, result.getCount());
		assertEquals(null, result.getLikesUserList());
	}

	/**
	 * Run the String getLink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetLink_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.getLink();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Location result = fixture.getLocation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Location [id=null, name=null, latitude=0.0, longitude=0.0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
		assertEquals(0.0, result.getLongitude(), 1.0);
		assertEquals(0.0, result.getLatitude(), 1.0);
	}

	/**
	 * Run the List<String> getTags() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetTags_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		List<String> result = fixture.getTags();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the User getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		User result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
		assertEquals("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getProfilePictureUrl());
		assertEquals(null, result.getUserName());
		assertEquals(null, result.getBio());
		assertEquals(null, result.getWebsiteUrl());
	}

	/**
	 * Run the List<UsersInPhoto> getUsersInPhotoList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetUsersInPhotoList_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		List<UsersInPhoto> result = fixture.getUsersInPhotoList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Videos getVideos() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetVideos_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		Videos result = fixture.getVideos();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Videos [lowResolution=null, standardResolution=null]", result.toString());
		assertEquals(null, result.getStandardResolution());
		assertEquals(null, result.getLowResolution());
	}

	/**
	 * Run the boolean isUserHasLiked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testIsUserHasLiked_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		boolean result = fixture.isUserHasLiked();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUserHasLiked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testIsUserHasLiked_2()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(false);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		boolean result = fixture.isUserHasLiked();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCaption(Caption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetCaption_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Caption caption = new Caption();

		fixture.setCaption(caption);

		// add additional test code here
	}

	/**
	 * Run the void setComments(Comments) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetComments_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Comments comments = new Comments();

		fixture.setComments(comments);

		// add additional test code here
	}

	/**
	 * Run the void setCreatedTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetCreatedTime_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		String createdTime = "";

		fixture.setCreatedTime(createdTime);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setImageFilter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetImageFilter_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		String imageFilter = "";

		fixture.setImageFilter(imageFilter);

		// add additional test code here
	}

	/**
	 * Run the void setImages(Images) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetImages_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Images images = new Images();

		fixture.setImages(images);

		// add additional test code here
	}

	/**
	 * Run the void setLikes(Likes) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetLikes_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Likes likes = new Likes();

		fixture.setLikes(likes);

		// add additional test code here
	}

	/**
	 * Run the void setLink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetLink_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		String link = "";

		fixture.setLink(link);

		// add additional test code here
	}

	/**
	 * Run the void setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Location location = new Location();

		fixture.setLocation(location);

		// add additional test code here
	}

	/**
	 * Run the void setTags(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetTags_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		List<String> tags = new ArrayList<String>();

		fixture.setTags(tags);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setUser(User) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		User user = new User();

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUserHasLiked(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetUserHasLiked_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		boolean userHasLiked = true;

		fixture.setUserHasLiked(userHasLiked);

		// add additional test code here
	}

	/**
	 * Run the void setUsersInPhotoList(List<UsersInPhoto>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetUsersInPhotoList_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		List<UsersInPhoto> usersInPhotoList = new ArrayList<UsersInPhoto>();

		fixture.setUsersInPhotoList(usersInPhotoList);

		// add additional test code here
	}

	/**
	 * Run the void setVideos(Videos) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetVideos_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());
		Videos videos = new Videos();

		fixture.setVideos(videos);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MediaFeedData fixture = new MediaFeedData();
		fixture.setId("");
		fixture.setCreatedTime("");
		fixture.setVideos(new Videos());
		fixture.setCaption(new Caption());
		fixture.setUser(new User());
		fixture.setImageFilter("");
		fixture.setImages(new Images());
		fixture.setType("");
		fixture.setTags(new ArrayList<String>());
		fixture.setLink("");
		fixture.setUserHasLiked(true);
		fixture.setUsersInPhotoList(new ArrayList<UsersInPhoto>());
		fixture.setComments(new Comments());
		fixture.setLocation(new Location());
		fixture.setLikes(new Likes());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MediaFeedData [caption=Caption [createdTime=null, from=null, id=null, text=null], comments=Comments [comments=null, count=0], createdTime=, id=, imageFilter=, images=Images [lowResolution=null, standardResolution=null, thumbnail=null], likes=Likes [count=0, likesUserList=null], link=, location=Location [id=null, name=null, latitude=0.0, longitude=0.0], tags=[], type=, user=User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null], userHasLiked=true, usersInPhoto=[]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MediaFeedDataTest.class);
	}
}