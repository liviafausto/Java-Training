package edu.livia.secao18.contracts.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private final int NUMBER;
    private LocalDate date;
    private double totalValue;
    private List<Installment> installments = new ArrayList<>();

    public Contract(int NUMBER, LocalDate date, double totalValue) {
        this.NUMBER = NUMBER;
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate(){
        return date;
    }
    public List<Installment> getInstallments() {
        return installments;
    }

    public double getAmountPerInstallment(int months){
        return totalValue / months;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    public void removeInstallment(Installment installment){
        installments.remove(installment);
    }
}