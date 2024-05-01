package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Entity

@Data

@NoArgsConstructor
@AllArgsConstructor
public class ReporteTresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private ArrayList<String> tipo_reparacion;
    private String tiempo_reparacion;
    private int marca;
}
