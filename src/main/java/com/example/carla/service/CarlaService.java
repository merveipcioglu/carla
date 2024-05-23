package com.example.carla.service;

import com.example.carla.model.CompensationData;
import com.example.carla.repository.CarlaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarlaService {

    @Autowired
    private CarlaDataRepository repository;

    public List<CompensationData> getAllCompensationData() {
        return repository.findAll();
    }

    public CompensationData getCompensationDataById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<CompensationData> getCompensationDataBySalaryAndZipCode(int salary, int zipCode) {
        return repository.findBySalaryGreaterThanEqualAndZipCode(salary, zipCode);
    }

    public List<CompensationData> getAllCompensationDataSorted(String sortBy) {
        return repository.findAll(Sort.by(sortBy));
    }
}
