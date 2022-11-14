import Register from "./components/Register";
import Home from "./components/Home";
import Login from "./components/Login";
import {Routes,Route} from 'react-router-dom';
import Main from "./components/Main";
import Info from "./components/Info";
import Admin from "./components/Admin";
import AdminDB from "./components/AdminDB";

function App() {

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/Main" element={<Main />} />
        <Route path="/Info" element={<Info />} />
        <Route path="/Admin" element={<Admin />} />
        <Route path="/AdminDB" element={<AdminDB />} />
      </Routes>
    
    </div>
  );
}

export default App;
