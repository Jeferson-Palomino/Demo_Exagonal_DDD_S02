package com.example.demo_exagonal_ddd_s02.domain.service;

import com.example.demo_exagonal_ddd_s02.domain.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante crear(Estudiante estudiante);
    List<Estudiante> obtenerTodos();
    Estudiante findById(Long id);
}
