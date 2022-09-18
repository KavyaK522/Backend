package com.orthofx.hospital.DTO;

public class DoctorPostPutDto {
	private String firstname;
	private String lastname;
	private String Department;
	public DoctorPostPutDto(String firstname, String lastname, String department) {
		this.firstname = firstname; 
		this.lastname = lastname;
		Department = department;
	}
	
	public DoctorPostPutDto() {
		super();
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
