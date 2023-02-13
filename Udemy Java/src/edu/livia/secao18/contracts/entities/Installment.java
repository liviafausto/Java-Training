package edu.livia.secao18.contracts.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private double amount;

    public Installment(LocalDate dueDate, double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(FMT_DATE) + " - " + String.format("%.2f", amount);
    }
}