/*
package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Data

@NoArgsConstructor
@AllArgsConstructor
public class ReporteDosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @ElementCollection
    private List<String> tipo_auto = new ArrayList<>();

    private int costo_total;

}
*/