import axios from "axios";

const VEHICULOS_URL = "http://pep1tingesoludwingc.brazilsouth.cloudapp.azure.com/vehiculos";
const HISTORIAL_URL = "http://pep1tingesoludwingc.brazilsouth.cloudapp.azure.com/HistorialReparaciones";
const REPORTEUNO_URL = "http://pep1tingesoludwingc.brazilsouth.cloudapp.azure.com/reporteuno/calcularReporteuno";

function CrearVehiculo(vehiculo) {
    console.log("Saving vehicle:", vehiculo);
    return axios.post(`${VEHICULOS_URL}/savevehiculo`, vehiculo);
  }

function RegistroReparaciones(reparacion){
    return axios.post(`${HISTORIAL_URL}/savehistorial`, reparacion);
}

function ReporteUno(patente){
  console.log("Haciendo reporte 1 de:", patente);
  return axios.get(`${REPORTEUNO_URL}/${patente}`);
}

export default {CrearVehiculo, RegistroReparaciones, ReporteUno}