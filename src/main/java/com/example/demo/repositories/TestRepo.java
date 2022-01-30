package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Test;

public interface TestRepo extends CrudRepository<Test, Integer> {

}
