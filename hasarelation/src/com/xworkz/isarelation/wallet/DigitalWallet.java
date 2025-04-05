package com.xworkz.isarelation.wallet;
public class DigitalWallet extends Wallet {

    public DigitalWallet() {
        super();
        System.out.println("DigitalWallet constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Unlocking the digital wallet using biometric - subclass");
    }

    @Override
    public void close() {
        System.out.println("Locking the digital wallet - subclass");
    }

    @Override
    public void storeMoney() {
        System.out.println("Adding funds to digital wallet account - subclass");
    }

    @Override
    public void checkContents() {
        System.out.println("Displaying digital balance and transactions - subclass");
    }
}


