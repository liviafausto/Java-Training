package edu.livia.secao19.generics.method;

// Exemplo 2: Como usar Generics em um método

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Computer", 890.50));
        list.add(new Product("Iphone X", 910.00));
        list.add(new Product("Tablet", 550.00));
        System.out.println("List: " + list);

        Product max = CalculationService.max(list);
        System.out.println("Most expensive: " + max);
    }
}
