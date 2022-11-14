package com.varsha.varsha.model.request;

//import javax.annotation.Generated;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Table;

//import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="patients")
public class PatientRegistrationRequest extends PatientLoginRequest{
    private String name;
    private String emailid;
    private String address;
    
    public PatientRegistrationRequest(String mobileno, String name, String emailid, String address) {
        super(mobileno);
        this.name = name;
        this.emailid = emailid;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
