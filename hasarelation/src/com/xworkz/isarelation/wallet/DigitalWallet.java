package com.xworkz.isarelation.wallet;

    public class DigitalWallet extends Wallet {
        public DigitalWallet() {
            super();
            System.out.println("DigitalWallet constructor is running");
        }

        public void onlineTransaction() {
            System.out.println("DigitalWallet: Making an online transaction...");
        }

        public void cashbackOffers() {
            System.out.println("DigitalWallet: Providing cashback offers...");
        }

        public void linkBankAccount() {
            System.out.println("DigitalWallet: Linking bank account to wallet...");
        }

        public void QRCodePayment() {
            System.out.println("DigitalWallet: Scanning QR code for payment...");
        }

        public void transactionHistory() {
            System.out.println("DigitalWallet: Viewing transaction history...");
        }
    }

