package com.doctor7.doctor7register.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.context.annotation.Bean;

@Entity
@Table(name="doctor7")
public class details {
    private String name;
   @Id  private String emailid;
    private String age;
    
    @Override
    public String toString() {
        return "details [name=" + name + ", emailid=" + emailid + ", age=" + age + "]";
    }
    public details() {
    }
    
    public details(String name, String emailid, String age) {
        this.name = name;
        this.emailid = emailid;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getemailid() {
        return emailid;
    }
    public void setemailid(String emailid) {
        this.emailid = emailid;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
