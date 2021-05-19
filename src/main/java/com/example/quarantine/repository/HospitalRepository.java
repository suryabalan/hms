package com.example.quarantine.repository;

import com.example.quarantine.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query("select h from Hospital h where h.state_id = :state_id GROUP BY h.district")
    List<Hospital> findHospitalByStateId(@Param("state_id") long state_id);

    @Query("SELECT h from Hospital h GROUP BY h.state_id ORDER BY h.state")
    List<Hospital> getAllStates();

    @Query("SELECT h from Hospital h WHERE h.district = :district")
    List<Hospital> getHospitalsByDistrict(@Param("district") String district);
}
//    @Query("select h from Hospital h where h.state_id = :state_id")
//    List<Hospital> findHospitalByStateId(@Param("state_id") long state_id);