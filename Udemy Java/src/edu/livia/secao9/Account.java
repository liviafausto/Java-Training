package edu.livia.secao9;

public class Account {
    private int number; // account number -> cant be altered
    private String name; // name holder -> can be altered
    private double balance; // balance -> cant be altered freely

    public Account(int number, String name){
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit){
        this.number = number;
        this.name = name;
        deposit(initialDeposit); // initial deposit (optional)
    }

    public int getNumber(){
        return number;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double ammount){
        balance += ammount;
    }

    public void withdraw(double ammount){
        balance -= (ammount + 5.00);  // withdraw: $ 5.00 tax
    }

    public String toString(){
        return "Account " + number
                + ", Holder: " + name
                + ", Balance: " + String.format("%.2f", balance);
    }
}
