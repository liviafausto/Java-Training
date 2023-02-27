package edu.livia.secao18.loan;

public class BrazilInterest implements InterestService {
    private final double interestRate;

    public BrazilInterest(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
