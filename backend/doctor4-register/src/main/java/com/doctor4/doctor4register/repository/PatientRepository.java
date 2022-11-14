package com.doctor4.doctor4register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor4.doctor4register.entity.details;

@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
