package com.doctor2.doctor2register.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor2.doctor2register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
