package com.example.demo.dtos;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.enums.TestSampleType;

import lombok.Data;

@Data
public class TestBookingDto {

	private int patient;

	private int refferedBy;

	private List<Integer> testsIds;

	private TestSampleType sampleType;

	private String sampleId;

}
