package com.example.demo.dtos;

import java.time.LocalDateTime;

import com.example.demo.entities.enums.BedType;

import lombok.Data;

@Data
public class AdmitPatientDto {

	private int patientId;

//	private LocalDateTime date;

	private BedType bedType;

}
