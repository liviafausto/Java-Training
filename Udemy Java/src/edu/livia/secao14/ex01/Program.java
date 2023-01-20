package edu.livia.secao14.ex01;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Alex", 50, 20.00));
        employeeList.add(new OutsourcedEmployee("Bob", 100, 15.00, 200.00));
        employeeList.add(new Employee("Maria", 60, 20.00));

        System.out.println("PAYMENTS:");
        for(Employee e : employeeList){
            System.out.println(e.name + " - $ " + String.format("%.2f", e.payment()));
        }

    }
}
