package edu.livia.secao14.ex01;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee(){
        
    }

    public Employee(String name, Integer hours, Double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return hours * valuePerHour;
    }
}
