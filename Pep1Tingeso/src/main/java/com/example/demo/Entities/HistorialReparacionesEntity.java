package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
public class HistorialReparacionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String patente;

    @ElementCollection
    private List<Integer> reparaciones = new ArrayList<>();
    private int monto_total;

    private LocalDateTime fechaHoraIngreso; // Fecha y hora de ingreso
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraRetiro;

}
