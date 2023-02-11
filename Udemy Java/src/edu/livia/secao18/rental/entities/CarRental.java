package edu.livia.secao18.rental.entities;


import java.time.Duration;
import java.time.LocalDateTime;

public class CarRental {
    private Vehicle car;
    private LocalDateTime start;
    private LocalDateTime finish;

    private Invoice invoice;

    public CarRental(Vehicle car, LocalDateTime start, LocalDateTime finish) {
        this.car = car;
        this.start = start;
        this.finish = finish;
    }

    public void setInvoice(Invoice invoice){ this.invoice = invoice; }
    public Invoice getInvoice(){ return invoice; }

    public double getDurationInHours(){
        double minutes = Duration.between(start, finish).toMinutes();
        return (minutes / 60.0);
    }

}
