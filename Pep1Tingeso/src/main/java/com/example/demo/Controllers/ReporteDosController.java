/*
package com.example.demo.Controllers;

import com.example.demo.Entities.ReporteDosEntity;
import com.example.demo.Services.ReporteDosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/reportedos")
@CrossOrigin("*")
public class ReporteDosController {
    @Autowired
    ReporteDosService reporteDosService;

    @GetMapping("/")
    public ResponseEntity<ReporteDosEntity> getReporteById(@RequestBody int id ){
        ReporteDosEntity reporte = reporteDosService.getReporteById(id);
        return ResponseEntity.ok(reporte);
    }

    @GetMapping("/")
    public ResponseEntity<ArrayList<ReporteDosEntity>> getVehiculosByTipo(@RequestBody String tipo){
        ArrayList<ReporteDosEntity> vehiculos = reporteDosService.getVehiculosByTipo(tipo);
        return ResponseEntity.ok(vehiculos);
    }

    @PostMapping ("/")
    public ResponseEntity<ReporteDosEntity> saveReporte(@RequestBody ReporteDosEntity reporte){
        ReporteDosEntity reporteNew = reporteDosService.saveReporte(reporte);
        return ResponseEntity.ok(reporteNew);
    }


}

 */
