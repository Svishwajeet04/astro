package com.example.demo.dtos;

import com.example.demo.entities.enums.Role;

import lombok.Data;

@Data
public class RegisterDto {

	private String name;

	private String email;

	private String designation;

	private int department;

	private int experience;

	private String password;

	private String extraInformation;

	private int consultantFee;

	private Role role;

}
