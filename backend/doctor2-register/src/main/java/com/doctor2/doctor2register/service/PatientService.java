package com.doctor2.doctor2register.service;
import com.doctor2.doctor2register.entity.details;

public interface PatientService  {
    
    details savePatientDetails(details d);

    String sendEmail(details d);
}
