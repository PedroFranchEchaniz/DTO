package com.example.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServicio {

    @Autowired
    private MatriculaMapper mapper;

    @Autowired
    private CocheRepository cocheRepositorio;

    @Autowired
    PersonaRepository personaRepositorio;

    public Matricula guardarMatricula (Matricula m){
        cocheRepositorio.save(mapper.toCoche(m));
        personaRepositorio.save(mapper.toPersona(m));
    return m;
    };
}
