//package com.example.demo.entities;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//
//import lombok.Data;
//
//@Entity
//@Data
//public class OT {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public Integer id;
//
//	private String name;
//
//	private String location;
//
//	@ManyToMany(targetEntity = Employee.class)
//	private List<Employee> staffForOT;
//
//	@ManyToOne(targetEntity = Department.class)
//	private Department department;
//
//	private int price;
//}
