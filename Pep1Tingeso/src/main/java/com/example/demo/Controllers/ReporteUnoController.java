package com.example.demo.Controllers;

import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Services.ReporteUnoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reporteuno")
@CrossOrigin("*")
public class ReporteUnoController {
    @Autowired
    ReporteUnoService reporteUnoService;

    @GetMapping("/reporteuno/{id}")
    public ResponseEntity<ReporteUnoEntity> getReporteById(@PathVariable int id ){
        ReporteUnoEntity reporte = reporteUnoService.getReporteById(id);
        return ResponseEntity.ok(reporte);
    }


    @GetMapping("/reporteuno/{reportes}")
    public ResponseEntity<ArrayList<ReporteUnoEntity>> getReportesUno(@PathVariable String patente){
        ArrayList<ReporteUnoEntity> reportes = reporteUnoService.getReportesUno(patente);
        return ResponseEntity.ok(reportes);
    }


    @GetMapping("/calcularReporteuno/{patenteauto}")
    public ResponseEntity<ReporteUnoEntity> calcularReporteUno(@PathVariable String patenteauto){
        ReporteUnoEntity reporteuno = reporteUnoService.calcularReporteUno(patenteauto);
        return ResponseEntity.ok(reporteuno);
    }

    @GetMapping ("/reporteuno/{patente}")
    public ResponseEntity<ReporteUnoEntity> getReporteUno(@PathVariable String patente){
        ReporteUnoEntity reporteuno = reporteUnoService.getReporteUno(patente);
        return ResponseEntity.ok(reporteuno);
    }

    @PostMapping ("/savereporteuno")
    public ResponseEntity<ReporteUnoEntity> saveReporte(@RequestBody ReporteUnoEntity reporte){
        ReporteUnoEntity reporteNew = reporteUnoService.saveReporte(reporte);
        return ResponseEntity.ok(reporteNew);
    }




}
