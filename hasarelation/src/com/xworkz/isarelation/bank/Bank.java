package com.xworkz.isarelation.bank;

public class Bank {

    public Bank() {
        System.out.println("Bank constructor is running - parent class");
    }

    public void openAccount() {
        System.out.println("Opening bank account - parent class");
    }

    public void closeAccount() {
        System.out.println("Closing bank account - parent class");
    }

    public void deposit() {
        System.out.println("Depositing money - parent class");
    }

    public void withdraw() {
        System.out.println("Withdrawing money - parent class");
    }

    public void printStatement() {
        System.out.println("Printing bank statement - parent class");
    }
}
