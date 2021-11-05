package com.example.eval.adresses.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eval.models.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long>{
	
	Optional<Adress> findByCity(String city);
}
