package com.xworkz.isarelation.costomer;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Customer");
        Customer customer = new Customer();
        customer.browseProducts();
        customer.addToCart();
        customer.makePayment();
        customer.receiveOrder();

        System.out.println("\nCreating an instance of RegularCustomer using Customer reference");
        Customer customerRef = new RegularCustomer();
        customerRef.browseProducts();
        customerRef.addToCart();
        customerRef.makePayment();
        customerRef.receiveOrder();

        System.out.println("\nCreating an instance of RegularCustomer using subclass reference");
        RegularCustomer regular = new RegularCustomer();
        regular.browseProducts();
        regular.addToCart();
        regular.makePayment();
        regular.receiveOrder();
    }
}
