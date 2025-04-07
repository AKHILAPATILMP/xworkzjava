package com.xworkz.isarelation.bank;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bank");
        Bank bank = new Bank();
        bank.openAccount();
        bank.closeAccount();
        bank.deposit();
        bank.withdraw();
        bank.printStatement();

        System.out.println("\nCreating instance of OnlineBank using Bank reference");
        Bank onlineRef = new OnlineBank();
        onlineRef.openAccount();
        onlineRef.closeAccount();
        onlineRef.deposit();
        onlineRef.withdraw();
        onlineRef.printStatement();

        System.out.println("\nCreating instance of OnlineBank using subclass reference");
        OnlineBank online = new OnlineBank();
        online.openAccount();
        online.closeAccount();
        online.deposit();
        online.withdraw();
        online.printStatement();
        online.enableTwoFactorAuth();

        System.out.println("\nCasting example using BankSystem");
        BankSystem system = new BankSystem();
        system.process(bank);
        system.process(onlineRef);
        system.process(online);
    }
}
