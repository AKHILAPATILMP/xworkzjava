package com.xworkz.isarelation.costomer;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Customer");
            Customer customer = new Customer();
            customer.browseProducts();
            customer.addToCart();
            customer.placeOrder();
            customer.makePayment();
            customer.trackOrder();

            System.out.println("\nCreating an instance of PremiumCustomer using Customer reference");
            Customer customerRef = new PremiumCustomer();
            customerRef.browseProducts();
            customerRef.addToCart();
            customerRef.placeOrder();
            customerRef.makePayment();
            customerRef.trackOrder();

            System.out.println("\nCreating an instance of PremiumCustomer using subclass reference");
            PremiumCustomer premiumCustomer = new PremiumCustomer();
            premiumCustomer.browseProducts();
            premiumCustomer.addToCart();
            premiumCustomer.placeOrder();
            premiumCustomer.makePayment();
            premiumCustomer.trackOrder();
            premiumCustomer.getDiscounts();
            premiumCustomer.freeDelivery();
            premiumCustomer.earlyAccess();
            premiumCustomer.prioritySupport();
            premiumCustomer.loyaltyRewards();
        }
    }

