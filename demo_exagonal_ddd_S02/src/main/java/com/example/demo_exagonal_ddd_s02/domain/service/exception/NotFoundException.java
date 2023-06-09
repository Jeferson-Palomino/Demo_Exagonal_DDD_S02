package com.example.demo_exagonal_ddd_s02.domain.service.exception;

public class NotFoundException extends RuntimeException {
    private static final String DESCRIPTION = "No se encontro el recuerso especificado ";

    public NotFoundException(String message) {
        super(String.format("%s : %s", DESCRIPTION, message));
    }
}
