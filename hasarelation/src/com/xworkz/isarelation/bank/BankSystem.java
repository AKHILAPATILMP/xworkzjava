package com.xworkz.isarelation.bank;

public class BankSystem {

    public void process(Bank bank) {
        bank.openAccount();
        bank.closeAccount();
        bank.deposit();
        bank.withdraw();
        bank.printStatement();

        if (bank instanceof OnlineBank) {
            System.out.println("Casting: Bank is actually OnlineBank");
            OnlineBank online = (OnlineBank) bank;
            online.enableTwoFactorAuth();
        }
    }
}
