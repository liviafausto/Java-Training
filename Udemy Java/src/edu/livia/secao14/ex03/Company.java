package edu.livia.secao14.ex03;

public final class Company extends TaxPayer{
    private int numberOfEmployess;

    public Company(String name, Double anualIncome, int numberOfEmployess) {
        super(name, anualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public Double tax(){
        double tax;

        if(numberOfEmployess > 10){
            tax = 0.14*anualIncome;
        } else {
            tax = 0.16*anualIncome;
        }

        return tax;
    }

    @Override
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
