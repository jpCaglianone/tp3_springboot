package com.example.tp3_springboot.model.repository;

import com.example.tp3_springboot.model.core.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
