package com.example.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable {

    private String id;
    private String nombrePropietario;
    private String placa;
    private String marca;
    private String modelo;

}
