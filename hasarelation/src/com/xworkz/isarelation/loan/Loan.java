package com.xworkz.isarelation.loan;

public class Loan {

    public Loan() {
        System.out.println("Loan constructor is running - parent class");
    }

    public void approve() {
        System.out.println("Approving a general loan - parent class");
    }

    public void calculateInterest() {
        System.out.println("Calculating interest for loan - parent class");
    }

    public void repay() {
        System.out.println("Repaying loan in EMIs - parent class");
    }

    public void checkEligibility() {
        System.out.println("Checking loan eligibility - parent class");
    }

    public void disburse() {
        System.out.println("Disbursing loan amount - parent class");
    }
}
