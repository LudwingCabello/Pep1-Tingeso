package com.example.demo.Services;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Repositories.HistorialReparacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;

@Service
public class HistorialReparacionesService {
    @Autowired
    HistorialReparacionesRepository historialReparacionesRepository;

    public HistorialReparacionesEntity saveHistorial(HistorialReparacionesEntity historial)
    {return historialReparacionesRepository.save(historial);}

    public ArrayList<HistorialReparacionesEntity> getHistoriallByPatente(String patente)
    {return (ArrayList<HistorialReparacionesEntity>) historialReparacionesRepository.findAllByPatente(patente);}
}