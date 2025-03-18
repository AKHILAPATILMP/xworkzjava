package com.xworkz.akhila.barber;

public class BarberRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barber barber = new Barber();
        barber.serve(customer);
    }
}
