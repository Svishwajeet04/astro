package com.example.demo.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Hospital;
import com.example.demo.services.HospitalService;

@Configuration
public class HospitalConfiguration {

	@Autowired
	HospitalService hservice;

//	@Bean
//	public Hospital getHospitalObject() {
//
//		return hservice.getHospitalDataFromDB();
//
//	}
}
