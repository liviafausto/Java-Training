package edu.livia.secao8.entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convert(double currency, double amount){
        double total = currency * amount;
        total += total*IOF;
        return total;
    }
}
