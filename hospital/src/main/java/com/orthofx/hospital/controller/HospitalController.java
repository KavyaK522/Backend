//package com.orthofx.hospital.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.orthofx.hospital.model.Doctor;
//import com.orthofx.hospital.model.Hospital;
//import com.orthofx.hospital.repository.HospitalRepository;
//import com.orthofx.hospital.exception.ResourceNotFoundException;
//
//@RestController
//@RequestMapping("/patient")
//public class HospitalController {
//	@Autowired
//	private HospitalRepository hospitalRepository;
//
//	@GetMapping("/patients")
//	public List<Hospital> getAllHospital() {
//		return hospitalRepository.findAll();
//	}
//	@GetMapping("/patients/{id}/")
//	public ResponseEntity<Hospital> getEmployeeById(@PathVariable(value = "id") Long PatientId)
//			throws ResourceNotFoundException {
//		Hospital patient = hospitalRepository.findById(PatientId)
//				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + PatientId));
//		return ResponseEntity.ok().body(patient);
//	}
//	@GetMapping("/doctor/{Doctor_id}/patient/allpatients")
//	public List<Hospital> getAll(@PathVariable Long Doctor_id){
//		List<Hospital> patients = new ArrayList<>();
//		hospitalRepository.findByDoctorId(Doctor_id).forEach(patients::add);
//		return patients;
//		
//	}
//	@PostMapping("doctor/{Doctor_id}/patient")
//	public Hospital createHospital(@Validated @RequestBody Hospital patient, @PathVariable Long Doctor_id) {
//		patient.setDoctor(new Doctor(Doctor_id,"","",""));
//        return hospitalRepository.save(patient);
//	}
//	@PutMapping("/patients/{id}")
//	public ResponseEntity<Hospital> updateDoctor(@PathVariable(value = "id") Long patientId,
//			@Validated @RequestBody Hospital patientDetails) throws ResourceNotFoundException {
//		Hospital patient = hospitalRepository.findById(patientId)
//				.orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
//
//		patient.setId(patientDetails.getId());
//		patient.setLastname(patientDetails.getLastname());
//		patient.setFirstname(patientDetails.getFirstname());
//		final Hospital updatedHospital = hospitalRepository.save(patient);
//		return ResponseEntity.ok(updatedHospital);
//	}
//	@DeleteMapping("/patient/{id}")
//	public Map<String, Boolean> deleteHospital(@PathVariable(value = "id") Long patientId)
//			throws ResourceNotFoundException {
//		Hospital patient = hospitalRepository.findById(patientId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + patientId));
//
//		hospitalRepository.delete(patient);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
//}
