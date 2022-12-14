package com.orthofx.hospital.DTO;

public class DoctorGetDto {
	private Long id;
	private String firstname;
	private String lastname;
	private String Department;
	public DoctorGetDto(Long id, String firstname, String lastname, String department) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		Department = department;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
