package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Bill;

public interface BillRepo  extends CrudRepository<Bill, Integer>{

}
