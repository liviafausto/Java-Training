package edu.livia.secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//import edu.livia.secao8.entities.Product;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){
            read.nextLine();
            System.out.println("\nEmployee #" + (i+1) + ":");

            System.out.print("Id: ");
            Integer id = read.nextInt();
            while(hasId(employeeList, id) != null){
                System.out.println("Id already taken. Try again: ");
                id = read.nextInt();
            }

            read.nextLine();
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Salary: ");
            Double salary = read.nextDouble();

            Employee newEmployee = new Employee(id, name, salary);
            employeeList.add(newEmployee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        Integer id = read.nextInt();

        Employee luckyEmployee = employeeList.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        if(luckyEmployee == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = read.nextDouble();
            luckyEmployee.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for(Employee e : employeeList){
            System.out.println(e);
        }

        read.close();
    }

    // FUNÇÃO AUXILIAR
    public static Integer hasId(List<Employee> list, Integer id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }
}

// Problema exemplo 2: ler um vetor de classes
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

// Exercício de fixação: guardar e acessar os dados de um pensionato com vetor de classes
/*      Rent[] hostel = new Rent[10];
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
        }                                                       */
