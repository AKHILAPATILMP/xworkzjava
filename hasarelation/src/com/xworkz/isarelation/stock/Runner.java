package com.xworkz.isarelation.stock;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Stock");
            Stock stock = new Stock();
            stock.buy();
            stock.sell();
            stock.trackMarket();
            stock.calculateReturns();
            stock.analyzeTrends();

            System.out.println("\nCreating an instance of EquityStock using Stock reference");
            Stock stockRef = new EquityStock();
            stockRef.buy();
            stockRef.sell();
            stockRef.trackMarket();
            stockRef.calculateReturns();
            stockRef.analyzeTrends();

            System.out.println("\nCreating an instance of EquityStock using subclass reference");
            EquityStock equityStock = new EquityStock();
            equityStock.buy();
            equityStock.sell();
            equityStock.trackMarket();
            equityStock.calculateReturns();
            equityStock.analyzeTrends();
            equityStock.dividendPayout();
            equityStock.shortSelling();
            equityStock.marginTrading();
            equityStock.IPOInvestment();
            equityStock.portfolioDiversification();
        }
    }

