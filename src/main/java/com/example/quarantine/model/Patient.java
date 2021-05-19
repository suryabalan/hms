package com.example.quarantine.model;

import javax.persistence.*;

@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Patient_Name")
    private String patient_name;

    @Column(name = "Patient_Ph_no")
    private String patient_ph_no;

    @Column(name = "Hospital_Id")
    private long hospital_id;

    public Patient(){

    }

    public Patient(long id, String patient_name, String patient_ph_no, long hospital_id) {
        this.id = id;
        this.patient_name = patient_name;
        this.patient_ph_no = patient_ph_no;
        this.hospital_id = hospital_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_ph_no() {
        return patient_ph_no;
    }

    public void setPatient_ph_no(String patient_ph_no) {
        this.patient_ph_no = patient_ph_no;
    }

    public long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(long hospital_id) {
        this.hospital_id = hospital_id;
    }
}
