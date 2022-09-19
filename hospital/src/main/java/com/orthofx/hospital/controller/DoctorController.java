package com.orthofx.hospital.controller;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
//import java.util.Optional;
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

import com.orthofx.hospital.DTO.DoctorGetByIdDto;
import com.orthofx.hospital.DTO.DoctorPostPutDto;
//import com.orthofx.hospital.ServiceImplementation.DoctorService;
import com.orthofx.hospital.ServiceImplementation.DoctorServiceInterface;
import com.orthofx.hospital.exception.ResourceNotFoundException;
import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;
//import com.orthofx.hospital.repository.DoctorRepository;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
   
   @Autowired
   private DoctorServiceInterface doctorService;
   
   @GetMapping("/allDoctors/")
   public List<Doctor> getAll() {
		return doctorService.getAllDoctors();
   }
	@GetMapping("/doctors/{id}")
	public DoctorGetByIdDto getDoctorById(@PathVariable(value = "id") Long DoctorId)
			throws ResourceNotFoundException {
		return doctorService.findById(DoctorId); 
	}
	@GetMapping("/{id}")
    public List<Patient> getById(@PathVariable(value = "id") Long DoctorId) throws ResourceNotFoundException {
       return doctorService.findDoctor(DoctorId);
    }
	@PostMapping("/doctor")
	public Doctor createDoctor(@RequestBody DoctorPostPutDto doctorPostPutDto) {
		return doctorService.createDoctor(doctorPostPutDto);

	}
	@PutMapping("/doctor/{id}")
	public Doctor updateDoctor(@PathVariable(value = "id") Long doctorId,
			@Validated @RequestBody DoctorPostPutDto doctorPostPutDto) throws ResourceNotFoundException {
		return doctorService.updateDoctor(doctorId, doctorPostPutDto);
	}
	@DeleteMapping("/doctor/{id}")
	public void deleteDoctor(@PathVariable(value = "id") Long doctorId)
			throws ResourceNotFoundException {
		 doctorService.deleteDoctor(doctorId);
	}
   
}
