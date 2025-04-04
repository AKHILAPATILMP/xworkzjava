package com.xworkz.isarelation.bank;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bank");
        Bank bank = new Bank();
        bank.openAccount();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();

        System.out.println("\nCreating an instance of OnlineBank using Bank reference");
        Bank bankRef = new OnlineBank();
        bankRef.openAccount();
        bankRef.deposit();
        bankRef.withdraw();
        bankRef.checkBalance();

        System.out.println("\nCreating an instance of OnlineBank using subclass reference");
        OnlineBank onlineBank = new OnlineBank();
        onlineBank.openAccount();
        onlineBank.deposit();
        onlineBank.withdraw();
        onlineBank.checkBalance();
    }
}


