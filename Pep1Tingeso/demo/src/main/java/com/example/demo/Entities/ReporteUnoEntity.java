package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.swing.*;
import java.util.List;

@Entity

@Data

@NoArgsConstructor
@AllArgsConstructor
public class ReporteUnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private int id_vehiculo;
    private ArrayList<HistorialReparacionesEntity> reparaciones;
    private int costo_reparaciones;
    private int descuentos;
    private int recargos;





}
