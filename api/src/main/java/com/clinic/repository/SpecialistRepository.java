package com.clinic.repository;

import com.clinic.domain.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by japnica on 12/22/2016.
 */
public interface SpecialistRepository extends JpaRepository<Specialist, Integer>{
    List<Specialist> findAll();
    Optional<Specialist> findOneById(Integer id);
    void delete(Specialist s);
}
