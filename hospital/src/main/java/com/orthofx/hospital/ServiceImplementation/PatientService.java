package com.orthofx.hospital.ServiceImplementation;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;


import com.orthofx.hospital.DTO.PatientGetByIdDto;
import com.orthofx.hospital.DTO.PatientPostPutDto;
import com.orthofx.hospital.exception.ResourceNotFoundException;
import com.orthofx.hospital.model.Doctor;
//import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;
import com.orthofx.hospital.repository.DoctorRepository;
//import com.orthofx.hospital.repository.DoctorRepository;
import com.orthofx.hospital.repository.PatientRepository;
@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	public Patient createPatient(PatientPostPutDto patientPostPutDto) {
		Patient patient = new Patient();
		patientPostPutDto.setFirstname(patient.getFirstname());
		patientPostPutDto.setLastname(patient.getLastname());
		patientPostPutDto.setPhone(patient.getPhone());
		return patientRepository.save(patient);
	}

	public List<Patient> getAllPatient(){
	return patientRepository.findAll();
	}
	public PatientGetByIdDto findById(Long patientId) throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + patientId));
		PatientGetByIdDto patientGetByIdDto = new PatientGetByIdDto();
		patientGetByIdDto.setFirstname(patient.getFirstname());
		patientGetByIdDto.setLastname(patient.getLastname());
		patientGetByIdDto.setPhone(patient.getPhone());
		return patientGetByIdDto;
	}
	public Optional<Doctor> findPatient(Long doctor_id) {
		return doctorRepository.findById(doctor_id);
		
	}
	public ResponseEntity<Patient> updatePatient(Long PatientId, PatientPostPutDto patientPostPutDto) throws ResourceNotFoundException {
		if (!doctorRepository.existsById(PatientId))
				throw new ResourceNotFoundException("Patient not found for this id :: " + PatientId);

		Patient patient = patientRepository.findById(PatientId).get();
		patient.setLastname(patientPostPutDto.getLastname());
		patient.setFirstname(patientPostPutDto.getFirstname());
		patient.setPhone(patientPostPutDto.getPhone());
		return ResponseEntity.ok(patient);
	}
	public void deleteThePatient(Long patientId) throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
		patientRepository.delete(patient);
	}
	  
}
