package com.example.eval.adresses.services;

import java.util.List;
import java.util.Optional;

import com.example.eval.adresses.repositories.AdressRepository;
import com.example.eval.models.Adress;

public class AdressServiceImpl implements AdressService {

	private AdressRepository adressRepository;
	
	public AdressServiceImpl(AdressRepository adressRepository) {
		this.adressRepository = adressRepository;
	}

	public List<Adress> findAll() {
		return this.adressRepository.findAll();
	}

	public Adress findById(Long id) {
		Optional<Adress> optional = this.adressRepository.findById(id);
		return optional.isPresent() ? optional.get() : new Adress();
	}
	
	public Adress findByCity(String city) {
		Optional<Adress> optional = this.adressRepository.findByCity(city);
		return optional.isPresent() ? optional.get() : new Adress();
	}

	public Adress save(Adress adress) {
		return this.adressRepository.save(adress);
	}
	
	public void delete(Adress adress) {
		this.adressRepository.delete(adress);		
	}
	
	public void deleteById(Long id) {
		this.adressRepository.deleteById(id);
	}
}

