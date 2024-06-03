package com.example.tp3_springboot.model.repository;


import com.example.tp3_springboot.model.core.MaterialDidatico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialDidaticoRepository extends MongoRepository<MaterialDidatico, String> {
}
