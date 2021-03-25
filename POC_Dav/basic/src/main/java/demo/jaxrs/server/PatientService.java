/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package demo.jaxrs.server;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import demo.jaxrs.collector.PatientCollector;
import demo.jaxrs.server.Patient;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import com.fasterxml.jackson.databind.*;

@Path("/patientservice/")
public class PatientService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8396391235326666878L;
	List<Patient> patientList = null;

	@GET
	@Path("/patient/{id}/")
	@Produces("application/json")
	public Response getPatient(@PathParam("id") String id) {

		System.out.println("----invoking getPatient, patient id is: " + id);
		if (Optional.ofNullable(patientList).isPresent()) {

			return Response.status(Response.Status.OK).entity(patientList.stream().filter(patientRecord -> patientRecord.getId().equals(id)).collect(Collectors.toList())).build();
		}

		else {
			System.out.println("No record found");
			return Response.status(Response.Status.NO_CONTENT).entity("No Record Found").build();

		}

	}

	@GET
	@Path("/patients/")
	@Consumes("application/json")
	@Produces("application/json")
	public Response showAll() {
		return Response.status(Response.Status.OK).entity(patientList).build();
	}


	@POST
	@Path("/patient/addpatient")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addPatient(Patient patient) {
		patientList=Optional.ofNullable(patientList).orElse(new ArrayList<Patient>());
		if(patientList.stream().anyMatch(anypatient->anypatient.getId().equals(patient.getId())))
		{

			return Response.status(Response.Status.BAD_REQUEST).entity("Cannot use POST method to add existing id again. Instead use PUT method to update").build();
		}
		else {
			patient.setId(String.valueOf((patientList.size()+1)));
			patientList.add(patient);
			return Response.status(Response.Status.CREATED).entity(patient).build();
		}
	}

	@PUT
	@Path("/patient/update/")
	@Consumes("application/json")
	@Produces("application/json") public Response updatePatient(Patient pt) {
		for(int i=0;i<=patientList.size()-1;i++)
		{
			if(patientList.get(i).getId().equals(pt.getId()))
			{
				Patient tempPatient=patientList.get(i);
				patientList.remove(i);
				tempPatient=null;
				tempPatient=pt;
				patientList.add(tempPatient);
				return Response.status(Status.CREATED).entity(tempPatient).build();
			}

		}
		return Response.status(Status.NOT_MODIFIED).entity("{No Patient found to update with id "+pt.getId()+"}").build();
	}


	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/patient/batch/data/") 
	public Response addpatients(List<Patient> jsonList) {
		List<String> duplicateID=new ArrayList<String>();
		patientList=Optional.ofNullable(patientList).orElse(new ArrayList<Patient>());
		int  noOfPatients=patientList.size();
		boolean alreadyPresentFlag=false;
		System.out.println("aleady in list "+noOfPatients);
		for(int i=0; i<=jsonList.size()-1;i++)
		{
			if(noOfPatients==0)
			{
				noOfPatients=1;
				patientList.add(noOfPatients-1, jsonList.get(i));
				System.out.println(noOfPatients);
				System.out.println(patientList.get(noOfPatients-1).getId());
				continue;
			}
			for(int j=0; j<=noOfPatients-1;j++)
			{

				System.out.println("i "+i+" j "+j+" values "+jsonList.get(i).getId()+" & "+patientList.get(j).getId()+" : "+jsonList.get(i).getId().equals(patientList.get(j).getId()));

				if(jsonList.get(i).getId().equals(patientList.get(j).getId()))
				{
					alreadyPresentFlag=true;

				}

			}
			if(alreadyPresentFlag)
			{
				duplicateID.add(jsonList.get(i).getId());
				System.out.println(duplicateID.toString()); 
				alreadyPresentFlag=false;
			}
			else {
				patientList.add(jsonList.get(i));
			}
		}
		if(duplicateID.isEmpty())
		{
			duplicateID=null;
			System.out.println("Before Sorting"); 
			patientList.forEach(p ->System.out.println(p.getName()));
			Collections.sort(patientList); 
			System.out.println("after Sorting");
			patientList.forEach(p -> System.out.println(p.getName()));
			return Response.status(Response.Status.CREATED).entity(patientList).build();
		}
		StringBuilder sb=new StringBuilder();
		sb.append(duplicateID.toString());
		duplicateID=null;
		return Response.status(Status.PARTIAL_CONTENT).entity(sb+" id's not added as id's are already present").build();
		
	}




}
