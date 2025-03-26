package com.xworkz.finance;

public class BankAccount {

        public String accountHolder;
        double balance;
        private final String accountType;

        public BankAccount(String accountHolder, double balance, String accountType) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.accountType = accountType;
            showBalance();
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount);
            showBalance();
        }

        void showBalance() {
            System.out.println("Balance: $" + balance);
        }

        private void showAccountType() {
            System.out.println("Account Type: " + accountType);
        }
    }


