package com.varsha.varsha.model.request;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class PatientLoginRequest {
    @Id
    private String mobileno;
   
    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public PatientLoginRequest(String mobileno) {
        this.mobileno = mobileno;
    }
}
