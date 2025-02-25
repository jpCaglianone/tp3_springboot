package com.example.tp3_springboot.model.service;

import com.example.tp3_springboot.model.core.Aluno;
import com.example.tp3_springboot.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }

    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
