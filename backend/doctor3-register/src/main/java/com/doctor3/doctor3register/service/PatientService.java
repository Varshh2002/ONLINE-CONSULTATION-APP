package com.doctor3.doctor3register.service;

import com.doctor3.doctor3register.entity.details;

public interface PatientService {

    details savePatientDetails(details d);

    String sendEmail(details d);

    
    
}
