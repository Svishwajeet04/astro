package com.example.demo.dtos;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.entities.Laboratory;
import com.example.demo.entities.TestParameters;

import lombok.Data;

@Data
public class TestTypeDto {

	private String name;

	private String process;

	private int labId;

	private int price;

}
