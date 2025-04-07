package com.xworkz.isarelation.costomer;

public class CustomerService {

    public void assist(Customer customer) {
        customer.browseProducts();
        customer.placeOrder();
        customer.makePayment();
        customer.trackOrder();
        customer.contactSupport();

        if (customer instanceof PremiumCustomer) {
            System.out.println("Casting: Customer is a PremiumCustomer");
            PremiumCustomer premium = (PremiumCustomer) customer;
            premium.accessLounge();
        }
    }
}
