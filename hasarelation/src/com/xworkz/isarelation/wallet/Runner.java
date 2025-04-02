package com.xworkz.isarelation.wallet;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Wallet");
            Wallet wallet = new Wallet();
            wallet.addMoney();
            wallet.makePayment();
            wallet.checkBalance();
            wallet.withdrawCash();
            wallet.secureWallet();

            System.out.println("\nCreating an instance of DigitalWallet using Wallet reference");
            Wallet walletRef = new DigitalWallet();
            walletRef.addMoney();
            walletRef.makePayment();
            walletRef.checkBalance();
            walletRef.withdrawCash();
            walletRef.secureWallet();

            System.out.println("\nCreating an instance of DigitalWallet using subclass reference");
            DigitalWallet digitalWallet = new DigitalWallet();
            digitalWallet.addMoney();
            digitalWallet.makePayment();
            digitalWallet.checkBalance();
            digitalWallet.withdrawCash();
            digitalWallet.secureWallet();
            digitalWallet.onlineTransaction();
            digitalWallet.cashbackOffers();
            digitalWallet.linkBankAccount();
            digitalWallet.QRCodePayment();
            digitalWallet.transactionHistory();
        }
    }

