import React from 'react';
import { Link } from 'react-router-dom';

const PaginaPrincipal = () => {
  return (
    <div className="pagina-principal">
      <h1>AutoFix - Sistema de Gestión de Reparaciones</h1>
      <div className="acciones-menu">
        <Link to="/registro-auto">
          <button className="btn-accion">Registro de Auto</button>
        </Link>
        <Link to="/registro-reparacion">
          <button className="btn-accion">Registro de Reparaciones</button>
        </Link>
        <Link to="/calculo-costo">
          <button className="btn-accion">Cálculo de Costo Total de Reparaciones</button>
        </Link>
      </div>
      <div className="reportes-menu">
        <Link to="/reportes">
          <button className="btn-reporte">Reportes</button>
        </Link>
      </div>
    </div>
  );
};

export default PaginaPrincipal;
