package com.example.quarantine.controller;

import com.example.quarantine.model.Vm;
import com.example.quarantine.repository.VmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1")

public class VController {

    @Autowired
    private VmRepository vmRepository;

    //Get All Patients
    @GetMapping("/vm")
    public List<Vm> getAlldoc() {
        return vmRepository.findAll();
    }

    // Create Patient Rest API
    
}

