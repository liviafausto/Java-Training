package edu.livia.secao18.loan;

public class UsInterest implements InterestService{
    private final double interestRate;

    public UsInterest(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
