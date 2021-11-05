package com.example.eval.adresses.services;

import java.util.List;

import com.example.eval.models.Adress;

public interface AdressService {
	
	List<Adress> findAll();
	Adress findById(Long id);
	Adress findByCity(String city);
	Adress save(Adress adress);
	void delete(Adress adress);
	void deleteById(Long id);
}
