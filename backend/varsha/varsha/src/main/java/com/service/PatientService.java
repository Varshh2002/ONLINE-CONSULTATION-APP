package com.varsha.varsha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varsha.varsha.model.request.PatientLoginRequest;
import com.varsha.varsha.model.request.PatientRegistrationRequest;
import com.varsha.varsha.repository.PatientRepository;
@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepository;
    public boolean addPatient(PatientRegistrationRequest patient) {
     patientRepository.save(patient);
     return true;
    }

    public boolean isEmployeeCredentialsIsValid(PatientLoginRequest patient) {
        return patientRepository.findBymobileno(patient.getMobileno()).isPresent();
    }
    
}
