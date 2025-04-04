package com.xworkz.isarelation.market;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Market");
        Market market = new Market();
        market.openMarket();
        market.closeMarket();
        market.sellGoods();
        market.cleanMarket();

        System.out.println("\nCreating an instance of SuperMarket using Market reference");
        Market marketRef = new SuperMarket();
        marketRef.openMarket();
        marketRef.closeMarket();
        marketRef.sellGoods();
        marketRef.cleanMarket();

        System.out.println("\nCreating an instance of SuperMarket using subclass reference");
        SuperMarket superMarket = new SuperMarket();
        superMarket.openMarket();
        superMarket.closeMarket();
        superMarket.sellGoods();
        superMarket.cleanMarket();
    }
}
