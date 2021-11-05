package com.example.eval.nurses.services;

import java.util.List;
import java.util.Optional;

import com.example.eval.models.Nurse;
import com.example.eval.nurses.repositories.NurseRepository;

public class NurseServiceImpl implements NurseService {
	
private NurseRepository nurseRepository;
	
	public NurseServiceImpl(NurseRepository nurseRepository) {
		this.nurseRepository = nurseRepository;
	}

	public List<Nurse> findAll() {
		return this.nurseRepository.findAll();
	}

	public Nurse findById(Long id) {
		Optional<Nurse> optional = this.nurseRepository.findById(id);
		return optional.isPresent() ? optional.get() : new Nurse();
	}

	public Nurse save(Nurse nurse) {
		return this.nurseRepository.save(nurse);
	}
	
	public void delete(Nurse nurse) {
		this.nurseRepository.delete(nurse);		
	}
	
	public void deleteById(Long id) {
		this.nurseRepository.deleteById(id);
	}
}
