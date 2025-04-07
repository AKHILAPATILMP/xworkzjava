package com.xworkz.isarelation.bank;

public class OnlineBank extends Bank {

    public OnlineBank() {
        super();
        System.out.println("OnlineBank constructor is running - subclass");
    }

    @Override
    public void openAccount() {
        System.out.println("Opening bank account online - subclass");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing account via mobile app - subclass");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing via UPI - subclass");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing using online transfer - subclass");
    }

    @Override
    public void printStatement() {
        System.out.println("Sending e-statement to email - subclass");
    }

    public void enableTwoFactorAuth() {
        System.out.println("Two-factor authentication enabled - subclass");
    }
}
