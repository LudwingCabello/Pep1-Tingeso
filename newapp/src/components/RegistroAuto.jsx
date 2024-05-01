import { useEffect, useState } from "react"
import vehiculoService from "../services/vehiculoService.js";

export default function saveVehiculo() {
    const [patente, setPatente] = useState("");
    const [marca, setMarca] = useState("");
    const [modelo, setModelo] = useState("");
    const [tipo, setTipo] = useState("");
    const [year_fabricacion, setYear_Fabricacion] = useState("");
    const [motor, setMotor] = useState("");
    const [asientos, setAsientos] = useState("");
    const [kilometraje, setKilometraje] = useState("");
    
    
    async function handleCrearVehiculo(e) {
        e.preventDefault();
        try{
            const response = await vehiculoService.CrearVehiculo({
            patente,
            marca,
            modelo,
            tipo,
            year_fabricacion,
            motor,
            asientos,
            kilometraje
        })


        setPatente("");
        setMarca("");
        setModelo("");
        setTipo("");
        setYear_Fabricacion("");
        setMotor("");
        setAsientos("");
        setKilometraje("");
        alert("Vehiculo registrado con exito");
        }catch(error){
            console.log(error);
            alert("Error al registrar vehiculo");
        }
    }


    return (
        <div className="container">
          <h1 className="mb-4">Registrar Vehiculo</h1>
          <form className="border row g-3 px-4" onSubmit={handleCrearVehiculo}>
    
            <div className="col-md-6 mr-md-3">
              <label htmlFor="patente" className="form-label">Patente</label>
              <input id="patente" type="text" className="form-control" 
              value={patente} 
              onChange={e => setPatente(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="marca" className="form-label">Marca</label>
              <input id="marca" type="text" className="form-control" 
              value={marca} 
              onChange={e => setMarca(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="modelo" className="form-label">Modelo</label>
              <input id="modelo" type="text" className="form-control" 
              value={modelo} 
              onChange={e => setModelo(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="tipo" className="form-label">Tipos</label>
              <input id="tipo" type="text" className="form-control" 
              value={tipo} 
              onChange={e => setTipo(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="year_fabricacion" className="form-label">Año fabricación</label>
              <input id="year_fabricacion" type="number" className="form-control" 
              value={year_fabricacion} 
              onChange={e => setYear_Fabricacion(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="motor" className="form-label">Motor</label>
              <input id="motor" type="text" className="form-control" 
              value={motor} 
              onChange={e => setMotor(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="asientos" className="form-label">Asientos</label>
              <input id="asientos" type="number" className="form-control" 
              value={asientos} 
              onChange={e => setAsientos(e.target.value)} />
            </div>

            <div className="col-md-6 mr-md-3">
              <label htmlFor="kilometraje" className="form-label">Kilometraje</label>
              <input id="kilometraje" type="number" className="form-control" 
              value={kilometraje} 
              onChange={e => setKilometraje(e.target.value)} />
            </div>
            <button type="submit" className="btn btn-primary">Registrar Vehiculo</button>
          </form>
        </div>
    )
}

