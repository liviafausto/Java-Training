package edu.livia.secao14.ex03;

public final class Individual extends TaxPayer {
    private Double healthCareExpenses;

    public Individual(String name, Double anualIncome, Double healthCareExpenses) {
        super(name, anualIncome);
        this.healthCareExpenses = healthCareExpenses;
    }

    @Override
    public Double tax() {
        double tax;

        if(anualIncome < 20000){
            tax = 0.15*anualIncome;
        } else {
            tax = 0.25*anualIncome;
        }

        if(healthCareExpenses != 0.0){
            tax -= 0.50*healthCareExpenses;
        }

        return tax;
    }

    @Override
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
