package com.xworkz.isarelation.fooddelivery;

public class FoodDelivery {

    public FoodDelivery() {
        System.out.println("FoodDelivery constructor is running - parent class");
    }

    public void placeOrder() {
        System.out.println("Placing food order - parent class");
    }

    public void prepareFood() {
        System.out.println("Preparing food - parent class");
    }

    public void packFood() {
        System.out.println("Packing food - parent class");
    }

    public void deliverFood() {
        System.out.println("Delivering food - parent class");
    }

    public void collectPayment() {
        System.out.println("Collecting payment in cash - parent class");
    }
}
