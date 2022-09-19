package com.orthofx.hospital.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.orthofx.hospital.DTO.DoctorGetAllDto;
import com.orthofx.hospital.DTO.DoctorGetByIdDto;
import com.orthofx.hospital.DTO.DoctorPatientDto;
import com.orthofx.hospital.DTO.DoctorPostPutDto;
import com.orthofx.hospital.exception.ResourceNotFoundException;
import com.orthofx.hospital.model.Doctor;
import com.orthofx.hospital.model.Patient;
import com.orthofx.hospital.repository.DoctorRepository;

@Service
public class DoctorService implements DoctorServiceInterface {
	
	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor createDoctor(DoctorPostPutDto doctorPostPutDto) {
		Doctor doctor = new Doctor();
		doctor.setFirstname(doctorPostPutDto.getFirstname());
		doctor.setLastname(doctorPostPutDto.getLastname());
		doctor.setDepartment(doctorPostPutDto.getDepartment());
		return doctorRepository.save(doctor);
	}

	public List<Doctor> getAllDoctors (){
		DoctorGetAllDto doctorDto = new DoctorGetAllDto();
		doctorDto.setDoctorList(doctorRepository.findAll());
		return (doctorDto.getDoctorList());
	}

	public DoctorGetByIdDto findById(Long doctorId) throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(doctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + doctorId));
		DoctorGetByIdDto doctorGetByIdDto = new DoctorGetByIdDto();
		doctorGetByIdDto.setFirstname(doctor.getFirstname());
		doctorGetByIdDto.setLastname(doctor.getLastname());
		doctorGetByIdDto.setDepartment(doctor.getDepartment());
		return doctorGetByIdDto;
	}

	public List<Patient> findDoctor(Long doctorId) throws ResourceNotFoundException {
		if (!doctorRepository.existsById(doctorId))
			throw new ResourceNotFoundException("Doctor not found for this id :: " + doctorId);

	Doctor doctor = doctorRepository.findById(doctorId).get();
	
	DoctorPatientDto doctorPatientDto = new DoctorPatientDto();
	doctorPatientDto.setDoctorPatientList(doctor.getPatients());
	return doctorPatientDto.getDoctorPatientList();
    }
	

	public Doctor updateDoctor(Long doctorId, DoctorPostPutDto doctorPostPutDto) throws ResourceNotFoundException {
		if (!doctorRepository.existsById(doctorId))
				throw new ResourceNotFoundException("Doctor not found for this id :: " + doctorId);

		Doctor doctor = doctorRepository.findById(doctorId).get();
		doctor.setLastname(doctorPostPutDto.getLastname());
		doctor.setFirstname(doctorPostPutDto.getFirstname());
		doctor.setDepartment(doctorPostPutDto.getDepartment());
		return doctorRepository.save(doctor);
	}

	public void deleteDoctor(Long doctorId) throws ResourceNotFoundException {
		Doctor doctor = doctorRepository.findById(doctorId)
				.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + doctorId));

		doctorRepository.delete(doctor);
	}

	
	
	
	
	}
	
	

