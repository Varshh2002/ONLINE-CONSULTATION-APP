package com.doctor7.doctor7register.service;
import com.doctor7.doctor7register.entity.details;
public interface PatientService {
    details savePatientDetails(details d);

    String sendEmail(details d);
}
