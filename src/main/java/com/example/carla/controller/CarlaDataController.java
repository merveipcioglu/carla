package com.example.carla.controller;

import com.example.carla.model.CompensationData;
import com.example.carla.service.CarlaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carla")
public class CarlaDataController {

    @Autowired
    private CarlaService service;

    @GetMapping
    public List<CompensationData> getAllCompensationData() {
        return service.getAllCompensationData();
    }

    @GetMapping("/{id}")
    public CompensationData getCompensationDataById(@PathVariable Long id) {
        return service.getCompensationDataById(id);
    }

    @GetMapping("/filter")
    public List<CompensationData> getCompensationDataByFilter(@RequestParam(required = false) Integer salary,
                                                              @RequestParam(required = false) Integer zipCode) {
        if (salary != null && zipCode != null) {
            return service.getCompensationDataBySalaryAndZipCode(salary, zipCode);
        } else {
            
            return null;
        }
    }

    @GetMapping("/sort")
    public List<CompensationData> getAllCompensationDataSorted(@RequestParam String sortBy) {
        return service.getAllCompensationDataSorted(sortBy);
    }
}
