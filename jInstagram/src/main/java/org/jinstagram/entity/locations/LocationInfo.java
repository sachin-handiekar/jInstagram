package org.jinstagram.entity.locations;

import org.jinstagram.entity.common.Location;

import com.google.gson.annotations.SerializedName;

public class LocationInfo {

	@SerializedName("data")
	private Location locationData;

	public Location getLocationData() {
		return locationData;
	}

	public void setLocationData(Location locationData) {
		this.locationData = locationData;
	}

    @Override
    public String toString() {
        return String.format("LocationInfo [locationData=%s]", locationData);
    }
}
