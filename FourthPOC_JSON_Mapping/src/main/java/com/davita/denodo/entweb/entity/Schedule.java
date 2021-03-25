package com.davita.denodo.entweb.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "idDay", "daystr", "shift", "idClinicNumber" })

public class Schedule {

	private String idDay;
	private String daystr;
	private String shift;
	private String idClinicNumber;

	public String getIdDay() {
		return idDay;
	}

	public void setIdDay(String idDay) {
		this.idDay = idDay;
	}

	public String getDaystr() {
		return daystr;
	}

	public void setDaystr(String daystr) {
		this.daystr = daystr;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getIdClinicNumber() {
		return idClinicNumber;
	}

	public void setIdClinicNumber(String idClinicNumber) {
		this.idClinicNumber = idClinicNumber;
	}

}
