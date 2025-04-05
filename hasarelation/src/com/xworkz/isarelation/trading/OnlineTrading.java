package com.xworkz.isarelation.trading;

public class OnlineTrading extends Trading {

    public OnlineTrading() {
        super();
        System.out.println("OnlineTrading constructor is running - subclass");
    }

    @Override
    public void openAccount() {
        System.out.println("Opening a trading account online - subclass");
    }

    @Override
    public void buyStock() {
        System.out.println("Buying stock using online platform - subclass");
    }

    @Override
    public void sellStock() {
        System.out.println("Selling stock through mobile app - subclass");
    }

    @Override
    public void checkPortfolio() {
        System.out.println("Checking portfolio with live updates - subclass");
    }
}

