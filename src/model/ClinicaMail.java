package model;

import java.io.Serializable;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class ClinicaMail implements Serializable{
    
    private String email, senha;

    public ClinicaMail(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean enviarEmail(String mensagem, String endereco, String assunto){
        SimpleEmail email = new SimpleEmail();
        
        try {
            email.setDebug(true);
            email.setHostName("smtp.gmail.com");
            email.setAuthentication(this.email, this.senha);
            email.setSSL(true);
            
            email.addTo(endereco);
            email.setFrom(this.email);
            email.setSubject(assunto);
            email.setMsg(mensagem);
            email.send();
            
            return true;
	} catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }
}