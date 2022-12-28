package edu.livia.secao10;

import java.util.Locale;
import java.util.Scanner;
import edu.livia.secao8.entities.Product;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        Product[] vector = new Product[n];

        for(int i=0; i<n; i++){
            read.nextLine();
            String name = read.nextLine();
            double price = read.nextDouble();
            vector[i] = new Product(name, price);
        }

        for(int i=0; i<n; i++){
            System.out.println(vector[i]);
        }

        read.close();
    }
}
