package com.orthofx.hospital.DTO;

public class PatientPostPutDto {
	private Long id;
	private String firstname;
	private String lastname;
	private String phone;
	
	public PatientPostPutDto(Long id, String firstname, String lastname, String phone) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
	}
	
	
	public PatientPostPutDto() {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
