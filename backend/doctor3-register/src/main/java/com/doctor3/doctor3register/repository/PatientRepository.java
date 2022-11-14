package com.doctor3.doctor3register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor3.doctor3register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}

