package org.jinstagram.entity.users.feed;

import com.google.gson.annotations.SerializedName;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.UsersInPhoto;
import org.jinstagram.entity.common.Videos;

import java.util.List;

/**
 * {@link CarouselMedia} represents an individual image or video in an instagram carousel.
 * <br><br>
 * This object represents any media contained within the carousel and does not differentiate
 * by {@link #type}. Use {@link #getType()} to differentiate <em>image</em> or <em>video</em>.
 *
 * @author abargnesi
 */
public class CarouselMedia {

	@SerializedName("type")
	private String type;

	@SerializedName("images")
	private Images images;

	@SerializedName("videos")
	private Videos videos;

	@SerializedName("users_in_photo")
	private List<UsersInPhoto> usersInPhotoList;

	/**
	 * Return the media type (e.g. <em>image</em> or <em>video</em>).
	 *
	 * @return the media type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the media type.
	 *
	 * @param type the media type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Return the media images.
	 *
	 * @return {@link Images} the media images
	 */
	public Images getImages() {
		return images;
	}

	/**
	 * Set the media images.
	 *
	 * @param images {@link Images} the media images
	 */
	public void setImages(Images images) {
		this.images = images;
	}

	/**
	 * Return the media videos.
	 *
	 * @return {@link Videos} the media videos
	 */
	public Videos getVideos() {
		return videos;
	}

	/**
	 * Set the media videos.
	 *
	 * @param videos {@link Videos} the media videos
	 */
	public void setVideos(Videos videos) {
		this.videos = videos;
	}

	/**
	 * Return the users found in the media.
	 *
	 * @return {@link List} of {@link UsersInPhoto} the users found in the media
	 */
	public List<UsersInPhoto> getUsersInPhotoList() {
		return usersInPhotoList;
	}

	/**
	 * Set the users found in the media.
	 *
	 * @param usersInPhotoList {@link List} of {@link UsersInPhoto} the users found in the media
	 */
	public void setUsersInPhotoList(List<UsersInPhoto> usersInPhotoList) {
		this.usersInPhotoList = usersInPhotoList;
	}

	@Override
	public String toString() {
		return String.format(
				"CarouselMedia [type=%s, images=%s, videos=%s, usersInPhotoList=%s]",
				type, images, videos, usersInPhotoList);
	}
}
