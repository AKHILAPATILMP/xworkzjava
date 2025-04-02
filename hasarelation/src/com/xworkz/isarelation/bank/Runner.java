package com.xworkz.isarelation.bank;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Bank");
            Bank bank = new Bank();
            bank.deposit();
            bank.withdraw();
            bank.transfer();
            bank.provideLoan();
            bank.checkBalance();

            System.out.println("\nCreating an instance of OnlineBank using Bank reference");
            Bank bankRef = new OnlineBank();
            bankRef.deposit();
            bankRef.withdraw();
            bankRef.transfer();
            bankRef.provideLoan();
            bankRef.checkBalance();

            System.out.println("\nCreating an instance of OnlineBank using subclass reference");
            OnlineBank onlineBank = new OnlineBank();
            onlineBank.deposit();
            onlineBank.withdraw();
            onlineBank.transfer();
            onlineBank.provideLoan();
            onlineBank.checkBalance();
            onlineBank.mobileBanking();
            onlineBank.onlinePayment();
            onlineBank.checkCreditScore();
            onlineBank.enableTwoFactorAuth();
            onlineBank.investOnline();
        }
    }

