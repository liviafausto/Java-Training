package edu.livia.secao14.ex03;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<TaxPayer> taxPayerList = new ArrayList<>();
        double sum = 0d;

        taxPayerList.add(new Individual("Alex", 50000.00, 2000.00));
        taxPayerList.add(new Company("SoftTech", 400000.00, 25));
        taxPayerList.add(new Individual("Bob", 120000.00, 1000.00));

        System.out.println("TAXES PAID:");
        for(TaxPayer taxPayer : taxPayerList){
            System.out.println(taxPayer);
            sum += taxPayer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
    }
}
