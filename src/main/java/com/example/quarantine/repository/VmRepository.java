package com.example.quarantine.repository;

import com.example.quarantine.model.Vm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VmRepository extends JpaRepository<Vm, Long> {
}
