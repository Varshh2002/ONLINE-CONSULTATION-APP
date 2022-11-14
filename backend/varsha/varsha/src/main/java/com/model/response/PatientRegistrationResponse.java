package com.varsha.varsha.model.response;


public class PatientRegistrationResponse extends PatientResponse{
    
    private final boolean registrationSuccess;
    public PatientRegistrationResponse(String descrption){
        super(descrption);
        registrationSuccess=false;
    }
    public PatientRegistrationResponse(boolean registrationSuccess,String description){
        super(description);
        this.registrationSuccess=registrationSuccess;
    }
    public boolean isRegistrationSuccess(){
        return registrationSuccess;
    }
}
