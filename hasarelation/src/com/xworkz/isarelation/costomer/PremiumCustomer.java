package com.xworkz.isarelation.costomer;

public class PremiumCustomer extends Customer {

    public PremiumCustomer() {
        super();
        System.out.println("PremiumCustomer constructor is running - subclass");
    }

    @Override
    public void browseProducts() {
        System.out.println("PremiumCustomer browsing with personalized recommendations - subclass");
    }

    @Override
    public void placeOrder() {
        System.out.println("PremiumCustomer placing order with priority - subclass");
    }

    @Override
    public void makePayment() {
        System.out.println("PremiumCustomer using premium payment options - subclass");
    }

    @Override
    public void trackOrder() {
        System.out.println("PremiumCustomer tracking with live updates - subclass");
    }

    @Override
    public void contactSupport() {
        System.out.println("PremiumCustomer contacting dedicated support - subclass");
    }

    public void accessLounge() {
        System.out.println("PremiumCustomer accessing VIP lounge - only in subclass");
    }
}
