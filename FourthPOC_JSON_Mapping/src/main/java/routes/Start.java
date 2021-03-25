package routes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.camel.Exchange;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileConverter;
import org.apache.camel.model.dataformat.JsonLibrary;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import com.davita.denodo.entweb.entity.Facility;
import com.davita.denodo.entweb.entity.HealthRecords;
import com.davita.denodo.entweb.entity.Hospitalizations;
import com.davita.denodo.entweb.entity.Nephrologist;
import com.davita.denodo.entweb.entity.Schedule;
import com.davita.denodo.entweb.entity.Vaccinations;
import com.fasterxml.jackson.core.PrettyPrinter;










public class Start extends RouteBuilder {

	static Logger logger = Logger.getLogger(Start.class);

	@Override
	public void configure() throws Exception {

		from("file://C:/Jaydeep_Data/Training/Fuse/Projects?fileName=healthrecord_data_Input.json&noop=true")


		//from()
		/*	.setBody().inMessage()
		.outBody().log("${body}");//.jsonpath("$.patientId")
		 */		
		.process(
				new Processor()
				{

					@Override
					public void process(Exchange arg0) throws Exception {
						//Message message = arg0.getIn();
						InputStream content=GenericFileConverter.genericFileToInputStream( (GenericFile<?>) arg0.getIn().getBody(), arg0);
						logger.info("body type 1 "+content);
						String test=convert(content);
						arg0.getOut().setBody(test);
						


					}
					public String convert(InputStream cont)
					{
						StringWriter writer = new StringWriter();
						 try {
							IOUtils.copy(cont, writer, "UTF-8");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 return writer.toString();

					}
				

				}
				).marshal().json(JsonLibrary.Jackson).setBody()
		.jsonpath("$").setBody(simple("${body}")).setHeader("no_of_Obj").jsonpath("$.length()").setHeader("Content-Type").constant("application/json")
		.process(
				new Processor()
				{
					org.json.JSONObject json=null;
					HealthRecords hr=null;
					List<Facility> fac=new ArrayList<Facility>();
					List<Nephrologist> nep=new ArrayList<Nephrologist>();
					List<Schedule> shed= new ArrayList<Schedule>();
					List<Vaccinations> vac=new ArrayList<Vaccinations>();
					List<Hospitalizations> hosp=new ArrayList<Hospitalizations>();
					@Override
					public void process(Exchange arg0) throws Exception {
						//Message message = arg0.getIn();
						logger.info("new pro "+arg0.getIn().getBody() +" headers "+arg0.getIn().getHeader("no_of_Obj"));
						//Gson g = new Gson();
						JSONArray jsonArr = new JSONArray(arg0.getIn().getBody().toString());
						//json =  new org.json.JSONObject(arg0.getIn().getBody().toString());
						//final ArrayList<?> jsonArray = new Gson().fromJson(arg0.getIn().getBody().toString(), ArrayList.class);
						int count=jsonArr.length()-1;
					
						
						/*for (int i=0; i<=jsonarr.size();i++)
						{ */  
							 //json = (net.minidev.json.JSONObject) jsonarr.get(0);
						//json = (net.minidev.json.JSONObject) jsonArray.get(0);
							 hr = mapping(jsonArr.getJSONObject(0));
					/*		 break;
						}*/
						for(int j=0;j<=count;j++)
						{
							json =  jsonArr.getJSONObject(j);
							listMapping(json);
						}
						logger.info("-----------------------------------");
						logger.info("Starting Obj Creation");
						arg0.getOut().setBody(hr);
						
						


					}
					
					public HealthRecords mapping(JSONObject json)
					{
						HealthRecords temp= new HealthRecords();
						temp.setPatientId(json.optString("patientId"));
						temp.setLastname(json.optString("lastname"));
						temp.setFirstname(json.optString("firstname"));
						temp.setMiddleName(json.optString("middleName"));
						temp.setHome_LocationID(json.optString("home_LocationID"));
						temp.setPatient_Permanent_Address1(json.optString("patient_Permanent_Address1"));
						temp.setPatient_Permanent_Address2(json.optString("patient_Permanent_Address2"));
						temp.setPatient_Permanent_City(json.optString("patient_Permanent_City"));
						temp.setPatient_State(json.optString("patient_State"));
						temp.setPatient_Permanent_PostalCode(json.optString("patient_Permanent_PostalCode"));
						temp.setPatient_Permanent_County(json.optString("patient_Permanent_County"));
						temp.setPatient_Permanent_Country(json.optString("patient_Permanent_Country"));
						temp.setPatient_Permanent_Telephone(json.optString("patient_Permanent_Telephone"));
						temp.setPatient_Permanent_MobilePhone(json.optString("patient_Permanent_MobilePhone"));
						temp.setPatient_Permanent_Email(json.optString("patient_Permanent_Email"));
						temp.setDob(json.optString("dob"));
						temp.setSex(json.optString("sex"));
						temp.setActual_DaVita_FDOD(json.optString("actual_DaVita_FDOD"));
						temp.seteC_EmergencyContact_FirstName(json.optString("eC_EmergencyContact_FirstName"));
						temp.seteC_EmergencyContact_LastName(json.optString("eC_EmergencyContact_LastName"));
						temp.seteC_EmergencyContact_MiddleName(json.optString("eC_EmergencyContact_MiddleName"));
						temp.seteC_EmergencyContact_MobilePhone(json.optString("eC_EmergencyContact_MobilePhone"));
						temp.seteC_EmergencyContact_Telephone(json.optString("eC_EmergencyContact_Telephone"));
						temp.seteC_EmergencyContact_WorkPhone(json.optString("eC_EmergencyContact_WorkPhone"));
						temp.setCenterSpecific_Nephrologist_PhysicianID(json.optString("centerSpecific_Nephrologist_PhysicianID"));
						temp.setRx_Status_Flag(json.optString("rx_Status_Flag"));
						temp.setIdTreatmentType(json.optString("idTreatmentType"));
						temp.setTreatmentType(json.optString("treatmentType"));
						temp.setAccessType(json.optString("accessType"));
						temp.setIdTreatmentLocation(json.optString("idTreatmentLocation"));
						temp.setIdClinicNumber(json.optString("idClinicNumber"));
						
						
						return temp;
						
					}
					
					public HealthRecords listMapping(JSONObject json) {
						
						Facility f=new Facility();
						f.setFac_name(json.optString("fac_name"));
						f.setFacilityid(json.optString("facilityid"));
						f.setFacility_no(json.optString("facility_no"));
						f.setFac_address(json.optString("fac_address"));
						f.setFac_address2(json.optString("fac_address2"));
						f.setFac_city(json.optString("fac_city"));
						f.setFac_state(json.optString("fac_state"));
						f.setFac_statelong(json.optString("fac_statelong"));
						f.setFac_zip(json.optString("fac_zip"));
						f.setFac_county(json.optString("fac_county"));
						f.setFac_country(json.optString("fac_country"));
						f.setFac_phone(json.optString("fac_phone"));
						f.setFac_fax(json.optString("fac_fax"));
						f.setFac_modalities(json.optString("fac_modalities"));
						f.setFac_nonDVA(json.optString("fac_nonDVA"));
						f.setFac_five_star_rating(json.optString("fac_five_star_rating"));
						f.setFac_legalname(json.optString("fac_legalname"));
						f.setFac_administrator(json.optString("fac_administrator"));
						f.setFac_longitude(json.optString("fac_longitude"));
						f.setFac_latitude(json.optString("fac_latitude"));
						fac.add(f);
						
						
						
						Nephrologist n=new Nephrologist();
						n.setPhysicianFirstName(json.optString("physicianFirstName"));
						n.setPhysicianLastName(json.optString("physicianLastName"));
						n.setPhysicianAddress1(json.optString("physicianAddress1"));
						n.setPhysicianAddress2(json.optString("physicianAddress2"));
						n.setPhysicianCity(json.optString("physicianCity"));
						n.setPhysicianState(json.optString("physicianState"));
						n.setPhysicianZipCode(json.optString("physicianZipCode"));
						n.setPhysicianState(json.optString("physicianState"));
						n.setPhysicianPhoneNumber(json.optString("physicianPhoneNumber"));
						nep.add(n);
						
						
						
						Schedule s=new Schedule();
						s.setIdDay(json.optString("idDay"));
						s.setDaystr(json.optString("daystr"));
						s.setShift(json.optString("shift"));
						s.setIdClinicNumber(json.optString("idClinicNumber"));
						shed.add(s);
						
						
						
						Hospitalizations h=new Hospitalizations();
						h.setDateAdmit(json.optString("dateAdmit"));
						h.setTextAdmit(json.optString("textAdmit"));
						h.setDateDischarge(json.optString("dateDischarge"));
						h.setNameHospital(json.optString("nameHospital"));
						hosp.add(h);
						
						
						Vaccinations v= new Vaccinations();
						v.setIdpatient(json.optString("idpatient"));
						v.setIdDrugService(json.optString("idDrugService"));
						v.setDateService(json.optString("dateService"));
						v.setIdServiceOutside(json.optString("idServiceOutside"));
						v.setLotNumber(json.optString("lotNumber"));
						v.setDateExpiration(json.optString("dateExpiration"));
						v.setNameDrugService(json.optString("nameDrugService"));
						v.setNameClassification(json.optString("nameClassification"));
						v.setResultSource(json.optString("resultSource"));
						v.setNoteService(json.optString("noteService"));
						v.setIsGiven(json.optString("isGiven"));
						vac.add(v);
						
						hr.setFacility(fac);
						hr.setNephrologist(nep);
						hr.setSchedule(shed);
						hr.setHospitalizations(hosp);
						hr.setVaccinations(vac);
						
						
						
						return hr;
						
					}

				}

				).setBody().body().marshal().json(JsonLibrary.Jackson).log("${body}");

				
							




	}

}
