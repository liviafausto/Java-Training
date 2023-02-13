package edu.livia.secao18.contracts.services;

public interface PaymentService {

    public double paymentFee(double amount);
    public double interest(double amount, int months);
}
