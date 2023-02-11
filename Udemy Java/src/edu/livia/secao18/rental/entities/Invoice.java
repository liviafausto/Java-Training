package edu.livia.secao18.rental.entities;

public class Invoice {
    private double subtotal;
    private double tax;

    public Invoice(double subtotal, double tax) {
        this.subtotal = subtotal;
        this.tax = tax;
    }

    public double getTotalPayment(){
        return subtotal + tax;
    }

    @Override
    public String toString(){
        return "INVOICE\n"
                + "Subtotal: $" + String.format("%.2f\n", subtotal)
                + "Tax: $" + String.format("%.2f\n", tax)
                + "Total payment: $" + String.format("%.2f\n", getTotalPayment());
    }
}
