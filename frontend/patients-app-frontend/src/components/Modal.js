import axios from "axios";
import React,{useState} from 'react';
function Modal(props){
    const[name1,setname]=useState("");
    const[specialization1,setspecialization]=useState("");
    const[price1,setprice]=useState("");
    const[appointments1,setappointments]=useState("");
    const[experience1,setexperience]=useState("");

    function cancelHandler(){
         props.onCancel();
    }

    function transfervalue(event){
        event.preventDefault();
        const val={
          name1,
          specialization1,
          price1,
          appointments1,
          experience1

        };
        props.func(val);
        clearState();
    };
    function clearState(){
        setname('');
        setspecialization('');
        setprice('');
        setappointments('');
        setexperience('');
    }
    function twofunctions(event){
        registerHandler(event);
        transfervalue(event);
    }
     
    async function registerHandler(event){
        event.preventDefault();
        try{
            await axios.post("http://localhost:8080/save",{
           name:name1,
           specialization:specialization1,
           price:price1,
           appointments:appointments1,
           experience:experience1
          });
          alert("user registered successfully");
          setname("");
          setspecialization("");
          setprice("");
          setappointments("");
          setexperience("");

         }
         catch(error){
            alert("failer registration");
         }
        }
        
    
    return(
        <div className="modal">
            <h2>ADD DOCTOR DETAILS</h2>
           <form>
            <input type="text" name="name1" value={name1}placeholder="Doctor Name"
            onChange={(event)=>{
                setname(event.target.value);
            }}
            />
            < br/>
            <input type="text" name="specialization1" value={specialization1}placeholder="Doctor Specialization" 
            onChange={(event)=>{
                setspecialization(event.target.value);
            }}
            />
            < br/>
            <input type="text"name="price1" value={price1} placeholder="Price for Consultation" 
            onChange={(event)=>{
                setprice(event.target.value);
            }}
            />
            < br/>
            <input type="text" name="appointments1" value={appointments1} placeholder="Appointments per day" 
            onChange={(event)=>{
                setappointments(event.target.value);
            }}
            />
            < br/>
            <input type="text" name="experience1" value={experience1} placeholder="No of years of experience" 
            onChange={(event)=>{
                setexperience(event.target.value);
            }}
            />
            < br/>

            <button onClick={twofunctions}>Save</button>
            < br/>
            <button onClick={cancelHandler}>Cancel</button>
           </form>
        </div>
    );
}
export default Modal;