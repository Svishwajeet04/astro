package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Patient;

public interface PatientRepo extends CrudRepository<Patient, Integer>{

	List<Patient> findAllByAdmitted(boolean b);

	Optional<Patient> findByPhone(String phone);

}
