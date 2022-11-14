package com.doctor5.doctor5register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor5.doctor5register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
