package com.xworkz.isarelation.Trading;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Trading");
            Trading trading = new Trading();
            trading.openMarket();
            trading.buyStock();
            trading.sellStock();
            trading.analyzeMarket();
            trading.closeMarket();

            System.out.println("\nCreating an instance of StockTrading using Trading reference");
            Trading tradingRef = new StockTrading();
            tradingRef.openMarket();
            tradingRef.buyStock();
            tradingRef.sellStock();
            tradingRef.analyzeMarket();
            tradingRef.closeMarket();

            System.out.println("\nCreating an instance of StockTrading using subclass reference");
            StockTrading stockTrading = new StockTrading();
            stockTrading.openMarket();
            stockTrading.buyStock();
            stockTrading.sellStock();
            stockTrading.analyzeMarket();
            stockTrading.closeMarket();
            stockTrading.tradeCryptocurrency();
            stockTrading.useTechnicalAnalysis();
            stockTrading.executeHighFrequencyTrading();
            stockTrading.hedgeRisk();
            stockTrading.automateTrading();
        }
    }

