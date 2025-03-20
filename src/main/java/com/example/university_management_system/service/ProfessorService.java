package com.example.university_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university_management_system.model.Professor;
import com.example.university_management_system.repository.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Optional<Professor> getProfessorByName(String name) {
        return professorRepository.findByName(name);
    }

    public Professor saveProfessor(Professor professor) {
        return professorRepository.save(professor);
    }
}
