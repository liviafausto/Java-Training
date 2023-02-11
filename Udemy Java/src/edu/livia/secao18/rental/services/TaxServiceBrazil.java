package edu.livia.secao18.rental.services;

public class TaxServiceBrazil implements TaxService {

    public double getTax(double amount){
        if(amount <= 100.00)
            return amount * 0.20;
        else
            return amount * 0.15;
    }

}
