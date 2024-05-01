/*
package com.example.demo.Services;

import com.example.demo.Entities.ReporteDosEntity;
import com.example.demo.Repositories.ReporteDosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;

@Service
public class ReporteDosService {
    @Autowired
    ReporteDosRepository reporteDosRepository;

    @Autowired
    VehiculosService vehiculosService;

    @Autowired
    HistorialReparacionesService historialReparacionesService;

    public ReporteDosEntity getReporteById(int id) {return reporteDosRepository.findById(id);}

    public ArrayList<ReporteDosEntity> getVehiculosByTipo(String tipo) {return (ArrayList<ReporteDosEntity>) reporteDosRepository.findAllByTipo(tipo); }

    public ReporteDosEntity saveReporte(ReporteDosEntity reporteDos) {return reporteDosRepository.save(reporteDos);}

    public String calcularReporteDos(String tipo){

        return "index";
    }

}
 */
