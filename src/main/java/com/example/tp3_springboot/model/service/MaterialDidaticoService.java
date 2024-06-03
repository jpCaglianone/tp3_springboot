package com.example.tp3_springboot.model.service;


import com.example.tp3_springboot.model.core.MaterialDidatico;
import com.example.tp3_springboot.model.repository.MaterialDidaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialDidaticoService {

    @Autowired
    private MaterialDidaticoRepository repository;

    public List<MaterialDidatico> findAll() {
        return repository.findAll();
    }

    public Optional<MaterialDidatico> findById(String id) {
        return repository.findById(id);
    }

    public MaterialDidatico save(MaterialDidatico materialDidatico) {
        return repository.save(materialDidatico);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
