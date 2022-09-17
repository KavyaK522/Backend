//package com.orthofx.hospital.model;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Table;
//import javax.persistence.Id;
//
//import javax.persistence.ManyToOne;
//
//@Entity
//@Table(name = "hospital")
//
//public class Hospital {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(name = "firstname")
//	private String firstname;
//	
//	@Column(name = "lastname")
//	private String lastname;
//	
//	@Column(name = "phone")
//	private String phone;
//	
//	@ManyToOne
//	private Doctor doctor;
//	
//	
//
//	public Hospital() {
//		super();
//	}
//
//	public Hospital(String firstname, String lastname, String phone, Doctor doctor) {
//		super();
//		this.doctor = new Doctor("","","");
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.phone = phone;
//	}
//
//
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}
//}
