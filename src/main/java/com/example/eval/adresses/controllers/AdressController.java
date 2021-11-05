package com.example.eval.adresses.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eval.adresses.services.AdressService;
import com.example.eval.models.Adress;

@RestController
@RequestMapping("/adresses")
@CrossOrigin
public class AdressController {
	
	private AdressService adressService;
	
	public AdressController(AdressService adressService) {
		this.adressService = adressService;
	}
	
	@GetMapping
	public List<Adress> findAll(){
		return this.adressService.findAll();
	}
	
	@GetMapping("{id}")
	public Adress findById(@PathVariable Long id) {
		return this.adressService.findById(id);
	}
	
	@GetMapping("/search")
	public Adress findByCity(@RequestParam String city) {
		return this.adressService.findByCity(city);
	}
	
	@PostMapping
	public Adress save(@RequestBody Adress adress) {
		return this.adressService.save(adress);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Adress adress) {
		this.adressService.delete(adress);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.adressService.deleteById(id);
	}
}
