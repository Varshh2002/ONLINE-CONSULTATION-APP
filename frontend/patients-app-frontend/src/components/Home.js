import { useNavigate } from "react-router-dom";
//import '../Services/styles/Home.css'
function Home(){

    let navigate=useNavigate();
  function routechange(){
    let path="/login";
    navigate(path);
  }

  //let navigate=useNavigate();
  function route(){
    let path="/register";
    navigate(path);
  }
  function routeAdmin(){
    let path="/Admin";
    navigate(path);
  }
    return(
   <div className="home">
      <h1>ONLINE MEDICAL CONSULTATION</h1>
        <div className="card">
        <button type="submit" className="btn1" onClick={routechange}>Login</button>
        <br />
        <br />
        <button type="submit" className="btn2" onClick={route}>Sign up</button>
        <br />
        <br />
        <button type="submit" className="btn3" onClick={routeAdmin}>Admin SignIn</button>
        </div>
   </div>
    );
}
export default Home;