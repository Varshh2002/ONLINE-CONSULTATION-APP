import { useNavigate } from "react-router-dom";
function Login(){
    let navigate=useNavigate();
    function routeChangeLogin(){
        let path="/Main";
        navigate(path);
    }
    return(
     <div className="container">
        <h1>LOGIN FORM</h1>
         <input type="text" placeholder="Mobile No" />
        <br />
        <br />
        <button type="submit" onClick={routeChangeLogin}>Submit</button>
     </div>
    );
}
export default Login;