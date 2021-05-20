package com.example.quarantine.repository;

import com.example.quarantine.model.Virtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualRepository extends JpaRepository<Virtual, Long> {
}

