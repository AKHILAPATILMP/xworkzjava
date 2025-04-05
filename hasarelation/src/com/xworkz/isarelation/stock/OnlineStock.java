package com.xworkz.isarelation.stock;

public class OnlineStock extends Stock {

    public OnlineStock() {
        super();
        System.out.println("OnlineStock constructor is running - subclass");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Checking stock availability in online database - subclass");
    }

    @Override
    public void updateStock() {
        System.out.println("Updating stock through online dashboard - subclass");
    }

    @Override
    public void displayStock() {
        System.out.println("Displaying stock on website - subclass");
    }

    @Override
    public void removeStock() {
        System.out.println("Removing item from online stock system - subclass");
    }
}


