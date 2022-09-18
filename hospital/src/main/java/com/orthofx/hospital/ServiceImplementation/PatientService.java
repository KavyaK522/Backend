package com.orthofx.hospital.ServiceImplementation;

//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import com.orthofx.hospital.DTO.DoctorPatientDto;
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
public class PatientService implements PatientServiceInterface {
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
	public List<Patient> getPatientByDoctorId(Long doctorId) throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(doctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id : " + doctorId));
		DoctorPatientDto doctorPatientDto = new DoctorPatientDto();
		doctorPatientDto.setDoctorPatientList(doctor.getPatients());
		return doctorPatientDto.getDoctorPatientList();
	}

	public ResponseEntity<Patient> updatePatient(Long PatientId, PatientPostPutDto PatientPostPutDto) throws ResourceNotFoundException {
		if (!doctorRepository.existsById(PatientId))
				throw new ResourceNotFoundException("Patient not found for this id :: " + PatientId);

		Patient patient = patientRepository.findById(PatientId).get();
		patient.setLastname(PatientPostPutDto.getLastname());
		patient.setFirstname(PatientPostPutDto.getFirstname());
		patient.setPhone(PatientPostPutDto.getPhone());
		return ResponseEntity.ok(patient);
	}
	public void deleteThePatient(Long patientId) throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
		patientRepository.delete(patient);
	}

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient updatePatient(Long patientId, Patient patientDetails) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	  
}
