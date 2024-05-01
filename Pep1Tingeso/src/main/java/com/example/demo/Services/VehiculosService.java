package com.example.demo.Services;

import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Repositories.VehiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;

@Service
public class VehiculosService {
    @Autowired
    VehiculosRepository vehiculosRepository;

    public ArrayList<VehiculosEntity> getVehiculos() {return (ArrayList<VehiculosEntity>) vehiculosRepository.findAll(); }

    public VehiculosEntity saveVehiculo(VehiculosEntity vehiculo) {return vehiculosRepository.save(vehiculo);}

    public VehiculosEntity getVehiculo(String patente) {return  vehiculosRepository.findByPatente(patente);}

    public ArrayList<VehiculosEntity> getVehiculosByMarca(String marca) {return (ArrayList<VehiculosEntity>) vehiculosRepository.findAllByMarca(marca);}

    public ArrayList<VehiculosEntity> getVehiculosByTipo(String tipo) {return (ArrayList<VehiculosEntity>) vehiculosRepository.findAllByTipo(tipo); }

    public ArrayList<VehiculosEntity> getVehiculosByMotor(String motor) {return (ArrayList<VehiculosEntity>) vehiculosRepository.findAllByMotor(motor); }



}
