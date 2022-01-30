package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.AuthenticationDto;
import com.example.demo.dtos.AuthenticationResponse;
import com.example.demo.dtos.RegisterDto;
import com.example.demo.entities.Employee;
import com.example.demo.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	private AuthenticationManager am;

	@Autowired
	LoginService lservice;

	@PostMapping("/authenticate")
	public ResponseEntity<Object> authentictae(@RequestBody AuthenticationDto ar) throws Exception {
		AuthenticationResponse ar1 = lservice.createAuthenticationToken(ar);
		if (ar1 != null)
			return ResponseEntity.ok(ar1);
		else {
			
			return ResponseEntity.ok("wrong input");
		}
	}

	@PostMapping(path = "/register", consumes = "application/Json")
	public ResponseEntity<Object> createEmployee(@RequestBody RegisterDto dto) {
		Employee emp = lservice.createEmployee(dto);
		if (emp != null)
			return new ResponseEntity<>(emp, HttpStatus.CREATED);
		else {
			return new ResponseEntity<>("email already exists", HttpStatus.FORBIDDEN);
		}
	}
}
