package com.example.carla.repository;

import com.example.carla.model.CompensationData;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarlaDataRepository extends JpaRepository<CompensationData, Long> {
    List<CompensationData> findBySalaryGreaterThanEqualAndZipCode(int salary, int zipCode);
    List<CompensationData> findAll(Sort sort);
}
