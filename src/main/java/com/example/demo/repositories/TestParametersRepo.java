package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.TestParameters;

public interface TestParametersRepo extends CrudRepository<TestParameters, Integer> {

}
