package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data

@NoArgsConstructor
@AllArgsConstructor
public class VehiculosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String patente;
    private String marca;
    private String modelo;
    private String tipo;
    private String year_fabricacion;
    private String tipo_motor;
    private int asientos;
    private int kilometraje;




}
