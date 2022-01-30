package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Appointment;

public interface AppointmentRepo  extends CrudRepository<Appointment , Integer>{

}
