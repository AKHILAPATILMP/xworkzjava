package com.xworkz.isarelation.market;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Market");
            Market market = new Market();
            market.sellProducts();
            market.provideDiscounts();
            market.manageInventory();
            market.serveCustomers();
            market.acceptPayments();

            System.out.println("\nCreating an instance of SuperMarket using Market reference");
            Market marketRef = new SuperMarket();
            marketRef.sellProducts();
            marketRef.provideDiscounts();
            marketRef.manageInventory();
            marketRef.serveCustomers();
            marketRef.acceptPayments();

            System.out.println("\nCreating an instance of SuperMarket using subclass reference");
            SuperMarket superMarket = new SuperMarket();
            superMarket.sellProducts();
            superMarket.provideDiscounts();
            superMarket.manageInventory();
            superMarket.serveCustomers();
            superMarket.acceptPayments();
            superMarket.offerLoyaltyPoints();
            superMarket.onlineDelivery();
            superMarket.selfCheckout();
            superMarket.bulkBuyingOffers();
            superMarket.membershipBenefits();
        }
    }

