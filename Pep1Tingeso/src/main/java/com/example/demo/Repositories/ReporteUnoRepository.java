
package com.example.demo.Repositories;

import com.example.demo.Entities.ReporteUnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;
import java.util.ArrayList;

public interface ReporteUnoRepository extends JpaRepository<ReporteUnoEntity, Integer> {
    public ReporteUnoEntity findById(int id);
    public ReporteUnoEntity findByPatente(String patente);
    public ArrayList<ReporteUnoEntity> findAllByPatente(String patente);
}
