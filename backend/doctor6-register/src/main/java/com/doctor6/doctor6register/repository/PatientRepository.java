package com.doctor6.doctor6register.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor6.doctor6register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
