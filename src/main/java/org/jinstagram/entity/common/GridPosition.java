package org.jinstagram.entity.common;

import com.google.gson.annotations.SerializedName;

public class GridPosition {

	@SerializedName("x")
	private double x;

	@SerializedName("y")
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
