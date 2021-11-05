package com.example.eval.patients.services;

import java.util.List;

import com.example.eval.models.Patient;

public interface PatientService {
	
	List<Patient> findAll();
	Patient findById(Long id);
	List<Patient> findByName(String lastname, String firstname);
	Patient save(Patient patient);
	void delete(Patient patient);
	void deleteById(Long id);
}
