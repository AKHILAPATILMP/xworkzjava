package com.xworkz.isarelation.costomer;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Customer");
        Customer customer1 = new Customer();
        customer1.browseProducts();
        customer1.placeOrder();
        customer1.makePayment();
        customer1.trackOrder();
        customer1.contactSupport();

        System.out.println("\nCreating instance of PremiumCustomer using Customer reference");
        Customer customer2 = new PremiumCustomer();
        customer2.browseProducts();
        customer2.placeOrder();
        customer2.makePayment();
        customer2.trackOrder();
        customer2.contactSupport();

        System.out.println("\nCreating instance of PremiumCustomer using subclass reference");
        PremiumCustomer premium = new PremiumCustomer();
        premium.browseProducts();
        premium.placeOrder();
        premium.makePayment();
        premium.trackOrder();
        premium.contactSupport();
        premium.accessLounge();

        System.out.println("\nUsing CustomerService to assist:");
        CustomerService service = new CustomerService();
        service.assist(customer1); // basic customer
        service.assist(customer2); // casted to PremiumCustomer
        service.assist(premium);   // direct subclass reference
    }
}
