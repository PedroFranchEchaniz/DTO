package com.example.dto;

import org.springframework.stereotype.Component;

@Component
public class MatriculaMapper {

    public Coche toCoche(Matricula m){
        return Coche.builder()
                .placa(m.getPlaca())
                .marca(m.getMarca())
                .modelo(m.getModelo())
                .propietario(m.getNombrePropietario())
                .build();
    };

    public Persona toPersona (Matricula m){
        return Persona.builder()
                .id(m.getId())
                .nombre(m.getNombrePropietario())
                .build();
    };
}
