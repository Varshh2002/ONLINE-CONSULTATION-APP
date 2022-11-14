package com.admindb.doctordatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.ResponseBody;
import com.admindb.doctordatabase.entity.Details;

@Repository
public interface DoctorRepository extends JpaRepository<Details,Long> {
    
}
