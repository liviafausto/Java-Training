package edu.livia.secao10;

public class Rent {
    private String name;
    private String email;

    public Rent(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return name + ", " + email;
    }
}
