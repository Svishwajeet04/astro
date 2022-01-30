package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Laboratory;

@Repository
public interface LaboratoryRepo extends CrudRepository<Laboratory, Integer> {

}
