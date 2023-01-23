package edu.livia.secao15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner read = new Scanner(System.in);
        SimpleDateFormat SIMPLE_DATE = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: "); int number = read.nextInt(); read.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): "); Date in = SIMPLE_DATE.parse(read.nextLine());
        System.out.print("Check-out date (dd/MM/yyyy): "); Date out = SIMPLE_DATE.parse(read.nextLine());

        if(!out.after(in)){
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        } else {
            Reservation reservation = new Reservation(number, in, out);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): "); in = SIMPLE_DATE.parse(read.nextLine());
            System.out.print("Check-out date (dd/MM/yyyy): "); out = SIMPLE_DATE.parse(read.nextLine());

            String error = reservation.updateDates(in, out);

            if(error != null){
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }

    }
}
