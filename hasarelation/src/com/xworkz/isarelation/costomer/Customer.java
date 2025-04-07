package com.xworkz.isarelation.costomer;

public class Customer {

    public Customer() {
        System.out.println("Customer constructor is running - parent class");
    }

    public void browseProducts() {
        System.out.println("Customer is browsing products - parent class");
    }

    public void placeOrder() {
        System.out.println("Customer is placing an order - parent class");
    }

    public void makePayment() {
        System.out.println("Customer is making payment - parent class");
    }

    public void trackOrder() {
        System.out.println("Customer is tracking the order - parent class");
    }

    public void contactSupport() {
        System.out.println("Customer is contacting support - parent class");
    }
}
