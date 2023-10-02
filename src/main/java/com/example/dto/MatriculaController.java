package com.example.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatriculaController {

    @Autowired
    private MatriculaServicio matriculaServicio;

    @PostMapping("/matricular/")
    public ResponseEntity<Matricula> guardar (@RequestBody Matricula m){
       return ResponseEntity.status(201).body(matriculaServicio.guardarMatricula(m));
    }
}
