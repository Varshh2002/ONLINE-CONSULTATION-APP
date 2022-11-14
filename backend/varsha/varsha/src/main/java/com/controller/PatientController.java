package com.varsha.varsha.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varsha.varsha.model.request.PatientLoginRequest;
import com.varsha.varsha.model.request.PatientRegistrationRequest;
import com.varsha.varsha.model.response.PatientLoginResponse;
import com.varsha.varsha.model.response.PatientRegistrationResponse;
import com.varsha.varsha.service.PatientService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class PatientController {
     @Autowired
     private PatientService patientService;

     @PostMapping(path="/register" ,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)

     public ResponseEntity<PatientRegistrationResponse> addPatient(@RequestBody PatientRegistrationRequest patient){
        if(patientService.addPatient(patient)){
            return ResponseEntity.status(HttpStatus.CREATED).body(new PatientRegistrationResponse(true, "Success"));
        }
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new PatientRegistrationResponse(false,"Email already registered"));
     }


     @PostMapping(path = "/login",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<PatientLoginResponse> login(@RequestBody PatientLoginRequest patient){
        if(patientService.isEmployeeCredentialsIsValid(patient)){
            return ResponseEntity.ok().body(new PatientLoginResponse(true,"Success"));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new PatientLoginResponse(false,"Invalid Credentials"));
     }
}
