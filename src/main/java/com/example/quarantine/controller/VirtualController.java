package com.example.quarantine.controller;

import com.example.quarantine.exception.ResourceNotFoundException;
import com.example.quarantine.model.Virtual;
import com.example.quarantine.repository.VirtualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000","https://reacthms.azurewebsites.net"})
@RestController
@RequestMapping("api/v1")

public class VirtualController {

    @Autowired
    private VirtualRepository virtualRepository;

    //Get All Virtual
    @GetMapping("/virtual")
    public List<Virtual> getAllVirtual() {
        return virtualRepository.findAll();
    }

    
    @PostMapping("/virtual")
    public Virtual createVirtual(@RequestBody Virtual virtual) {
        return virtualRepository.save(virtual);
    }

   
}
