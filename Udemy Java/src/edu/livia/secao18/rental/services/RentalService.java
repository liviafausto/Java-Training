package edu.livia.secao18.rental.services;

import edu.livia.secao18.rental.entities.CarRental;
import edu.livia.secao18.rental.entities.Invoice;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double subtotal;
        double hours = carRental.getDurationInHours();

        if(hours <= 12.0)
            subtotal = pricePerHour * Math.ceil(hours);
        else
            subtotal = pricePerDay * Math.ceil(hours / 24.0);

        double tax = taxService.getTax(subtotal);

        carRental.setInvoice(new Invoice(subtotal, tax));
    }
}
