package com.xworkz.finance;

public class Loan {
        public double loanAmount;
        double interestRate;
        private final int duration;

        public Loan(double loanAmount, double interestRate, int duration) {
            this.loanAmount = loanAmount;
            this.interestRate = interestRate;
            this.duration = duration;
            showLoanDetails();
        }

        public void showLoanDetails() {
            System.out.println("Loan Amount: $" + loanAmount + ", Interest Rate: " + interestRate + "%");
            calculateEMI();
        }

        void showInterestRate() {
            System.out.println("Interest Rate: " + interestRate + "%");
        }

        private void calculateEMI() {
            System.out.println("EMI calculated based on duration: " + duration + " months.");
        }
    }


