package edu.livia.secao9;

import edu.livia.secao9.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Account acc;

        System.out.print("Enter account number: ");
        int number = read.nextInt();
        System.out.print("Enter account holder: ");
        read.nextLine();
        String name = read.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = read.nextLine();

        if(answer.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initialBalance = read.nextDouble();
            acc = new Account(number, name, initialBalance);
        } else {
            acc = new Account(number, name);
        }

        System.out.println("Account data: " + acc);

        System.out.print("\nEnter a deposit value: ");
        acc.deposit(read.nextDouble());
        System.out.println("Updated account data: " + acc);

        System.out.print("\nEnter a withdraw value: ");
        acc.withdraw(read.nextDouble());
        System.out.println("Updated account data: " + acc);

        read.close();
    }
}
