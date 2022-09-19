package com.orthofx.hospital.ServiceImplementation;

import java.util.List;
//import java.util.Optional;

//import org.springframework.http.ResponseEntity;

import com.orthofx.hospital.DTO.PatientGetByIdDto;
import com.orthofx.hospital.DTO.PatientPostPutDto;
//import com.orthofx.hospital.DTO.PatientPostPutDto;
import com.orthofx.hospital.exception.ResourceNotFoundException;
//import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;

public interface PatientServiceInterface {
	public Patient createPatient(PatientPostPutDto patientPostPutDto, Long id) throws ResourceNotFoundException;
	public List<Patient> getAllPatient();
	public PatientGetByIdDto findById(Long patientId) throws ResourceNotFoundException;
	public List<Patient> getPatientByDoctorId(Long doctor_id)throws ResourceNotFoundException ;
	public Patient updatePatient(Long patientId, PatientPostPutDto patientPostPutDto) throws ResourceNotFoundException;
	public void deleteThePatient(Long patientId) throws ResourceNotFoundException;
}