package com.xworkz.isarelation.bank;
public class Bank {

    public Bank() {
        System.out.println("Bank constructor is running - parent class");
    }

    public void openAccount() {
        System.out.println("Opening a bank account - parent class");
    }

    public void deposit() {
        System.out.println("Depositing money into the account - parent class");
    }

    public void withdraw() {
        System.out.println("Withdrawing money from the account - parent class");
    }

    public void checkBalance() {
        System.out.println("Checking account balance - parent class");
    }
}
