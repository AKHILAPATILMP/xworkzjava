package com.xworkz.isarelation.loan;

public class LoanOfficer {
    public void processLoan(Loan loan) {
        loan.approve();
        loan.calculateInterest();
        loan.repay();
        loan.checkEligibility();
        loan.disburse();

        if (loan instanceof HomeLoan) {
            System.out.println("Casting Loan to HomeLoan...");
            HomeLoan homeLoan = (HomeLoan) loan;
            homeLoan.showPropertyDetails();
        }
    }
}
