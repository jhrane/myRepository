package com.davita.denodo.entweb.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"patientId","lastname","firstname","middleName","home_LocationID","patient_Permanent_Address1", "patient_Permanent_Address2", "patient_Permanent_City", "patient_State","patient_Permanent_PostalCode", "patient_Permanent_County", "patient_Permanent_Country","patient_Permanent_Telephone", "patient_Permanent_MobilePhone", "patient_Permanent_Email", "dob", "sex","actual_DaVita_FDOD","eC_EmergencyContact_FirstName", "eC_EmergencyContact_LastName","eC_EmergencyContact_MiddleName", "eC_EmergencyContact_MobilePhone","eC_EmergencyContact_Telephone","eC_EmergencyContact_WorkPhone", "centerSpecific_Nephrologist_PhysicianID", "rx_Status_Flag", "idTreatmentType","treatmentType","accessType","idTreatmentLocation", "idClinicNumber", "facility", "nephrologist", "schedule","hospitalizations","vaccinations"})
public class HealthRecords {

	private String patientId;
	private String lastName;
	private String firstName;
	private String middleName;
	private String home_LocationID;
	private String patient_Permanent_Address1;
	private String patient_Permanent_Address2;
	private String patient_Permanent_City;
	private String patient_State;
	private String patient_Permanent_PostalCode;
	private String patient_Permanent_County;
	private String patient_Permanent_Country;
	private String patient_Permanent_Telephone;
	private String patient_Permanent_MobilePhone;
	private String patient_Permanent_Email;
	private String dob;
	private String sex;
	private String actual_DaVita_FDOD;
	private String eC_EmergencyContact_FirstName;
	private String eC_EmergencyContact_LastName;
	private String eC_EmergencyContact_MiddleName;
	private String eC_EmergencyContact_MobilePhone;
	private String eC_EmergencyContact_Telephone;
	private String eC_EmergencyContact_WorkPhone;
	private String centerSpecific_Nephrologist_PhysicianID;
	private String rx_Status_Flag;
	private String idTreatmentType;
	private String treatmentType;
	private String accessType;
	private String idTreatmentLocation;
	private String idClinicNumber;
	private List<Facility> facility;
	private List<Nephrologist> nephrologist;
	private List<Schedule> schedule;
	private List<Hospitalizations> hospitalizations;
	private List<Vaccinations> vaccinations;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getHome_LocationID() {
		return home_LocationID;
	}

	public void setHome_LocationID(String home_LocationID) {
		this.home_LocationID = home_LocationID;
	}

	public String getPatient_Permanent_Address1() {
		return patient_Permanent_Address1;
	}

	public void setPatient_Permanent_Address1(String patient_Permanent_Address1) {
		this.patient_Permanent_Address1 = patient_Permanent_Address1;
	}

	public String getPatient_Permanent_Address2() {
		return patient_Permanent_Address2;
	}

	public void setPatient_Permanent_Address2(String patient_Permanent_Address2) {
		this.patient_Permanent_Address2 = patient_Permanent_Address2;
	}

	public String getPatient_Permanent_City() {
		return patient_Permanent_City;
	}

	public void setPatient_Permanent_City(String patient_Permanent_City) {
		this.patient_Permanent_City = patient_Permanent_City;
	}

	public String getPatient_State() {
		return patient_State;
	}

	public void setPatient_State(String patient_State) {
		this.patient_State = patient_State;
	}

	public String getPatient_Permanent_PostalCode() {
		return patient_Permanent_PostalCode;
	}

	public void setPatient_Permanent_PostalCode(String patient_Permanent_PostalCode) {
		this.patient_Permanent_PostalCode = patient_Permanent_PostalCode;
	}

	public String getPatient_Permanent_County() {
		return patient_Permanent_County;
	}

	public void setPatient_Permanent_County(String patient_Permanent_County) {
		this.patient_Permanent_County = patient_Permanent_County;
	}

	public String getPatient_Permanent_Country() {
		return patient_Permanent_Country;
	}

	public void setPatient_Permanent_Country(String patient_Permanent_Country) {
		this.patient_Permanent_Country = patient_Permanent_Country;
	}

	public String getPatient_Permanent_Telephone() {
		return patient_Permanent_Telephone;
	}

	public void setPatient_Permanent_Telephone(String patient_Permanent_Telephone) {
		this.patient_Permanent_Telephone = patient_Permanent_Telephone;
	}

	public String getPatient_Permanent_MobilePhone() {
		return patient_Permanent_MobilePhone;
	}

	public void setPatient_Permanent_MobilePhone(String patient_Permanent_MobilePhone) {
		this.patient_Permanent_MobilePhone = patient_Permanent_MobilePhone;
	}

	public String getPatient_Permanent_Email() {
		return patient_Permanent_Email;
	}

	public void setPatient_Permanent_Email(String patient_Permanent_Email) {
		this.patient_Permanent_Email = patient_Permanent_Email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getActual_DaVita_FDOD() {
		return actual_DaVita_FDOD;
	}

		public void setActual_DaVita_FDOD(String actual_DaVita_FDOD) {
		this.actual_DaVita_FDOD = actual_DaVita_FDOD;
	}

	public String geteC_EmergencyContact_FirstName() {
		return eC_EmergencyContact_FirstName;
	}

	public void seteC_EmergencyContact_FirstName(String eC_EmergencyContact_FirstName) {
		this.eC_EmergencyContact_FirstName = eC_EmergencyContact_FirstName;
	}

	public String geteC_EmergencyContact_LastName() {
		return eC_EmergencyContact_LastName;
	}

	public void seteC_EmergencyContact_LastName(String eC_EmergencyContact_LastName) {
		this.eC_EmergencyContact_LastName = eC_EmergencyContact_LastName;
	}

	public String geteC_EmergencyContact_MiddleName() {
		return eC_EmergencyContact_MiddleName;
	}

	public void seteC_EmergencyContact_MiddleName(String eC_EmergencyContact_MiddleName) {
		this.eC_EmergencyContact_MiddleName = eC_EmergencyContact_MiddleName;
	}

	public String geteC_EmergencyContact_MobilePhone() {
		return eC_EmergencyContact_MobilePhone;
	}

	public void seteC_EmergencyContact_MobilePhone(String eC_EmergencyContact_MobilePhone) {
		this.eC_EmergencyContact_MobilePhone = eC_EmergencyContact_MobilePhone;
	}

	public String geteC_EmergencyContact_Telephone() {
		return eC_EmergencyContact_Telephone;
	}

	public void seteC_EmergencyContact_Telephone(String eC_EmergencyContact_Telephone) {
		this.eC_EmergencyContact_Telephone = eC_EmergencyContact_Telephone;
	}

	public String geteC_EmergencyContact_WorkPhone() {
		return eC_EmergencyContact_WorkPhone;
	}

	public void seteC_EmergencyContact_WorkPhone(String eC_EmergencyContact_WorkPhone) {
		this.eC_EmergencyContact_WorkPhone = eC_EmergencyContact_WorkPhone;
	}
	
	
	
	
	

	public String getCenterSpecific_Nephrologist_PhysicianID() {
		return centerSpecific_Nephrologist_PhysicianID;
	}

	public void setCenterSpecific_Nephrologist_PhysicianID(String centerSpecific_Nephrologist_PhysicianID) {
		this.centerSpecific_Nephrologist_PhysicianID = centerSpecific_Nephrologist_PhysicianID;
	}

	public String getRx_Status_Flag() {
		return rx_Status_Flag;
	}

	public void setRx_Status_Flag(String rx_Status_Flag) {
		this.rx_Status_Flag = rx_Status_Flag;
	}

	public String getIdTreatmentType() {
		return idTreatmentType;
	}

	public void setIdTreatmentType(String idTreatmentType) {
		this.idTreatmentType = idTreatmentType;
	}

	public String getTreatmentType() {
		return treatmentType;
	}

	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}

	public String getIdTreatmentLocation() {
		return idTreatmentLocation;
	}

	public void setIdTreatmentLocation(String idTreatmentLocation) {
		this.idTreatmentLocation = idTreatmentLocation;
	}

	public String getIdClinicNumber() {
		return idClinicNumber;
	}

	public void setIdClinicNumber(String idClinicNumber) {
		this.idClinicNumber = idClinicNumber;
	}

	

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public List<Hospitalizations> getHospitalizations() {
		return hospitalizations;
	}

	public void setHospitalizations(List<Hospitalizations> hospitalizations) {
		this.hospitalizations = hospitalizations;
	}

	public List<Vaccinations> getVaccinations() {
		return vaccinations;
	}

	public void setVaccinations(List<Vaccinations> vaccinations) {
		this.vaccinations = vaccinations;
	}

	public List<Facility> getFacility() {
		return facility;
	}

	public void setFacility(List<Facility> facility) {
		this.facility = facility;
	}

	public List<Nephrologist> getNephrologist() {
		return nephrologist;
	}

	public void setNephrologist(List<Nephrologist> nephrologist) {
		this.nephrologist = nephrologist;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

}
