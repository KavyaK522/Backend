package com.orthofx.hospital.DTO;

import java.util.List;
 
import com.orthofx.hospital.model.Patient;

public class DoctorPatientDto extends PatientPostPutDto {
	public DoctorPatientDto() {
	}

	private List<Patient> doctorPatientList;

	public List<Patient> getDoctorPatientList() {
		return doctorPatientList;
	}

	public void setDoctorPatientList(List<Patient> doctorPatientList) {
		this.doctorPatientList = doctorPatientList;
	}
	

}
