package com.orthofx.hospital.ServiceImplementation;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.orthofx.hospital.DTO.DoctorGetByIdDto;
import com.orthofx.hospital.DTO.DoctorPostPutDto;
import com.orthofx.hospital.exception.ResourceNotFoundException;
import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;

public interface DoctorServiceInterface {
	public Doctor createDoctor(DoctorPostPutDto doctorPostPutDto);
	public DoctorGetByIdDto findById(Long doctorId) throws ResourceNotFoundException;
	public List<Patient> findDoctor(Long doctorId) throws ResourceNotFoundException;
	public ResponseEntity<Doctor> updateDoctor(Long doctorId, DoctorPostPutDto doctorPostPutDto) throws ResourceNotFoundException;
	public void deleteDoctor(Long doctorId) throws ResourceNotFoundException;
	public List<Doctor> findAll();
}
