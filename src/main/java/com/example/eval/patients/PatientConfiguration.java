package com.example.eval.patients;

import org.springframework.context.annotation.Bean;

import com.example.eval.patients.repositories.PatientRepository;
import com.example.eval.patients.services.PatientService;
import com.example.eval.patients.services.PatientServiceImpl;

public class PatientConfiguration {
	
	@Bean
	public PatientService patientService(PatientRepository patientRepository) {
		return new PatientServiceImpl(patientRepository);
	}
}
