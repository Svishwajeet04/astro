package com.example.demo.dtos;

import javax.persistence.ManyToOne;

import com.example.demo.entities.TestType;

import lombok.Data;

@Data
public class TestParameterDto {

	private String name;

	private String range;

	private int testTypeId;
}
