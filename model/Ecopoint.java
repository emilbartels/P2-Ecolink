package com.example.demo.model;

import java.util.UUID; 

public class Ecopoint {

	private String EcopointID = UUID.randomUUID().toString();
	private String EcopointName;
	public Ecopoint(String ecopointName, GPSLocations ecopointLocation, StatusEcopoint ecopointStatus, ConditionEcopoint conditionEcopoint) {
		
		EcopointName = ecopointName;
		EcopointLocation = ecopointLocation;
		EcopointStatus = ecopointStatus;
		ConditionEcopoint = conditionEcopoint;
	}
	private GPSLocations EcopointLocation;
	private StatusEcopoint EcopointStatus;
	private ConditionEcopoint EcopointCondition;
	
	public String getEcopointID() {
		return EcopointID;
	}
	public String getEcopointName() {
		return EcopointName;
	}
	public GPSLocations getEcopointLocation() {
		return EcopointLocation;
	}
	public StatusEcopoint getEcopointStatus() {
		return EcopointStatus;
	}	
	public ConnditionEcopoint getEcopointCondition() {
		return EcopointCondition;
	}
	public void setEcopointStatus(StatusEcopoint ecopointStatus) {
		EcopointStatus = ecopointStatus;
	}
	public void setEcopointCondition(ConditionEcopoint ecopointCondition) {
		EcopointCondition = ecopointCondition;
	}
}