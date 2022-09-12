package com.orthofx.hospital.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orthofx.hospital.exception.ResourceNotFoundException;
import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.repository.DoctorRepository;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
   @Autowired
   private DoctorRepository doctorRepository;
   
   @GetMapping("/allDoctors/")
	public List<Doctor> getAllDoctor() {
		return doctorRepository.findAll();
	}
	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> getEmployeeById(@PathVariable(value = "id") Long DoctorId)
			throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(DoctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + DoctorId));
		return ResponseEntity.ok().body(doctor);
	}
	@PostMapping("/doctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		//Doctor doc = new Doctor("Kavya", "K", "fff");
		return doctorRepository.save(doctor);
	}
	@PutMapping("/doctors/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable(value = "id") Long doctorId,
			@Validated @RequestBody Doctor doctorDetails) throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(doctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + doctorId));

		doctor.setId(doctorDetails.getId());
		doctor.setLastname(doctorDetails.getLastname());
		doctor.setFirstname(doctorDetails.getFirstname());
		doctor.setDepartment(doctorDetails.getDepartment());
		final Doctor updatedDoctor = doctorRepository.save(doctor);
		return ResponseEntity.ok(updatedDoctor);
	}
	@DeleteMapping("/doctor/{id}")
	public Map<String, Boolean> deleteDoctor(@PathVariable(value = "id") Long doctorId)
			throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(doctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + doctorId));

		doctorRepository.delete(doctor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
   
}
