package com.xworkz.isarelation.costomer;

public class Customer {

    public Customer() {
        System.out.println("Customer constructor is running - parent class");
    }

    public void browseProducts() {
        System.out.println("Customer is browsing products - parent class");
    }

    public void addToCart() {
        System.out.println("Customer adds product to cart - parent class");
    }

    public void makePayment() {
        System.out.println("Customer is making payment - parent class");
    }

    public void receiveOrder() {
        System.out.println("Customer receives the order - parent class");
    }
}


