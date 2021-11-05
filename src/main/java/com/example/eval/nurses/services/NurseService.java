package com.example.eval.nurses.services;

import java.util.List;

import com.example.eval.models.Nurse;

public interface NurseService {
	
	List<Nurse> findAll();
	Nurse findById(Long id);
	Nurse save(Nurse nurse);
	void delete(Nurse nurse);
	void deleteById(Long id);
}
