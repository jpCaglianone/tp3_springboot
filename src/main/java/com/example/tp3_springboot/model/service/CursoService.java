package com.example.tp3_springboot.model.service;

import com.example.tp3_springboot.model.core.Curso;
import com.example.tp3_springboot.model.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Optional<Curso> findById(Long id) {
        return repository.findById(id);
    }

    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
