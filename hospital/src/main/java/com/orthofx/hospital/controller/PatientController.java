package com.orthofx.hospital.controller;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;
import com.orthofx.hospital.DTO.PatientGetByIdDto;
//import com.orthofx.hospital.repository.PatientRepository;
//import com.orthofx.hospital.ServiceImplementation.PatientService;
import com.orthofx.hospital.ServiceImplementation.PatientServiceInterface;
import com.orthofx.hospital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientServiceInterface patientService;

	@GetMapping("/patients")
	public List<Patient> getAllPatient() {
		return patientService.getAllPatient();
	}
	
	@GetMapping("/patients/{id}/")
	public PatientGetByIdDto getEmployeeById(@PathVariable(value = "id") Long PatientId)
			throws ResourceNotFoundException {
		return patientService.findById(PatientId);
	}
	@GetMapping("/doctor/{Doctor_id}/patient/allpatients")
	public List<Patient> getAll(@PathVariable Long Doctor_id) throws ResourceNotFoundException{
		return patientService.getPatientByDoctorId(Doctor_id);
	}
	@PostMapping("doctor/{Doctor_id}/patient")
	public Patient createPatient(@Validated @RequestBody Patient patient, @PathVariable Long Doctor_id) {
		patient.setDoctor(new Doctor(Doctor_id,"","",""));
        return patientService.createPatient(patient);
	}
	@PutMapping("/patients/{id}")
	public Patient updatePatient(@PathVariable(value = "id") Long patientId,
			@Validated @RequestBody Patient patientPostPutDto) throws ResourceNotFoundException {
		//Patient patient = patientService.updatePatient(patientId);
		return patientService.updatePatient(patientId, patientPostPutDto);
				
	}
	@DeleteMapping("/patient/{id}")
	public void deletePatient(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		patientService.deleteThePatient(patientId);
	}
}
