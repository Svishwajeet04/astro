package com.example.demo.entities;

import java.util.Date;
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
public class MedicalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	private Patient patient;

	@ManyToOne
	private Employee doctor;

	private Date date;

	private Date todate;

	private String diagnosis;

	private String medicines;

	private boolean admitted;

	private boolean testSuggested;

	private String reports;

	private boolean operationSuggested;

	@ManyToOne(targetEntity = Department.class)
	private Department department;

//	@OneToMany(targetEntity = OTBooking.class)
//	private List<OTBooking> otbooking;

	@OneToMany(targetEntity = BedBooking.class)
	private List<BedBooking> bedBookings;

	@OneToMany(targetEntity = TestBooking.class)
	private List<TestBooking> testBookings;

}
