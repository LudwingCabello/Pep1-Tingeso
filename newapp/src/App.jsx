import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import PaginaPrincipal from './components/PaginaPrincipal';
import Reportes from './components/Reportes'; 
import RegistroAuto from './components/RegistroAuto';
import RegistroReparaciones from './components/RegistroReparacion';


function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/" element={<PaginaPrincipal />} />
          <Route path="/reportes" element={<Reportes />} />  
          <Route path="/registro-auto" element={<RegistroAuto />} />
          <Route path="/registro-reparacion" element={<RegistroReparaciones />} />    
        </Routes>
      </div>
    </Router>
  );
}

export default App;
