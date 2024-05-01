import React, { useState } from "react";
import vehiculoService from "../services/vehiculoService.js";


export default function RegistroReparaciones() {
    const [patente, setPatente] = useState("");
    const [reparaciones, setReparaciones] = useState("");
    const [montoTotal, setMontoTotal] = useState(0);
    const [fechaHoraIngreso, setFechaHoraIngreso] = useState("");
    const [fechaHoraSalida, setFechaHoraSalida] = useState("");
    const [fechaHoraRetiro, setFechaHoraRetiro] = useState("");

    const handleCrearReparacion = async (e) => {
        e.preventDefault();
        try {
            const reparacion = {
                patente,
                reparaciones: reparaciones.split(",").map(rep => parseInt(rep.trim())),
                monto_total: montoTotal,
                fechaHoraIngreso,
                fechaHoraSalida,
                fechaHoraRetiro
            };

            await vehiculoService.RegistroReparaciones(reparacion);

            // Restablecer los campos del formulario después de enviar la reparación
            setPatente("");
            setReparaciones("");
            setMontoTotal(0);
            setFechaHoraIngreso("");
            setFechaHoraSalida("");
            setFechaHoraRetiro("");
            alert("Reparación registrada con éxito");
        } catch (error) {
            console.log("Error:", error);
            alert("Error al registrar la reparación");
        }
    };

    return (
        <div className="container">
            <h1 className="mb-4">Registrar Reparación</h1>
            <form className="border row g-3 px-4" onSubmit={handleCrearReparacion}>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="patente" className="form-label">Patente</label>
                    <input id="patente" type="text" className="form-control" value={patente} onChange={e => setPatente(e.target.value)} />
                </div>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="reparaciones" className="form-label">Reparaciones (separadas por comas)</label>
                    <input id="reparaciones" type="text" className="form-control" value={reparaciones} onChange={e => setReparaciones(e.target.value)} />
                </div>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="montoTotal" className="form-label">Monto Total</label>
                    <input id="montoTotal" type="number" className="form-control" value={montoTotal} onChange={e => setMontoTotal(e.target.value)} />
                </div>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="fechaHoraIngreso" className="form-label">Fecha y Hora de Ingreso</label>
                    <input id="fechaHoraIngreso" type="datetime-local" className="form-control" value={fechaHoraIngreso} onChange={e => setFechaHoraIngreso(e.target.value)} />
                </div>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="fechaHoraSalida" className="form-label">Fecha y Hora de Salida</label>
                    <input id="fechaHoraSalida" type="datetime-local" className="form-control" value={fechaHoraSalida} onChange={e => setFechaHoraSalida(e.target.value)} />
                </div>
                <div className="col-md-6 mr-md-3">
                    <label htmlFor="fechaHoraRetiro" className="form-label">Fecha y Hora de Retiro</label>
                    <input id="fechaHoraRetiro" type="datetime-local" className="form-control" value={fechaHoraRetiro} onChange={e => setFechaHoraRetiro(e.target.value)} />
                </div>
                <button type="submit" className="btn btn-primary">Registrar Reparación</button>
            </form>
        </div>
    );
}
