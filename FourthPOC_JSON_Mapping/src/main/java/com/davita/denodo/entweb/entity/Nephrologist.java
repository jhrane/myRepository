package com.davita.denodo.entweb.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "physicianFirstName", "physicianLastName", "physicianAddress1", "physicianAddress2",
		"physicianCity", "physicianState", "physicianZipCode", "physicianPhoneNumber" })
public class Nephrologist {

	private String physicianFirstName;
	private String physicianLastName;
	private String physicianAddress1;
	private String physicianAddress2;
	private String physicianCity;
	private String physicianState;
	private String physicianZipCode;
	private String physicianPhoneNumber;

	public String getPhysicianFirstName() {
		return physicianFirstName;
	}

	public void setPhysicianFirstName(String physicianFirstName) {
		this.physicianFirstName = physicianFirstName;
	}

	public String getPhysicianLastName() {
		return physicianLastName;
	}

	public void setPhysicianLastName(String physicianLastName) {
		this.physicianLastName = physicianLastName;
	}

	public String getPhysicianAddress1() {
		return physicianAddress1;
	}

	public void setPhysicianAddress1(String physicianAddress1) {
		this.physicianAddress1 = physicianAddress1;
	}

	public String getPhysicianAddress2() {
		return physicianAddress2;
	}

	public void setPhysicianAddress2(String physicianAddress2) {
		this.physicianAddress2 = physicianAddress2;
	}

	public String getPhysicianCity() {
		return physicianCity;
	}

	public void setPhysicianCity(String physicianCity) {
		this.physicianCity = physicianCity;
	}

	public String getPhysicianState() {
		return physicianState;
	}

	public void setPhysicianState(String physicianState) {
		this.physicianState = physicianState;
	}

	public String getPhysicianZipCode() {
		return physicianZipCode;
	}

	public void setPhysicianZipCode(String physicianZipCode) {
		this.physicianZipCode = physicianZipCode;
	}

	public String getPhysicianPhoneNumber() {
		return physicianPhoneNumber;
	}

	public void setPhysicianPhoneNumber(String physicianPhoneNumber) {
		this.physicianPhoneNumber = physicianPhoneNumber;
	}

}
