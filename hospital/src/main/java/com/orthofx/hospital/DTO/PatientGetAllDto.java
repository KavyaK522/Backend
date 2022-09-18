package com.orthofx.hospital.DTO;

import java.util.List;

import com.orthofx.hospital.model.Patient;

public class PatientGetAllDto extends PatientPostPutDto {
	private List<Patient> patientList;

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setTeamList(List<Patient> patientList) {
		this.patientList = patientList;
	}

}
