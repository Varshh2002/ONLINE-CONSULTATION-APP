package com.doctor7.doctor7register.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor7.doctor7register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
