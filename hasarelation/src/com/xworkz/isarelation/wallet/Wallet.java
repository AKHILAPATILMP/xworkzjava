package com.xworkz.isarelation.wallet;
public class Wallet {

    public Wallet() {
        System.out.println("Wallet constructor is running - parent class");
    }

    public void open() {
        System.out.println("Opening the wallet - parent class");
    }

    public void close() {
        System.out.println("Closing the wallet - parent class");
    }

    public void storeMoney() {
        System.out.println("Storing money in wallet - parent class");
    }

    public void checkContents() {
        System.out.println("Checking wallet contents - parent class");
    }
}


