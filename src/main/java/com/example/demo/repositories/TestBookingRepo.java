package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.TestBooking;

public interface TestBookingRepo extends CrudRepository<TestBooking, Integer>{

}
