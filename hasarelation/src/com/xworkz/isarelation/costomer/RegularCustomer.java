package com.xworkz.isarelation.costomer;

public class RegularCustomer extends Customer {

    public RegularCustomer() {
        super();
        System.out.println("RegularCustomer constructor is running - subclass");
    }

    @Override
    public void browseProducts() {
        System.out.println("RegularCustomer is browsing with recommendations - subclass");
    }

    @Override
    public void addToCart() {
        System.out.println("RegularCustomer adds with auto-discount applied - subclass");
    }

    @Override
    public void makePayment() {
        System.out.println("RegularCustomer makes payment using saved methods - subclass");
    }

    @Override
    public void receiveOrder() {
        System.out.println("RegularCustomer receives priority delivery - subclass");
    }
}
