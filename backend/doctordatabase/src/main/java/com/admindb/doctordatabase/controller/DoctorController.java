package com.admindb.doctordatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admindb.doctordatabase.entity.Details;
import com.admindb.doctordatabase.service.DoctorService;

//import antlr.collections.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

      @PostMapping("/save")
    public Details saveDoctorDetails(@RequestBody Details details){
        return doctorService.saveDoctorDetails(details);
    }
     
    @GetMapping("/fetch")
    public List<Details> GetDetails(){
        return doctorService.GetDetails();
    }
}
