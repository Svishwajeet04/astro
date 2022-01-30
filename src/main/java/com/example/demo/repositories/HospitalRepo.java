package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Hospital;

@Repository
public interface HospitalRepo extends CrudRepository<Hospital, String> {

}
