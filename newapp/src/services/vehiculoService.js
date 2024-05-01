import axios from "axios";

const VEHICULOS_URL = "http://localhost:80/vehiculos";
const HISTORIAL_URL = "http://localhost:80/HistorialReparaciones";

function CrearVehiculo(vehiculo) {
    console.log("Saving vehicle:", vehiculo);
    return axios.post(`${VEHICULOS_URL}/savevehiculo`, vehiculo);
  }



function RegistroReparaciones(reparacion){
    return axios.post(`${HISTORIAL_URL}/savehistorial`, reparacion);
}

export default {CrearVehiculo, RegistroReparaciones}