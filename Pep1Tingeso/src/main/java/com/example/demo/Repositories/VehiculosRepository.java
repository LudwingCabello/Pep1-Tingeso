package com.example.demo.Repositories;

import com.example.demo.Entities.VehiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;

@Repository
public interface VehiculosRepository extends JpaRepository<VehiculosEntity, String> {
    public VehiculosEntity findByPatente(String patente);
    public ArrayList<VehiculosEntity> findAllByMarca(String marca);
    public ArrayList<VehiculosEntity> findAllByTipo(String tipo);
    public ArrayList<VehiculosEntity> findAllByMotor(String motor);





}
