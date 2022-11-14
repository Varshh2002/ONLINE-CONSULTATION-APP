package com.varsha.varsha.model.response;

public class PatientLoginResponse extends PatientResponse{
    private final boolean loginSuccess;
    public PatientLoginResponse(String description){
        super(description);
        loginSuccess=false;
    }
    public PatientLoginResponse(boolean loginSuccess,String description){
        super(description);
        this.loginSuccess=loginSuccess;
    }
    public String getDescription(){
        return description;
    }
    public boolean isLoginSuccess(){
        return loginSuccess;
    }
}
