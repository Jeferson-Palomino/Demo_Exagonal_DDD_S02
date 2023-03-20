package com.example.demo_exagonal_ddd_s02.infraestructure.rest;

import com.example.demo_exagonal_ddd_s02.domain.model.Estudiante;
import com.example.demo_exagonal_ddd_s02.domain.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-estudiante/v01/estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }
    @GetMapping("/listar")
    public List<Estudiante> listar(){
        return estudianteService.obtenerTodos();
    }

    @PostMapping("/crear")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.crear(estudiante);
    }
}
