package com.example.carla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.carla.model") 
@EnableJpaRepositories("com.example.carla.repository") 
public class CarlaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarlaApplication.class, args);
    }

}
