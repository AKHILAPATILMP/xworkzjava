package com.xworkz.isarelation.trading;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Trading");
        Trading trading = new Trading();
        trading.openAccount();
        trading.buyStock();
        trading.sellStock();
        trading.checkPortfolio();

        System.out.println("\nCreating an instance of OnlineTrading using Trading reference");
        Trading ref = new OnlineTrading();
        ref.openAccount();
        ref.buyStock();
        ref.sellStock();
        ref.checkPortfolio();

        System.out.println("\nCreating an instance of OnlineTrading using subclass reference");
        OnlineTrading online = new OnlineTrading();
        online.openAccount();
        online.buyStock();
        online.sellStock();
        online.checkPortfolio();
    }
}
