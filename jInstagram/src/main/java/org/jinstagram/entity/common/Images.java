package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class Images {
	@SerializedName("low_resolution")
	private ImageData lowResolution;

	@SerializedName("standard_resolution")
	private ImageData standardResolution;

	@SerializedName("thumbnail")
	private ImageData thumbnail;

	public ImageData getLowResolution() {
		return lowResolution;
	}

	public void setLowResolution(ImageData lowResolution) {
		this.lowResolution = lowResolution;
	}

	public ImageData getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(ImageData thumbnail) {
		this.thumbnail = thumbnail;
	}

	public ImageData getStandardResolution() {
		return standardResolution;
	}

	public void setStandardResolution(ImageData standardResolution) {
		this.standardResolution = standardResolution;
	}

    @Override
    public String toString() {
        return String.format("Images [lowResolution=%s, standardResolution=%s, thumbnail=%s]",
                lowResolution, standardResolution, thumbnail);
    }
}
