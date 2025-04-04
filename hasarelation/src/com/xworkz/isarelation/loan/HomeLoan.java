package com.xworkz.isarelation.loan;
public class HomeLoan extends Loan {

    public HomeLoan() {
        super();
        System.out.println("HomeLoan constructor is running - subclass");
    }

    @Override
    public void applyLoan() {
        System.out.println("Applying for a home loan - subclass");
    }

    @Override
    public void approveLoan() {
        System.out.println("Home loan approved after property verification - subclass");
    }

    @Override
    public void repayLoan() {
        System.out.println("Repaying home loan in EMIs - subclass");
    }

    @Override
    public void checkLoanStatus() {
        System.out.println("Checking home loan application status - subclass");
    }
}
