//package com.example.demo.entities;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import lombok.Data;
//
//@Entity
//@Data
//public class Operation {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//
//	@OneToMany(targetEntity = Employee.class)
//	private List<Employee> performedBy;
//
//	@OneToOne(targetEntity = OTBooking.class)
//	private OTBooking bookingDetails;
//
//	private Date date;
//
//	private String result;
//
//	@OneToOne(targetEntity = Operation.class, mappedBy = "OtObject")
//	private Operation OtObject;
//}
