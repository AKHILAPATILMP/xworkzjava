package com.xworkz.isarelation.stock;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Stock");
        Stock stock = new Stock();
        stock.checkAvailability();
        stock.updateStock();
        stock.displayStock();
        stock.removeStock();

        System.out.println("\nCreating an instance of OnlineStock using Stock reference");
        Stock stockRef = new OnlineStock();
        stockRef.checkAvailability();
        stockRef.updateStock();
        stockRef.displayStock();
        stockRef.removeStock();

        System.out.println("\nCreating an instance of OnlineStock using subclass reference");
        OnlineStock onlineStock = new OnlineStock();
        onlineStock.checkAvailability();
        onlineStock.updateStock();
        onlineStock.displayStock();
        onlineStock.removeStock();
    }
}
