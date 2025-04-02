package com.xworkz.isarelation.loan;

    public class HomeLoan extends Loan {
        public HomeLoan() {
            super();
            System.out.println("HomeLoan constructor is running");
        }

        public void evaluateProperty() {
            System.out.println("HomeLoan: Evaluating property for loan eligibility...");
        }

        public void checkInterestRates() {
            System.out.println("HomeLoan: Checking current home loan interest rates...");
        }

        public void verifyDocuments() {
            System.out.println("HomeLoan: Verifying property and income documents...");
        }

        public void approveConstructionLoan() {
            System.out.println("HomeLoan: Approving loan for home construction...");
        }

        public void refinanceLoan() {
            System.out.println("HomeLoan: Refinancing existing home loan...");
        }
    }

