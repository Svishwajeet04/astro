package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.SearchService;

@RestController
@RequestMapping("/get")
public class SearchController {

	@Autowired
	SearchService sService;

//	@GetMapping("/allLabs")
//	public ResponseEntity<Object> getAllLabs() {
//		sService.getAllLabs();
//		return null;
//	}
//
//	@GetMapping("/allTest")
//	public ResponseEntity<Object> getAllTest() {
//		return null;
//	}
//
//	@GetMapping("/allOT")
//	public ResponseEntity<Object> getAllOT() {
//		return null;
//	}

	@GetMapping("/allAdmittedPatient")
	public ResponseEntity<Object> getAllAdmittedPatient(@RequestHeader("Authorization")String auth ) {

		return ResponseEntity.ok(sService.getAllAdmittedPatient());
	}

//
//	@GetMapping("/bedByType")
//	public ResponseEntity<Object> getBedByType() {
//		return null;
//	}

	@GetMapping("/HospitalInfo")
	public ResponseEntity<Object> getHospitalInfo(@RequestHeader("Authorization")String auth ) {

		return ResponseEntity.ok(sService.getHospitalInfo());
	}

}
