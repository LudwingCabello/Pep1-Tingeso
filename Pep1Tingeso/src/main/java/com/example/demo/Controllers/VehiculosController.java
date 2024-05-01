package com.example.demo.Controllers;

import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Services.VehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
@CrossOrigin("*")
public class VehiculosController {
    @Autowired
    VehiculosService vehiculosService;

    @GetMapping("/listarvehiculos")
    public ResponseEntity<List<VehiculosEntity>> listVehiculos(){
        List<VehiculosEntity> vehiculos = vehiculosService.getVehiculos();
        return ResponseEntity.ok(vehiculos);
        /*entro entidad respuesta con una lista de vehiculos
        * el .ok es que funciono , es para mandar dos valores al mismo tiempo
        * para guardar dos valores al mismo tiempo*/
    }

    @GetMapping ("/getvehiculos/{patente}")
    public ResponseEntity<VehiculosEntity> getVehiculo(@PathVariable String patente){
        VehiculosEntity vehiculo = vehiculosService.getVehiculo(patente);
        return ResponseEntity.ok(vehiculo);
    }

    @GetMapping("/getvehiculos/{marca}")
    public ResponseEntity<ArrayList<VehiculosEntity>> getVehiculosByMarca(@PathVariable String marca){
        ArrayList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByMarca(marca);
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping("/getvehiculos/{tipo}")
    public ResponseEntity<ArrayList<VehiculosEntity>> getVehiculosByTipo(@PathVariable String tipo){
        ArrayList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByTipo(tipo);
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping("/getvehiculos/{motor}")
    public ResponseEntity<ArrayList<VehiculosEntity>> getVehiculosByMotor(@PathVariable String motor){
        ArrayList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByMotor(motor);
        return ResponseEntity.ok(vehiculos);
    }


    @PostMapping("/savevehiculo")
    public ResponseEntity<VehiculosEntity> saveVehiculo(@RequestBody VehiculosEntity vehiculo){
        VehiculosEntity vehiculoNew = vehiculosService.saveVehiculo(vehiculo);
        return ResponseEntity.ok(vehiculoNew);
    }


}
