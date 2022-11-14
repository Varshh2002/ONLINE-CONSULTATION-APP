package com.doctor6.doctor6register.service;
import com.doctor6.doctor6register.entity.details;
public interface PatientService {
    details savePatientDetails(details d);

    String sendEmail(details d);
}
