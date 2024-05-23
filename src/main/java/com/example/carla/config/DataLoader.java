package com.example.carla.config;



import com.example.carla.model.CompensationData;
import com.example.carla.repository.CarlaDataRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class DataLoader {

    @Autowired
    private CarlaDataRepository repository;

    @Bean
    CommandLineRunner runner() {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<CompensationData>> typeReference = new TypeReference<>() {};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/compensation_data.json");
            try {
                List<CompensationData> compensationData = mapper.readValue(inputStream, typeReference);
                repository.saveAll(compensationData);
                System.out.println("Veriler başarıyla yüklendi!");
            } catch (IOException e) {
                System.out.println("Veri yüklenirken bir hata oluştu: " + e.getMessage());
            }
        };
    }
}

