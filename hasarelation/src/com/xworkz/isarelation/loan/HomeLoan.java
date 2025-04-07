package com.xworkz.isarelation.loan;

public class HomeLoan extends Loan {

    public HomeLoan() {
        super();
        System.out.println("HomeLoan constructor is running - subclass");
    }

    @Override
    public void approve() {
        System.out.println("Approving home loan with property verification - subclass");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest with fixed home loan rate - subclass");
    }

    @Override
    public void repay() {
        System.out.println("Repaying home loan in long-term EMIs - subclass");
    }

    @Override
    public void checkEligibility() {
        System.out.println("Checking credit score and income for home loan - subclass");
    }

    @Override
    public void disburse() {
        System.out.println("Disbursing home loan directly to seller - subclass");
    }

    public void showPropertyDetails() {
        System.out.println("Showing property documents for home loan - subclass only");
    }
}
