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
public class ReporteUnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String patente;
    @ElementCollection
    private List<String> boletas = new ArrayList<>();
    private int valorTotal;
    private int costo_reparaciones;
    private int descuentos;
    private int recargos;

}
