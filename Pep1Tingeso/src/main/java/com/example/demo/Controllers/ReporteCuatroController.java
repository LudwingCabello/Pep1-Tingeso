/*
package com.example.demo.Controllers;

import com.example.demo.Entities.ReporteCuatroEntity;
import com.example.demo.Services.ReporteCuatroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/reportecuatro")
@CrossOrigin("*")
public class ReporteCuatroController {
    @Autowired
    ReporteCuatroService reporteCuatroService;

    @GetMapping("/")
    public ResponseEntity<ReporteCuatroEntity> getReporteById(@RequestBody int id ){
        ReporteCuatroEntity reporte = reporteCuatroService.getReporteById(id);
        return ResponseEntity.ok(reporte);
    }

    @GetMapping("/")
    public ResponseEntity<ArrayList<ReporteCuatroEntity>> getVehiculosByTipo(@RequestBody String tipo){
        ArrayList<ReporteCuatroEntity> vehiculos = reporteCuatroService.getVehiculosByTipo(tipo);
        return ResponseEntity.ok(vehiculos);
    }

    @PostMapping ("/")
    public ResponseEntity<ReporteCuatroEntity> saveReporte(@RequestBody ReporteCuatroEntity reporte){
        ReporteCuatroEntity reporteNew = reporteCuatroService.saveReporte(reporte);
        return ResponseEntity.ok(reporteNew);
    }
}

 */
