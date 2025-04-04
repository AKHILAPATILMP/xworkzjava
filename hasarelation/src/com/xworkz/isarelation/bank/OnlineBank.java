package com.xworkz.isarelation.bank;

public class OnlineBank extends Bank {

    public OnlineBank() {
        super();
        System.out.println("OnlineBank constructor is running - subclass");
    }

    @Override
    public void openAccount() {
        System.out.println("OnlineBank opens account through mobile app - subclass");
    }

    @Override
    public void deposit() {
        System.out.println("OnlineBank deposit via UPI or NetBanking - subclass");
    }

    @Override
    public void withdraw() {
        System.out.println("OnlineBank withdraws using ATM or digital wallet - subclass");
    }

    @Override
    public void checkBalance() {
        System.out.println("OnlineBank checks balance using app notification - subclass");
    }
}


