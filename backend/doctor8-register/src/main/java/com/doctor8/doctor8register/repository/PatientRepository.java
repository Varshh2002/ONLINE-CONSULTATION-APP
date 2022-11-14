package com.doctor8.doctor8register.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor8.doctor8register.entity.details;
@Repository
public interface PatientRepository extends JpaRepository<details,String> {
    
}
