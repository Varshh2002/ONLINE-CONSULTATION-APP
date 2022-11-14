package com.doctor8.doctor8register.service;
import com.doctor8.doctor8register.entity.details;
public interface PatientService {
    details savePatientDetails(details d);

    String sendEmail(details d);
}
