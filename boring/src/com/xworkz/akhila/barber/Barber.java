package com.xworkz.akhila.barber;

public class Barber {
    void serve(Customer customer) {
        if (customer != null) {
            customer.getHaircut();
        } else {
            System.out.println("No customer is available for a haircut");
        }
    }

}
