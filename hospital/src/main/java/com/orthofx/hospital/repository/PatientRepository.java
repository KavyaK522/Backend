package com.orthofx.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orthofx.hospital.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
     public List<Patient> findByDoctorId(Long doctorId);

}
