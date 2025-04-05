package com.xworkz.isarelation.wallet;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Wallet");
        Wallet wallet = new Wallet();
        wallet.open();
        wallet.close();
        wallet.storeMoney();
        wallet.checkContents();

        System.out.println("\nCreating an instance of DigitalWallet using Wallet reference");
        Wallet walletRef = new DigitalWallet();
        walletRef.open();
        walletRef.close();
        walletRef.storeMoney();
        walletRef.checkContents();

        System.out.println("\nCreating an instance of DigitalWallet using subclass reference");
        DigitalWallet digitalWallet = new DigitalWallet();
        digitalWallet.open();
        digitalWallet.close();
        digitalWallet.storeMoney();
        digitalWallet.checkContents();
    }
}
