//import { useState } from "react"
import { useNavigate } from "react-router-dom";
function Admin(){

    let navigate=useNavigate();
    function routechange(){
        let path="/AdminDB";
        navigate(path);
    }
    let res=0;
    function fun(event){
        event.preventDefault();
        if(event.target.value=="admin"){
          res++;
        }
    }
    function fun1(event){
        event.preventDefault();
        if(event.target.value=="admin123"){
            res++;
        }
    }
    function handleSubmit(){
        if(res==2){
            window.alert("Admin login successfull");
            routechange();
        }
        else{
            window.alert("Admin login not successfull");
        }
    }
    return(
      <div className="admin">
        <h1>Please Enter your Admin Credentials</h1>
        <form type="submit" onSubmit={handleSubmit}>
            <input type="text" name="uname" placeholder="Name"
            onChange={(event)=>{
                fun(event);
            }}
            />
            <br />
            <br />
            <input type="text" name="pass" placeholder="Password"
            onChange={(event)=>{
                fun1(event);
            }}
            />
            <br />
            <br />
            <button type="submit">Login</button>
        </form>
      </div>
    );
}
export default Admin;