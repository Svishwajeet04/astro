package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.BedDto;
import com.example.demo.dtos.DepartmentDto;
import com.example.demo.dtos.LabDto;
import com.example.demo.dtos.TestParameterDto;
import com.example.demo.dtos.TestTypeDto;
import com.example.demo.entities.Bed;
import com.example.demo.entities.Department;
import com.example.demo.entities.Laboratory;
import com.example.demo.entities.TestParameters;
import com.example.demo.entities.TestType;
import com.example.demo.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService aservice;

	@PostMapping("/addBed")
	public ResponseEntity<Object> addBed(@RequestHeader("Authorization")String auth , @RequestBody BedDto dto) {
		Bed b = aservice.addBed(dto);

		return ResponseEntity.ok(b);

	}

	@PostMapping("/addLab")
	public ResponseEntity<Object> addLab(@RequestHeader("Authorization")String auth ,@RequestBody LabDto dto) {
		Laboratory l = aservice.addLab(dto);
		return ResponseEntity.ok(l);
	}

	@PostMapping("/addDepartment")
	public ResponseEntity<Object> addDepartment(@RequestHeader("Authorization")String auth ,@RequestBody DepartmentDto dto) {
		Department d = aservice.addDepartment(dto);
		return ResponseEntity.ok(d.getId());
	}

	@PostMapping("/addTestType")
	public ResponseEntity<Object> addtestType(@RequestHeader("Authorization")String auth ,@RequestBody TestTypeDto dto) {
		TestType t = aservice.addTestType(dto);
		return ResponseEntity.ok(t);
	}

	@PostMapping("/addTestParameter")
	public ResponseEntity<Object> addtestParameter(@RequestHeader("Authorization")String auth ,@RequestBody TestParameterDto dto) {
		TestParameters t = aservice.addTestParameter(dto);
		return ResponseEntity.ok(t);
	}

//	@PostMapping("/addOT")
//	public ResponseEntity<Object> addOT(@RequestBody OTDto dto) {
//		OT o = aservice.addOT(dto);
//		return ResponseEntity.ok(o);
//	}
}
