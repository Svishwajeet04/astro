package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.entities.enums.BedType;

import lombok.Data;

@Entity
@Data
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private BedType bedType;

	private boolean status;

	private String location;

}
