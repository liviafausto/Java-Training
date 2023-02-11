package edu.livia.secao18.rental;

import edu.livia.secao18.rental.entities.CarRental;
import edu.livia.secao18.rental.entities.Vehicle;
import edu.livia.secao18.rental.services.RentalService;
import edu.livia.secao18.rental.services.TaxServiceBrazil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        //Scanner scan = new Scanner(System.in);
        final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Example of a car rental
        String model = "Civic";
        LocalDateTime pickupDate = LocalDateTime.parse("25/01/2023 10:30", FMT_DATE);
        LocalDateTime returnDate = LocalDateTime.parse("27/01/2023 11:40", FMT_DATE);
        double pricePerHour = 10d;
        double pricePerDay = 130d;

        Vehicle car = new Vehicle(model);
        CarRental carRental = new CarRental(car, pickupDate, returnDate);
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new TaxServiceBrazil());
        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice());
    }
}
