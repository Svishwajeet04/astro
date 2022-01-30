package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	Optional<Employee> findByEmail(String username);

}
