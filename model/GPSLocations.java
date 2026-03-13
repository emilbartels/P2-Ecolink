package com.example.demo.model;

public class GPSLocations {
	public GPSLocations(double latitude, double longitude) {
		if(latitude < -90 || latitude > 90) {
			throw new IllegalArgumentException("Needs to be from -90 to 90");
		}
		if(longitude < -180 || longitude > 180) {
			throw new IllegalArgumentException("Needs to be from -180 to 180");
		}
	    this.latitude = latitude;
	    this.longitude = longitude;
	}
	private double latitude, longitude = 0;

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
	
	
	
}
