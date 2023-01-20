package edu.livia.secao14.ex01;

public final class OutsourcedEmployee extends Employee {
    Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        final double BONUS = 1.10;
        return (hours * valuePerHour) + (additionalCharge * BONUS);
    }
}
