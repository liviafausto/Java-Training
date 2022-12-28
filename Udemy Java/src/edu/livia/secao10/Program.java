package edu.livia.secao10;

import java.util.Locale;
import java.util.Scanner;
//import edu.livia.secao8.entities.Product;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Rent[] hostel = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){
            read.nextLine();
            System.out.println("\nRent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Email: ");
            String email = read.nextLine();
            System.out.print("Room: ");
            int room = read.nextInt();
            hostel[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for(int i=0; i<10; i++){
            if(hostel[i] != null){
                System.out.println(i + ": " + hostel[i]);
            }
        }

        read.close();
    }
}

// Problema exemplo 2: ler um vetor de objetos
/*      int n = read.nextInt();
        Product[] vector = new Product[n];

        for(int i=0; i<n; i++){
            read.nextLine();
            String name = read.nextLine();
            double price = read.nextDouble();
            vector[i] = new Product(name, price);
        }

        for(int i=0; i<n; i++){
            System.out.println(vector[i]);
        }                                       */
