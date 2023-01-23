package edu.livia.secao15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        SimpleDateFormat SIMPLE_DATE = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = read.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = SIMPLE_DATE.parse(read.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = SIMPLE_DATE.parse(read.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = SIMPLE_DATE.parse(read.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = SIMPLE_DATE.parse(read.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException dateFormat){
            System.out.println("Error: Invalid date format.");
        }
        catch (DomainException updateError){
            System.out.println("Error in reservation: " + updateError.getMessage());
        }
        catch(RuntimeException unexpected){
            System.out.println("Unexpected error."); // Pega qualquer exceção do tipo "RuntimeException"
        }

    }
}
