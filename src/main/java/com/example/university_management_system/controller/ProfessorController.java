package com.example.university_management_system.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university_management_system.model.Professor;
import com.example.university_management_system.service.ProfessorService;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("/{name}/courses")
    public Optional<Professor> getCoursesByProfessor(@PathVariable String name) {
        return professorService.getProfessorByName(name);
    }

    @PostMapping("/add")
    public Professor addProfessor(@RequestBody Professor professor) {
        return professorService.saveProfessor(professor);
    }
}
