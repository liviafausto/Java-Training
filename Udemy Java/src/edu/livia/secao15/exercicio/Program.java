package edu.livia.secao15.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        try{
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = read.nextInt(); read.nextLine();

            System.out.print("Holder: ");
            String holder = read.nextLine();

            System.out.print("Initial balance: ");
            double balance = read.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = read.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = read.nextDouble();
            account.withdraw(amount);

            System.out.printf("New balance: %.2f\n", account.getBalance());
        }
        catch (AmountException invalidAmount){
            System.out.println("Withdraw error: " + invalidAmount.getMessage());
        }
        catch (RuntimeException unexpected){
            System.out.println("Unexpected error.");
        }

    }
}
