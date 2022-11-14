package com.doctor1.doctor1register.service;

import com.doctor1.doctor1register.entity.details;

public interface PatientService {

    details savePatientDetails(details d);

    String sendEmail(details d);

    
    
}
