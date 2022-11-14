import { useNavigate } from "react-router-dom";
//import '../Services/styles/register.css';
function Register(){

    let navigate=useNavigate();
    function routechange(){
        let path="/Main";
        navigate(path);
    }

    
    return(
   <div className="register">
    <h1>REGISTERATION CREDENTIALS</h1>
    <form className="form">
        <input type="text" placeholder="Name" />
        <br />
        <input type="text" placeholder="Email id" />
        <br />
        <input type="text" placeholder="Address" />
        <br />
        <input type="text" placeholder="Mobile No" />
         <br />
         <br />
         <br />
         
        <button type="submit" onClick={routechange}>Submit</button>
    </form>
   </div>
    );
}
export default Register;