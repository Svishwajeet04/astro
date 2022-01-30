//package com.example.demo.entities;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//import lombok.Data;
//
//@Entity
//@Data
//public class OTBooking {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public Integer id;
//
//	@ManyToOne(targetEntity = Patient.class)
//	private Patient patient;
//
//	@ManyToOne(targetEntity = Employee.class)
//	private Employee refferedBy;
//
//	@ManyToOne(targetEntity = OT.class)
//	private OT operation;
//
//	private Date date;
//
//	@OneToOne(targetEntity = Operation.class)
//	private Operation OtObject;
//
//}
