package com.example.demo.dtos;

import com.example.demo.entities.enums.Role;

import lombok.Data;

@Data
public class AuthenticationResponse {

	private String jwt;
	private Role role;
	private String name;
	private int id;
	private String email;

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

}
