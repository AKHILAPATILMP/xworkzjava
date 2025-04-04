package com.xworkz.isarelation.loan;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Loan");
        Loan loan = new Loan();
        loan.applyLoan();
        loan.approveLoan();
        loan.repayLoan();
        loan.checkLoanStatus();

        System.out.println("\nCreating an instance of HomeLoan using Loan reference");
        Loan loanRef = new HomeLoan();
        loanRef.applyLoan();
        loanRef.approveLoan();
        loanRef.repayLoan();
        loanRef.checkLoanStatus();

        System.out.println("\nCreating an instance of HomeLoan using subclass reference");
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.applyLoan();
        homeLoan.approveLoan();
        homeLoan.repayLoan();
        homeLoan.checkLoanStatus();
    }
}
