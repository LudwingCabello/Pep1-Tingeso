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
public class ReporteDosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private ArrayList<String> tipo_reparacion;
    private ArrayList<String> tipo_auto;
    private int costo_total;

}
