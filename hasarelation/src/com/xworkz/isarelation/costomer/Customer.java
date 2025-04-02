package com.xworkz.isarelation.costomer;
    public class Customer {
        public Customer() {
            System.out.println("Customer constructor is running");
        }

        public void browseProducts() {
            System.out.println("Customer: Browsing products...");
        }

        public void addToCart() {
            System.out.println("Customer: Adding items to cart...");
        }

        public void placeOrder() {
            System.out.println("Customer: Placing an order...");
        }

        public void makePayment() {
            System.out.println("Customer: Making a payment...");
        }

        public void trackOrder() {
            System.out.println("Customer: Tracking order status...");
        }
    }

