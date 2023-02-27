package edu.livia.secao18.loan;

import java.util.Locale;
import java.util.Scanner;

// Interface - default methods
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();
        System.out.print("Months: ");
        int months = scan.nextInt();

        InterestService brazilInterest = new BrazilInterest(2.0);
        double brazilianPayment = brazilInterest.payment(amount, months);
        System.out.println();
        System.out.println("Payment after " + months + " months in Brazil: ");
        System.out.printf("%.2f\n", brazilianPayment);

        InterestService usInterest = new UsInterest(1.0);
        double usPayment = usInterest.payment(amount, months);
        System.out.println();
        System.out.println("Payment after " + months + " months in the US: ");
        System.out.printf("%.2f\n", usPayment);

        scan.close();
    }
}
