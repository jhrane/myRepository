package com.davita.denodo.entweb.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder ({"idpatient", "idDrugService", "dateService", "idServiceOutside","lotNumber", "dateExpiration","nameDrugService", 
	"nameClassification", "resultSource", "noteService", "isGiven"})
public class Vaccinations {
	private String idpatient;
	private String idDrugService;
	private String dateService;
	private String idServiceOutside;
	private String lotNumber;
	private String dateExpiration;
	private String nameDrugService;
	private String nameClassification;
	private String resultSource;
	private String noteService;
	private String isGiven;
	public String getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}
	public String getIdDrugService() {
		return idDrugService;
	}
	public void setIdDrugService(String idDrugService) {
		this.idDrugService = idDrugService;
	}
	public String getDateService() {
		return dateService;
	}
	public void setDateService(String dateService) {
		this.dateService = dateService;
	}
	public String getIdServiceOutside() {
		return idServiceOutside;
	}
	public void setIdServiceOutside(String idServiceOutside) {
		this.idServiceOutside = idServiceOutside;
	}
	public String getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public String getNameDrugService() {
		return nameDrugService;
	}
	public void setNameDrugService(String nameDrugService) {
		this.nameDrugService = nameDrugService;
	}
	public String getNameClassification() {
		return nameClassification;
	}
	public void setNameClassification(String nameClassification) {
		this.nameClassification = nameClassification;
	}
	public String getResultSource() {
		return resultSource;
	}
	public void setResultSource(String resultSource) {
		this.resultSource = resultSource;
	}
	public String getNoteService() {
		return noteService;
	}
	public void setNoteService(String noteService) {
		this.noteService = noteService;
	}
	public String getIsGiven() {
		return isGiven;
	}
	public void setIsGiven(String isGiven) {
		this.isGiven = isGiven;
	}
	
	
}
