package edu.livia.secao13.exFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        SimpleDateFormat fmtDate = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        client.setName(read.nextLine());
        System.out.print("Email: ");
        client.setEmail(read.nextLine());
        System.out.print("Birth date (DD/MM/YYYY): ");
        client.setBirthDate(fmtDate.parse(read.nextLine()));

        Order order = new Order();

        order.setMoment(new Date());
        order.setClient(client);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        order.setStatus(OrderStatus.valueOf(read.nextLine()));

        System.out.print("How many items to this order? ");
        int numberItems = read.nextInt();

        for(int i=0; i<numberItems; i++){
            Product product = new Product();

            read.nextLine();
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            product.setName(read.nextLine());
            System.out.print("Product price: ");
            product.setPrice(read.nextDouble());

            OrderItem item = new OrderItem();

            item.setProduct(product);
            item.setPrice(product.getPrice());
            System.out.print("Quantity: ");
            item.setQuantity(read.nextInt());

            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);
    }
}
