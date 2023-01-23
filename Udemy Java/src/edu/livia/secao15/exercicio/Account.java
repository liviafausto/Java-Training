package edu.livia.secao15.exercicio;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        if(amount > withdrawLimit){
            throw new AmountException("The amount exceeds withdraw limit.");
        }

        if(balance < amount){
            throw new AmountException("Not enought balance.");
        }

        balance -= amount;
    }

}
