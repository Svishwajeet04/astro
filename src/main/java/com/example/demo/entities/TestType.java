package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TestType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private String process;

	@ManyToOne(targetEntity = Laboratory.class)
	private Laboratory lab;

	@OneToMany(targetEntity = TestParameters.class, mappedBy = "testType")
	private List<TestParameters> parameters;

	private int price;
}
