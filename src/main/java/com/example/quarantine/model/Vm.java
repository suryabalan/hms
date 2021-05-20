package com.example.quarantine.model;


import javax.persistence.*;

@Entity
@Table(name = "vadamalayan")
public class Vm {
    
    @Id
    

    @Column(name = "Doctors")
    private String doctors;

    @Column(name = "Departments")
    private String departments;

    public Vm(){

    }

    public Vm( String doctors, String departments) {
        
        this.doctors = doctors;
        this.departments = departments;
        
    }

    

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    

    
}

