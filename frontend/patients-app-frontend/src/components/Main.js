import { useNavigate } from "react-router-dom";
function Main(props){
    let navigate=useNavigate();
    function routeChange(){
            let path="/Info";
            navigate(path);
        }
    return(
    <div className="container">
        <h1>WELCOME TO ONLINE DOCTOR CONSULTATION PORTAL</h1>
        <br />
        <div className="doctor1">
            <h4>DOCTOR ID:125222</h4>
            <h2>Dr.Shrikant Kulkarni</h2>
            <h3>Specialization:General Physician</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:8</h4>
            <h4>25 years of Experience</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor2">
        <h4>DOCTOR ID:121222</h4>
            <h2>Dr.Pretty Sahu</h2>
            <h3>Specialization:General Physician</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:4</h4>
            <h4>11 years of Experience</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor3">
        <h4>DOCTOR ID:1241222</h4>
            <h2>Dr.Poonam Naphade</h2>
            <h3>Specialization:Deramtogolist</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:2</h4>
            <h4>10 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor4">
        <h4>DOCTOR ID:1245222</h4>
            <h2>Dr.Sauvik Chakrabarty</h2>
            <h3>Specialization:Dietician</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:9</h4>
            <h4>9 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor5">
        <h4>DOCTOR ID:1233222</h4>
            <h2>Dr.Paru Sharma</h2>
            <h3>Specialization:Gynacolagist</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:10</h4>
            <h4>15 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor6">
        <h4>DOCTOR ID:127222</h4>
            <h2>Dr.Sanjay Yadhav</h2>
            <h3>Specialization:Psychiatrist</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:4</h4>
            <h4>11 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor7">
        <h4>DOCTOR ID:125282</h4>
            <h2>Dr.Kavinesh</h2>
            <h3>Specialization:General Physician</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:8</h4>
            <h4>5 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>

        <div className="doctor8">
            <h4>DOCTOR ID:125221</h4>
            <h2>Dr.Amit Prabu</h2>
            <h3>Specialization:Dentist</h3>
            <h4>Price:350</h4>
            <h4>APPOINTMENTS per day:6</h4>
            <h4>6 years</h4>

            <button type="submit" onClick={routeChange}>BOOK APPOINTMENT</button>
        </div>
    </div>
    );
}
export default Main;