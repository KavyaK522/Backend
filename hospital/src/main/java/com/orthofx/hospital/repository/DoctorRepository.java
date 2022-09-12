package com.orthofx.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orthofx.hospital.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
