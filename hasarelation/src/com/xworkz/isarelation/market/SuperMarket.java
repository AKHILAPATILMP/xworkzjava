package com.xworkz.isarelation.market;

public class SuperMarket extends Market {

    public SuperMarket() {
        super();
        System.out.println("SuperMarket constructor is running - subclass");
    }

    @Override
    public void openMarket() {
        System.out.println("SuperMarket opens with digital billing - subclass");
    }

    @Override
    public void closeMarket() {
        System.out.println("SuperMarket is closed with automatic doors - subclass");
    }

    @Override
    public void sellGoods() {
        System.out.println("Selling groceries and electronics in SuperMarket - subclass");
    }

    @Override
    public void cleanMarket() {
        System.out.println("SuperMarket is cleaned using robots - subclass");
    }
}


