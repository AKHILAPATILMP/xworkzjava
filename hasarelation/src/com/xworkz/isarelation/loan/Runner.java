package com.xworkz.isarelation.loan;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Loan");
            Loan loan = new Loan();
            loan.applyLoan();
            loan.approveLoan();
            loan.disburseLoan();
            loan.calculateEMI();
            loan.checkLoanStatus();

            System.out.println("\nCreating an instance of HomeLoan using Loan reference");
            Loan loanRef = new HomeLoan();
            loanRef.applyLoan();
            loanRef.approveLoan();
            loanRef.disburseLoan();
            loanRef.calculateEMI();
            loanRef.checkLoanStatus();

            System.out.println("\nCreating an instance of HomeLoan using subclass reference");
            HomeLoan homeLoan = new HomeLoan();
            homeLoan.applyLoan();
            homeLoan.approveLoan();
            homeLoan.disburseLoan();
            homeLoan.calculateEMI();
            homeLoan.checkLoanStatus();
            homeLoan.evaluateProperty();
            homeLoan.checkInterestRates();
            homeLoan.verifyDocuments();
            homeLoan.approveConstructionLoan();
            homeLoan.refinanceLoan();
        }
    }

