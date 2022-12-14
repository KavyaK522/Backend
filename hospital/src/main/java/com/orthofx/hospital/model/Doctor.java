package com.orthofx.hospital.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Doctor")

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "Department")
	private String Department;
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "doctor")
    private List<Patient> patients = new ArrayList<>();
	

	public Doctor() {
	}

	public Doctor(String firstname, String lastname, String Department) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.Department = Department;
	}

	public Doctor(Long id, String firstname, String lastname, String Department) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.Department = Department;
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

	public void setDepartment(String Department) {
		this.Department = Department;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
}
