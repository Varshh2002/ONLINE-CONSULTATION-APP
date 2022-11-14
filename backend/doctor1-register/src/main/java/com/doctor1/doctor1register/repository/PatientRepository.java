package com.doctor1.doctor1register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor1.doctor1register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
