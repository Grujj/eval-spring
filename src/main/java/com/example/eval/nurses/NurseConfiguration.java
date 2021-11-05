package com.example.eval.nurses;

import org.springframework.context.annotation.Bean;

import com.example.eval.nurses.repositories.NurseRepository;
import com.example.eval.nurses.services.NurseService;
import com.example.eval.nurses.services.NurseServiceImpl;

public class NurseConfiguration {
	
	@Bean
	public NurseService nurseService(NurseRepository nurseRepository) {
		return new NurseServiceImpl(nurseRepository);
	}
}
