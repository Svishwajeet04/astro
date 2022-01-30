package com.example.demo.dtos;

import com.example.demo.entities.enums.BedType;

import lombok.Data;

@Data
public class BedDto {
	private BedType type;

	private boolean status;

	private String location;
}
