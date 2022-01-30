package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Bed;
import com.example.demo.entities.enums.BedType;

@Repository
public interface BedRepo extends CrudRepository<Bed, Integer> {

	List<Bed> findAllByBedTypeAndStatus(BedType bedType, boolean b);

}
