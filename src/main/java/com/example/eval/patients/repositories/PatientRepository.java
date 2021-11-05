package com.example.eval.patients.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eval.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	
	Optional<List<Patient>> findPatientByLastnameAndByFirstname(String lastname, String firstname);
}
