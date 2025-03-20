package com.example.university_management_system.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.university_management_system.model.Professor;

public interface ProfessorRepository extends MongoRepository<Professor, String> {
    Optional<Professor> findByName(String name);
}
