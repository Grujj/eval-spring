package com.example.eval.nurses.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eval.models.Nurse;
import com.example.eval.nurses.services.NurseService;

@RestController
@RequestMapping("/nurse")
@CrossOrigin
public class NurseController {
	
	private NurseService nurseService;
	
	public NurseController(NurseService nurseService) {
		this.nurseService = nurseService;
	}
	
	@GetMapping
	public List<Nurse> findAll(){
		return this.nurseService.findAll();
	}
	
	@GetMapping("{id}")
	public Nurse findById(@PathVariable Long id) {
		return this.nurseService.findById(id);
	}
	
	@PostMapping
	public Nurse save(@RequestBody Nurse nurse) {
		return this.nurseService.save(nurse);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Nurse nurse) {
		this.nurseService.delete(nurse);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.nurseService.deleteById(id);
	}
}