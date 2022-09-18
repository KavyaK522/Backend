package com.orthofx.hospital.DTO;

import java.util.List;

import com.orthofx.hospital.model.Doctor;

public class DoctorGetAllDto extends DoctorPostPutDto {
	private List<Doctor> doctorList;
	
	public DoctorGetAllDto(String firstname, String lastname, String department) {
		super(firstname, lastname, department);
		
	}
    public DoctorGetAllDto(String firstname, String lastname, String Department, List<Doctor> doctorList) {
		super(firstname, lastname, Department);
		this.doctorList = doctorList;
	}
	
	public DoctorGetAllDto() {
		super();
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

}
