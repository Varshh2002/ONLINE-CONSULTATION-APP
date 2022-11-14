//import { useNavigate } from "react-router-dom";
//import axios from "axios";
import{useState} from 'react';
import Modal from './Modal';
import Backdrop from './Backdrop';
import jsonData from './dummy.json';
function AdminDB(){
       const[modalIsOpen,SetModalIsOpen]=useState(false);
       const[studentData,setStudentData]=useState(jsonData);

       function addRows(data){
      const total=studentData.length;
      data.id=total+1;
      const update=[...studentData];
      update.push(data);
      setStudentData(update);
       }
       const tableRows = studentData.map((info) => {
        return (
            <tr>
            <td>{info.id}</td>
            <td>{info.name}</td>
            <td>{info.specialization}</td>
            <td>{info.price}</td>
            <td>{info.appointments}</td>
            <td>{info.specialization}</td>
            <td><button>Delete</button></td>
            <td><button>Update</button></td>
            </tr>
          );
      });

     function deleteHandler(props){
         SetModalIsOpen(true);
     }
     function closeModalHandler(props){
        SetModalIsOpen(false);
        <Modal func={addRows}/>
     }
        return(
        <div className="db">
            <div className="nav">
            <h1>DOCTOR DATABASE</h1>
            <button className="add" onClick={deleteHandler}>ADD+</button>
            </div>
            <table className="table">
                <thead>
                    <tr>
                    <th>Doctor Id</th>
                    <th>Doctor Name</th>
                    <th>Doctor Specialization</th>
                    <th>Price for Consultation</th>
                    <th>Appointments per day</th>
                    <th>Years of Experience</th>
                    <th>Delete</th>
                    <th>Update</th>
                    </tr>
                </thead>
                <tbody>
                    {tableRows}
                    
                    </tbody>
                
            </table>
            
           {modalIsOpen? <Modal onCancel={closeModalHandler} />:null}
           {modalIsOpen? <Backdrop onClick={closeModalHandler}/>:null}
           
        </div>
    );
}
export default AdminDB;