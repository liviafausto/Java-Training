package edu.livia.secao13.exFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static final SimpleDateFormat FMT_DATE = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return  name + " (" + FMT_DATE.format(birthDate) + ") - " + email;
    }
}
