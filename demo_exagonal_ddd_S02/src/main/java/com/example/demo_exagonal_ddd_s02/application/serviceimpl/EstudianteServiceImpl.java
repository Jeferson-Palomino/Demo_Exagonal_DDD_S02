package com.example.demo_exagonal_ddd_s02.application.serviceimpl;

import com.example.demo_exagonal_ddd_s02.domain.model.Estudiante;
import com.example.demo_exagonal_ddd_s02.domain.repository.EstudianteRepository;
import com.example.demo_exagonal_ddd_s02.domain.service.EstudianteService;
import com.example.demo_exagonal_ddd_s02.domain.service.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    @Override
    public Estudiante crear(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Long id) {
        Optional<Estudiante> optionalEstudiante = estudianteRepository.findById(id);
        if (optionalEstudiante.isPresent()){
            return  optionalEstudiante.get();
        }else {
            throw new NotFoundException("Este estudiante no existe");
        }
    }
}
