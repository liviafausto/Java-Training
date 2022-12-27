package edu.livia.secao8.application;

//import edu.livia.secao8.entities.Triangle;
//import edu.livia.secao8.entities.Product;
//import edu.livia.secao8.entities.Rectangle;

import edu.livia.secao8.entities.Employee;

import javax.swing.plaf.BorderUIResource;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = read.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = read.nextDouble();
        System.out.print("Tax: ");
        employee.tax = read.nextDouble();
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary?: ");
        employee.increaseSalary(read.nextDouble());
        System.out.println("Updated data: " + employee);

        read.close();
    }
}

// Primeiro exemplo: calcular as áreas dos triângulos
/*      Triangle x, y;
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
        }                                                   */

// Segundo exemplo: ler e alterar dados de um produto em estoque
/*      Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = read.nextLine();
        System.out.print("Price: ");
        product.price = read.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = read.nextInt();

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(read.nextInt());
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(read.nextInt());
        System.out.println("Updated data: " + product);                             */

// Exercício proposto 1: calcular área, perímetro e diagonal de um retângulo
/*      Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = read.nextDouble();
        rectangle.height = read.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());*/
