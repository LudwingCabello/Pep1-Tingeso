package com.example.demo.Repositories;

import com.example.demo.Entities.HistorialReparacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;

@Repository
public interface HistorialReparacionesRepository extends JpaRepository<HistorialReparacionesEntity, String> {

    public ArrayList<HistorialReparacionesEntity> findAllByPatente(String patente);

}
