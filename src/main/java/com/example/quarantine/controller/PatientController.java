package com.example.quarantine.controller;

import com.example.quarantine.exception.ResourceNotFoundException;
import com.example.quarantine.model.Patient;
import com.example.quarantine.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000","https://reacthms.azurewebsites.net"})
@RestController
@RequestMapping("api/v1")

public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    //Get All Patients
    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Create Patient Rest API
    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    // Get Patient by id
    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable long id){
        Patient patient = patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient Not Found in ID : " + id));
        return ResponseEntity.ok(patient);
    }
}










