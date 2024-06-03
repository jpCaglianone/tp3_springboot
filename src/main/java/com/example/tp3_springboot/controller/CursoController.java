package com.example.tp3_springboot.controller;

import com.example.tp3_springboot.model.core.Curso;
import com.example.tp3_springboot.model.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping
    public List<Curso> getAllCursos() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Curso> getCursoById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return service.save(curso);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso curso) {
        curso.setId(id);
        return service.save(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        service.deleteById(id);
    }
}
