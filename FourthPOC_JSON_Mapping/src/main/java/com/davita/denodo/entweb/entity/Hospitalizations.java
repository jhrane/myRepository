package com.davita.denodo.entweb.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder ({"dateAdmit", "textAdmit", "dateDischarge", "nameHospital"})
public class Hospitalizations {
	private String dateAdmit;
	private String textAdmit;
	private String dateDischarge;
	private String nameHospital;
	public String getDateAdmit() {
		return dateAdmit;
	}
	public void setDateAdmit(String dateAdmit) {
		this.dateAdmit = dateAdmit;
	}
	public String getTextAdmit() {
		return textAdmit;
	}
	public void setTextAdmit(String textAdmit) {
		this.textAdmit = textAdmit;
	}
	public String getDateDischarge() {
		return dateDischarge;
	}
	public void setDateDischarge(String dateDischarge) {
		this.dateDischarge = dateDischarge;
	}
	public String getNameHospital() {
		return nameHospital;
	}
	public void setNameHospital(String nameHospital) {
		this.nameHospital = nameHospital;
	}
	

}
