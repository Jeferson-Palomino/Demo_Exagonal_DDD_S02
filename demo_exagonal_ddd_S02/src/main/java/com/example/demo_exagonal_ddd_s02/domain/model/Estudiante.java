package com.example.demo_exagonal_ddd_s02.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_alumno_id")
    @SequenceGenerator(sequenceName = "seq_alumno_id", name = "seq_alumno_id",allocationSize = 1)
    private Long id;
    private Integer dni;
    private String nombre;
    private String apellido;
    private String universidad;
    private String carrera;
    private  boolean estado;

    public Estudiante() {
    }

    public Estudiante(Long id, Integer dni, String nombre, String apellido, String universidad, String carrera, boolean estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.universidad = universidad;
        this.carrera = carrera;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
