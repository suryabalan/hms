package com.example.quarantine.controller;

import com.example.quarantine.exception.ResourceNotFoundException;
import com.example.quarantine.model.Hospital;
import com.example.quarantine.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class HospitalController {

    @Autowired
    private HospitalRepository hospitalRepository;

    //get all hospitals
    @GetMapping("/hospitals")
    public List<Hospital> getAllHospitals(){
        return hospitalRepository.findAll();
    }

    //Create Hospital Rest Api
    @PostMapping("/hospitals")
    public Hospital createHospital(@RequestBody Hospital hospital){
        return hospitalRepository.save(hospital);
    }

    // Get Hospital by ID
    @GetMapping("/hospitals/{id}")
    public ResponseEntity<Hospital> getHospitalById(@PathVariable long id){
        Hospital hospital = hospitalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hospital Not Found in ID : " + id));
        return ResponseEntity.ok(hospital);
    }

    // update total beds after patient booking
    @PutMapping("/hospitals/{id}")
    public ResponseEntity<Hospital> updateHospital(@PathVariable long id){
        Hospital hospital = hospitalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hospital Not Found in ID : " + id));

        hospital.setTotal_num_beds(hospital.getTotal_num_beds() - 1);

        Hospital updatedHospital = hospitalRepository.save(hospital);
        return ResponseEntity.ok(updatedHospital);
    }

    // Get Hospital by State ID

    @GetMapping("/hospitals/states/{state_id}")
    public List<Hospital> getStatesById(@PathVariable long state_id){
        return hospitalRepository.findHospitalByStateId(state_id);
    }

    @GetMapping("hospitals/states")
    public List<Hospital> getAllStates(){
        return hospitalRepository.getAllStates();
    }

    @GetMapping("/hospitals/districts/{district}")
    public List<Hospital> getHospitalByDistrict(@PathVariable String district){
        return hospitalRepository.getHospitalsByDistrict(district);
    }
}








// update hospital
//    @PutMapping("/hospitals/{id}")
//    public ResponseEntity<Hospital> updateHospital(@PathVariable long id, @RequestBody Hospital hospitalDetails){
//        Hospital hospital = hospitalRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hospital Not Found in ID : " + id));
//
//        hospital.setHospital_name(hospitalDetails.getHospital_name());
//        hospital.setDistrict(hospitalDetails.getDistrict());
//        hospital.setState(hospitalDetails.getState());
//        hospital.setTotal_num_beds(hospitalDetails.getTotal_num_beds() - 1);
//
//        Hospital updatedHospital = hospitalRepository.save(hospital);
//        return ResponseEntity.ok(updatedHospital);
//    }