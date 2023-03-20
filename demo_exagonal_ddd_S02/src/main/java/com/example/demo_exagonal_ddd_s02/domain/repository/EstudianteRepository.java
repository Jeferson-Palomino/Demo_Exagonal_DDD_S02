package com.example.demo_exagonal_ddd_s02.domain.repository;

import com.example.demo_exagonal_ddd_s02.domain.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {

}
