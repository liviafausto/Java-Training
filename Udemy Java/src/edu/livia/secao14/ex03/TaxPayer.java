package edu.livia.secao14.ex03;

public abstract class TaxPayer {
    private String name;
    protected Double anualIncome;

    public TaxPayer(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public abstract Double tax();
}
