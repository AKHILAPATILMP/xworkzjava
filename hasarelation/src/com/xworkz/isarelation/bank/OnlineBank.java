package com.xworkz.isarelation.bank;

    public class OnlineBank extends Bank {
        public OnlineBank() {
            super();
            System.out.println("OnlineBank constructor is running");
        }

        public void mobileBanking() {
            System.out.println("OnlineBank: Accessing banking services via mobile app...");
        }

        public void onlinePayment() {
            System.out.println("OnlineBank: Making online payments...");
        }

        public void checkCreditScore() {
            System.out.println("OnlineBank: Checking credit score...");
        }

        public void enableTwoFactorAuth() {
            System.out.println("OnlineBank: Enabling two-factor authentication...");
        }

        public void investOnline() {
            System.out.println("OnlineBank: Investing in stocks and funds online...");
        }
    }

