package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.BedBooking;

public interface BedBookingRepo extends CrudRepository<BedBooking, Integer> {

}
