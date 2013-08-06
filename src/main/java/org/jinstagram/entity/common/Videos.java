package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class Videos {

	@SerializedName("low_resolution")
	private VideoData lowResolution;


	@SerializedName("standard_resolution")
	private VideoData standardResolution;
	
	
	public VideoData getLowResolution() {
		return lowResolution;
	}

	public void setLowResolution(VideoData lowResolution) {
		this.lowResolution = lowResolution;
	}

	public VideoData getStandardResolution() {
		return standardResolution;
	}

	public void setStandardResolution(VideoData standardResolution) {
		this.standardResolution = standardResolution;
	}
	
    @Override
    public String toString() {
        return String.format("Videos [lowResolution=%s, standardResolution=%s]",
                lowResolution, standardResolution);
    }
}
