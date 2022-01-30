package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.TestType;

public interface TestTypeRepo extends CrudRepository<TestType, Integer> {

}
	