package com.example.demo.dto;

import java.time.LocalDate;

public class ResponseEcopoint {
	
	private String ID; 
	private String Name;
	private double Latitude;
	private double Longitude;
	private LocalDate TimeForStatusUpdate;
	private LocalDate TimeForConditionUpdate;
	private StatusEcopoint  Status;
	private ConditionEcopoint Condition;

	
	public String getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public double getLatitude() {
		return Latitude;
	}
	public double getLongitude() {
		return Longitude;
	}
	public LocalDate getTimeForStatusUpdate() {
		return TimeForStatusUpdate;
	}
	public LocalDate getTimeForConditionUpdate() {
		return TimeForConditionUpdate;
	}
	public StatusEcopoint  getStatus() {
		return Status;
	}
	public ConditionEcopoint getCondition() {
		return Condition;
	}
}
