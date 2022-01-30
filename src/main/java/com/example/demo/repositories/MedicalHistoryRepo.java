package com.example.demo.repositories;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.MedicalHistory;
import com.example.demo.entities.Patient;

public interface MedicalHistoryRepo extends CrudRepository<MedicalHistory, Integer> {

//	Optional<MedicalHistory> findByPatientAndDate(Patient patient, LocalDateTime date);

	Optional<MedicalHistory> findByPatientAndTodate(Patient patient, Date date);

}
