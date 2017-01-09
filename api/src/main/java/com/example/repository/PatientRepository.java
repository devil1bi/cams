package com.example.repository;

import com.example.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by japnica on 12/23/2016.
 */
public interface PatientRepository extends JpaRepository<Patient, Integer>{
    List<Patient> findAll();
    Optional<Patient> findOneById(Integer id);
    void delete(Patient p);
}