package com.admindb.doctordatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admindb.doctordatabase.entity.Details;
import com.admindb.doctordatabase.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService {


    @Autowired
    private DoctorRepository doctorrepo;
    @Override
    public Details saveDoctorDetails(Details details) {
        return doctorrepo.save(details);
    }
    @Override
    public List<Details> GetDetails() {
        return doctorrepo.findAll();
    }
    
}
