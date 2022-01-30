package com.example.demo.dtos;

import java.util.List;

import javax.persistence.OneToMany;

import com.example.demo.entities.Bill;
import com.example.demo.entities.MedicalHistory;
import com.example.demo.entities.enums.PatientStatus;

import lombok.Data;

@Data
public class PatientDto {

	private String name;

	private int age;

	private String phone;

}
