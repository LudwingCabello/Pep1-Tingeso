import { useEffect, useState } from "react"
import vehiculoService from '../services/vehiculoService';
import { Link } from 'react-router-dom';

export default function ReporteUno() {
    const [patente, setPatente] = useState("");
    const [reporteuno, setReporteUno] = useState("");

    async function handleCrearReporteUno(e){
      e.preventDefault();
      try{
          const response = await vehiculoService.ReporteUno(patente);
          setReporteUno(response.data);
          setPatente("");
          alert("Reporte Uno generado ");
      }catch(error){
          console.log(error);
          alert("Error al calcular reporte Uno");
      }
  }

  

  return(
    <div>
        <div>
            <Link to="/">
                <button className="btn-accion">Inicio</button>
            </Link>
        </div>
        <h1 className="mb-4">Reporte Uno</h1>
        <div>
            <form>
                <div>
                    <label>
                        patente:
                        <input type="text" placeholder="Patente" value={patente} onChange={e => setPatente(e.target.value)} />
                    </label>
                </div>
                <button onClick={handleCrearReporteUno}>Calcular Reporte Uno</button>
            </form>
        </div>
        {reporteuno && (
            <div>
                <h2>Valores del Reporte</h2>
                <p>Valor Total: {reporteuno.valorTotal} </p>
                <p>Valor Reparaciones: {reporteuno.costo_reparaciones} </p>
                <p>Valor Descuentos: {reporteuno.descuentos} </p>
                <p>Valor Descuentos: {reporteuno.recargos} </p>
            </div>
        )}
    </div>
)
}


