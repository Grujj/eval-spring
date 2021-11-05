package com.example.eval.patients.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eval.models.Patient;
import com.example.eval.patients.services.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {
	
	private PatientService patientService;
	
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@GetMapping
	public List<Patient> findAll(){
		return this.patientService.findAll();
	}
	
	@GetMapping("{id}")
	public Patient findById(@PathVariable Long id) {
		return this.patientService.findById(id);
	}
	
	@PostMapping
	public Patient save(@RequestBody Patient patient) {
		return this.patientService.save(patient);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Patient patient) {
		this.patientService.delete(patient);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.patientService.deleteById(id);
	}
}
