package com.doctor5.doctor5register.service;

import com.doctor5.doctor5register.entity.details;
public interface PatientService {
    details savePatientDetails(details d);

    String sendEmail(details d);
}
