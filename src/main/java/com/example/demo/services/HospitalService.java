package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Hospital;
import com.example.demo.repositories.HospitalRepo;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepo hrepo;

	public Hospital getHospitalDataFromDB() {
		Hospital h = hrepo.findById("AstroTalk Hospitals").get();
		return h;
	}

}
