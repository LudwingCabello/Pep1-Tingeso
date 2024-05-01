package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
public class HistorialReparacionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String fecha_ingreso;
    private String hora_ingreso;
    private String tipo_reparacion;
    private int monto_total;
    private String fecha_salida;
    private String hora_salida;
    private String fecha_retiro;
    private String hora_retiro;


}
