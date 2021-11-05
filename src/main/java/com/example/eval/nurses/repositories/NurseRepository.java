package com.example.eval.nurses.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eval.models.Nurse;

public interface NurseRepository extends JpaRepository<Nurse, Long>{

}
