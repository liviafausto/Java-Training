package edu.livia.secao8.application;

import edu.livia.secao8.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.ladoA = read.nextDouble();
        x.ladoB = read.nextDouble();
        x.ladoC = read.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.ladoA = read.nextDouble();
        y.ladoB = read.nextDouble();
        y.ladoC = read.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
