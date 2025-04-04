package com.xworkz.isarelation.market;

public class Market {

    public Market() {
        System.out.println("Market constructor is running - parent class");
    }

    public void openMarket() {
        System.out.println("Market is open - parent class");
    }

    public void closeMarket() {
        System.out.println("Market is closed - parent class");
    }

    public void sellGoods() {
        System.out.println("Selling goods in the market - parent class");
    }

    public void cleanMarket() {
        System.out.println("Cleaning the market - parent class");
    }
}
