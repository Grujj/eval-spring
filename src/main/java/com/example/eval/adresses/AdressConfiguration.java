package com.example.eval.adresses;

import org.springframework.context.annotation.Bean;

import com.example.eval.adresses.repositories.AdressRepository;
import com.example.eval.adresses.services.AdressService;
import com.example.eval.adresses.services.AdressServiceImpl;

public class AdressConfiguration {
	
	@Bean
	public AdressService adressService(AdressRepository adressRepository) {
		return new AdressServiceImpl(adressRepository);
	}
}
