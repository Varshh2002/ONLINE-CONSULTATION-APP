package com.varsha.varsha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varsha.varsha.model.request.PatientLoginRequest;
//import com.varsha.varsha.model.request.PatientRegistrationRequest;
@Repository
public interface PatientRepository extends JpaRepository<PatientLoginRequest,String> {


    
    public Optional<PatientLoginRequest> findBymobileno(String mobileno);

    

    //public Optional<PatientRegistrationRequest> existyByEmailid(String emailid);
    
}
