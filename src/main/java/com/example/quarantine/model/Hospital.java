package com.example.quarantine.model;

import javax.persistence.*;

@Entity
@Table(name = "Hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Hospital_Name")
    private String hospital_name;

    @Column(name = "State")
    private String state;

    @Column(name = "District")
    private String district;

    @Column(name = "Total_Num_Beds")
    private long total_num_beds;

    @Column(name = "District_Id")
    private long district_id;

    @Column(name = "State_Id")
    private long state_id;

    @Column(name = "Location")
    private String location;

    @Column(name = "Pincode")
    private long pincode;

    @Column(name = "Location_Coordinates")
    private String location_coordinates;

    public Hospital(){

    }

    public Hospital(long id, String hospital_name, String state, String district, long total_num_beds, long district_id, long state_id, String location, long pincode, String location_coordinates) {
        this.id = id;
        this.hospital_name = hospital_name;
        this.state = state;
        this.district = district;
        this.total_num_beds = total_num_beds;
        this.district_id = district_id;
        this.state_id = state_id;
        this.location = location;
        this.pincode = pincode;
        this.location_coordinates = location_coordinates;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public long getTotal_num_beds() {
        return total_num_beds;
    }

    public void setTotal_num_beds(long total_num_beds) {
        this.total_num_beds = total_num_beds;
    }

    public long getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(long district_id) {
        this.district_id = district_id;
    }

    public long getState_id() {
        return state_id;
    }

    public void setState_id(long state_id) {
        this.state_id = state_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getLocation_coordinates() {
        return location_coordinates;
    }

    public void setLocation_coordinates(String location_coordinates) {
        this.location_coordinates = location_coordinates;
    }
}
