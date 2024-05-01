import React from 'react';
import { Link } from 'react-router-dom';

const Reportes = () => {
  return (
    <div className="pagina-reportes">
      <h1>Reportes</h1>
      <div className="reportes-submenu">
        <Link to="/report1">
          <button className="btn-reporte">Reporte 1</button>
        </Link>
        <Link to="/report2">
          <button className="btn-reporte">Reporte 2</button>
        </Link>
        <Link to="/report3">
          <button className="btn-reporte">Reporte 3</button>
        </Link>
        <Link to="/report4">
          <button className="btn-reporte">Reporte 4</button>
        </Link>
      </div>
    </div>
  );
};

export default Reportes;
