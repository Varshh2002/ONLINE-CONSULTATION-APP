package com.admindb.doctordatabase.service;

import java.util.List;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.admindb.doctordatabase.entity.Details;

public interface DoctorService {

   public  Details saveDoctorDetails(Details details);

public List<Details> GetDetails();
    
}
