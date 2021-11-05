package com.example.eval.patients.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.eval.models.Patient;
import com.example.eval.patients.repositories.PatientRepository;

public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;
	
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	public List<Patient> findAll() {
		return this.patientRepository.findAll();
	}

	public Patient findById(Long id) {
		Optional<Patient> optional = this.patientRepository.findById(id);
		return optional.isPresent() ? optional.get() : new Patient();
	}
	
	public List<Patient> findByName(String lastname, String firstname) {
		Optional<List<Patient>> optional = this.patientRepository.findPatientByLastnameAndByFirstname(lastname, firstname);
		return optional.isPresent() ? optional.get() : new ArrayList<Patient>();
	}

	public Patient save(Patient patient) {
		return this.patientRepository.save(patient);
	}
	
	public void delete(Patient patient) {
		this.patientRepository.delete(patient);		
	}
	
	public void deleteById(Long id) {
		this.patientRepository.deleteById(id);
	}
}
