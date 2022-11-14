package com.admindb.doctordatabase.entity;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctors_details")
public class Details {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String specialization;
    private Long price;
    private Long appointments;
    private Long experience;
    @Override
    public String toString() {
        return "Details [id=" + id + ", name=" + name + ", specialization=" + specialization + ", price=" + price
                + ", appointments=" + appointments + ", experience=" + experience + "]";
    }
    public Details() {
    }
    public Details(Long id, String name, String specialization, Long price, Long appointments, Long experience) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.price = price;
        this.appointments = appointments;
        this.experience = experience;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getAppointments() {
        return appointments;
    }
    public void setAppointments(Long appointments) {
        this.appointments = appointments;
    }
    public Long getExperience() {
        return experience;
    }
    public void setExperience(Long experience) {
        this.experience = experience;
    }


}
