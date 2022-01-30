package com.example.demo.dtos;

import javax.persistence.OneToOne;

import com.example.demo.entities.Employee;

import lombok.Data;

@Data
public class LabDto {

	private String name;

	private int labInchargeId;

}
