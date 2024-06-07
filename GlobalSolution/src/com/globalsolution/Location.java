package com.globalsolution;

public class Location {
	private int id;
	private String name;
	private double latitude;
	private double longitude;
	private String description;

	public Location(int id, String name, double latitude, double longitude, String description) {
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Location{" + "id=" + id + ", name='" + name + '\'' + ", latitude=" + latitude + ", longitude="
				+ longitude + ", description='" + description + '\'' + '}';
	}
}
