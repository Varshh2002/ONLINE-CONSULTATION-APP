package com.doctor5.doctor5register.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor5.doctor5register.entity.details;
import com.doctor5.doctor5register.service.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/patients")
    public details savePatientDetails(@RequestBody details d){
        return patientService.savePatientDetails(d);
    }
    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody details d){
        String status=patientService.sendEmail(d);
        return status;
    }
}
