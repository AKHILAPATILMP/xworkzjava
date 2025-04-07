package com.xworkz.isarelation.loan;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Loan:");
        Loan generalLoan = new Loan();
        generalLoan.approve();
        generalLoan.calculateInterest();
        generalLoan.repay();
        generalLoan.checkEligibility();
        generalLoan.disburse();

        System.out.println("\nCreating instance of HomeLoan using Loan reference:");
        Loan loanRef = new HomeLoan();
        loanRef.approve();
        loanRef.calculateInterest();
        loanRef.repay();
        loanRef.checkEligibility();
        loanRef.disburse();

        System.out.println("\nCreating instance of HomeLoan using subclass reference:");
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.approve();
        homeLoan.calculateInterest();
        homeLoan.repay();
        homeLoan.checkEligibility();
        homeLoan.disburse();
        homeLoan.showPropertyDetails();

        System.out.println("\nUsing LoanOfficer to process loans:");
        LoanOfficer officer = new LoanOfficer();
        officer.processLoan(generalLoan);
        officer.processLoan(loanRef);
        officer.processLoan(homeLoan);
    }
}
