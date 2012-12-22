package org.jinstagram.entity.locations;

import java.util.List;

import org.jinstagram.entity.common.Location;

import com.google.gson.annotations.SerializedName;

public class LocationSearchFeed {

	@SerializedName("data")
	private List<Location> locationList;

	/**
	 * @return the locationList
	 */
	public List<Location> getLocationList() {
		return locationList;
	}

	/**
	 * @param locationList
	 *            the locationList to set
	 */
	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}

    @Override
    public String toString() {
        return String.format("LocationSearchFeed [locationList=%s]", locationList);
    }
}
