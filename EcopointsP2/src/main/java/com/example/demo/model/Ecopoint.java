package com.example.demo.model;

import java.util.UUID; 

public class Ecopoint {

	private String EcopointID = UUID.randomUUID().toString();
	private String EcopointName;
	private String EcopointAddress;
	private String EcopointMaterial;
	public <EcopointAddress> Ecopoint(String ecopointName, GPSLocations ecopointLocation, StatusEcopoint ecopointStatus, ConditionEcopoint conditionEcopoint, EcopointAddress ecopointAddress, EcopointMaterial ecopointMaterial, OperatingEcopoint ecopointOperating) {
		
		EcopointOperating = EcopointOperating;
		EcopointName = ecopointName;
		EcopointAddress = ecopointAddress;
		EcopointLocation = ecopointLocation;
		EcopointStatus = ecopointStatus;
		EcopointMaterial = ecopointMaterial;
	}
	private GPSLocations EcopointLocation;
	private StatusEcopoint EcopointStatus;
	private ConditionEcopoint EcopointCondition;
	private OperatingEcopoint EcopointOperating;
	
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
	public ConditionEcopoint getEcopointCondition() {
		return EcopointCondition;
	}
	public void setEcopointStatus(StatusEcopoint ecopointStatus) {
		EcopointStatus = ecopointStatus;
	}
	public void setEcopointCondition(ConditionEcopoint ecopointCondition) {
		EcopointCondition = ecopointCondition;
	}
	public String getEcopointAddress() {
		return EcopointAddress;
	}
	public void setEcopointAddress(String ecopointAddress) {
		EcopointAddress = ecopointAddress;
	}
	public String getEcopointMaterial() {
		return EcopointMaterial;
	}
	public void setEcopointMaterial(String ecopointMaterial) {
		EcopointMaterial = ecopointMaterial;
	}
	public OperatingEcopoint getEcopointOperating(){
		return EcopointOperating;
	}
	public void setEcopointOperating(OperatingEcopoint ecopointOperating){
		EcopointOperating = ecopointOperating;	
	}
}