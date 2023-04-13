package com.example.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atividade2.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
}
