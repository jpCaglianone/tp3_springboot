package com.example.tp3_springboot.model.repository;

import com.example.tp3_springboot.model.core.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
