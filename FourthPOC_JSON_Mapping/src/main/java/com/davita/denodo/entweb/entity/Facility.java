package com.davita.denodo.entweb.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "fac_name", "facilityid", "facility_no", "fac_address", "fac_address2", "fac_city", "fac_state",
		"fac_statelong", "fac_zip", "fac_county", "fac_country", "fac_phone", "fac_fax", "fac_modalities", "fac_nonDVA",
		"fac_five_star_rating", "fac_legalname", "fac_administrator", "fac_longitude", "fac_latitude", })
public class Facility {

	private String fac_name;
	private String facilityid;
	private String facility_no;
	private String fac_address;
	private String fac_address2;
	private String fac_city;
	private String fac_state;
	private String fac_statelong;
	private String fac_zip;
	private String fac_county;
	private String fac_country;
	private String fac_phone;
	private String fac_fax;
	private String fac_modalities;
	private String fac_nonDVA;
	private String fac_five_star_rating;
	private String fac_legalname;
	private String fac_administrator;
	private String fac_longitude;
	private String fac_latitude;

	public String getFac_name() {
		return fac_name;
	}

	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}

	public String getFacilityid() {
		return facilityid;
	}

	public void setFacilityid(String facilityid) {
		this.facilityid = facilityid;
	}

	public String getFacility_no() {
		return facility_no;
	}

	public void setFacility_no(String facility_no) {
		this.facility_no = facility_no;
	}

	public String getFac_address() {
		return fac_address;
	}

	public void setFac_address(String fac_address) {
		this.fac_address = fac_address;
	}

	public String getFac_address2() {
		return fac_address2;
	}

	public void setFac_address2(String fac_address2) {
		this.fac_address2 = fac_address2;
	}

	public String getFac_city() {
		return fac_city;
	}

	public void setFac_city(String fac_city) {
		this.fac_city = fac_city;
	}

	public String getFac_state() {
		return fac_state;
	}

	public void setFac_state(String fac_state) {
		this.fac_state = fac_state;
	}

	public String getFac_statelong() {
		return fac_statelong;
	}

	public void setFac_statelong(String fac_statelong) {
		this.fac_statelong = fac_statelong;
	}

	public String getFac_zip() {
		return fac_zip;
	}

	public void setFac_zip(String fac_zip) {
		this.fac_zip = fac_zip;
	}

	public String getFac_county() {
		return fac_county;
	}

	public void setFac_county(String fac_county) {
		this.fac_county = fac_county;
	}

	public String getFac_country() {
		return fac_country;
	}

	public void setFac_country(String fac_country) {
		this.fac_country = fac_country;
	}

	public String getFac_phone() {
		return fac_phone;
	}

	public void setFac_phone(String fac_phone) {
		this.fac_phone = fac_phone;
	}

	public String getFac_fax() {
		return fac_fax;
	}

	public void setFac_fax(String fac_fax) {
		this.fac_fax = fac_fax;
	}

	public String getFac_modalities() {
		return fac_modalities;
	}

	public void setFac_modalities(String fac_modalities) {
		this.fac_modalities = fac_modalities;
	}

	public String getFac_nonDVA() {
		return fac_nonDVA;
	}

	public void setFac_nonDVA(String fac_nonDVA) {
		this.fac_nonDVA = fac_nonDVA;
	}

	public String getFac_five_star_rating() {
		return fac_five_star_rating;
	}

	public void setFac_five_star_rating(String fac_five_star_rating) {
		this.fac_five_star_rating = fac_five_star_rating;
	}

	public String getFac_legalname() {
		return fac_legalname;
	}

	public void setFac_legalname(String fac_legalname) {
		this.fac_legalname = fac_legalname;
	}

	public String getFac_administrator() {
		return fac_administrator;
	}

	public void setFac_administrator(String fac_administrator) {
		this.fac_administrator = fac_administrator;
	}

	public String getFac_longitude() {
		return fac_longitude;
	}

	public void setFac_longitude(String fac_longitude) {
		this.fac_longitude = fac_longitude;
	}

	public String getFac_latitude() {
		return fac_latitude;
	}

	public void setFac_latitude(String fac_latitude) {
		this.fac_latitude = fac_latitude;
	}

}
