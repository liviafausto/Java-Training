package edu.livia.secao14.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> productList = new ArrayList<>();

        productList.add(new ImportedProduct("Tablet", 260.00, 20.00));
        productList.add(new Product("Laptop", 1100.00));
        productList.add(new UsedProduct("Iphone", 400.00, dateFormat.parse("15/03/2017")));

        for(Product p : productList){
            System.out.println(p.priceTag());
        }

    }
}
