import axios from "axios";
import {useState} from "react";

function Info(){
    const[name1,setname]=useState("");
     const[emailid1,setemailid]=useState("");
     const[age1,setage]=useState("");

     async function handleSubmit(event){
        event.preventDefault();
        try{
         await axios.post("http://localhost:8085/patients",{
           name:name1,
           emailid:emailid1,
           age:age1
         });
         alert("user registered successfully");
         setname("");
         setemailid("");
         setage("");
        }
        catch(err){
         alert("failer registration");
        }
  }
  async function mailsend(event){
    event.preventDefault();
    try{
        await axios.post("http://localhost:8085/sendEmail",{
            emailid:emailid1
        });
        alert("Mail sent Successfully");
        setname("");
         setemailid("");
         setage("");
    }
    catch(err){
        alert("Mail not sent");
    }
  }
  function twofunctions(event){
    handleSubmit(event);
    mailsend(event);
  }
  
    return(
         <div className="info">
            <h1 className="header">Please enter your information</h1>
            <form className="form" onSubmit={twofunctions}>
                <input type="text" name="name1" placeholder="Name"
                onChange={(event)=>{
                    setname(event.target.value);
                }}
                />
                <br />
                <br />
                <input type="text" placeholder="Email" name="emailid1"
                onChange={(event)=>{
                    setemailid(event.target.value);
                }}
                />
                <br />
                <br />
                <input type="text" placeholder="Age" name="age1"
                onChange={(event)=>{
                    setage(event.target.value);
                }}
                />
                <br />
                <br />
                

                <button type="submit">CONFIRM APPOINTMENT</button>

            </form>
         </div>
    );
}
export default Info;