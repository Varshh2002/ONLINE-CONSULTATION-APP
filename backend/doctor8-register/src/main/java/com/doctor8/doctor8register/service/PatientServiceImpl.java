package com.doctor8.doctor8register.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.doctor8.doctor8register.entity.details;
import com.doctor8.doctor8register.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository pr;
    @Override
    public details savePatientDetails(details d) {
        return pr.save(d);
    }
    private JavaMailSender sender;

    @Autowired
    public PatientServiceImpl(JavaMailSender sender){
        this.sender=sender;
    }
    public String sendEmail(details d) throws MailException{
       try{
        SimpleMailMessage mail=new SimpleMailMessage();
        mail.setTo(d.getemailid());
        mail.setFrom("varshavidhya009@gmail.com");
        mail.setSubject("Hey Thank You Contacting ONLINE DOCTOR CONSULTATION PORTAL");
        mail.setText("YOUR APPOINTMENT WITH THE DOCTOR HAS BEEN FIXED!WE WILL CONTACT YOU SHORTLY");

        sender.send(mail);
        return "Email sent Successfully";
        //System.out.println("Mail sent Succesfully");
       }
       catch (Exception e) {
        return "Error while Sending Mail";
    }
    }
}
