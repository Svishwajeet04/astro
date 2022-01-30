package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Engagements;

public interface EngagementsRepo extends CrudRepository<Engagements, Integer> {

}
