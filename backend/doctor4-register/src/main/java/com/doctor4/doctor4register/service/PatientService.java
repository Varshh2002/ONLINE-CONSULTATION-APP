package com.doctor4.doctor4register.service;

import com.doctor4.doctor4register.entity.details;

public interface PatientService {
    details savePatientDetails(details d);

    String sendEmail(details d);
}
