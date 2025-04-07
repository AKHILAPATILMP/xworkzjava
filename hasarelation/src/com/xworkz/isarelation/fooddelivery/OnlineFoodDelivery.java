package com.xworkz.isarelation.fooddelivery;

public class OnlineFoodDelivery extends FoodDelivery {

    public OnlineFoodDelivery() {
        super();
        System.out.println("OnlineFoodDelivery constructor is running - subclass");
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing food order via app - subclass");
    }

    @Override
    public void prepareFood() {
        System.out.println("Restaurant preparing food - subclass");
    }

    @Override
    public void packFood() {
        System.out.println("Packing food in eco-friendly containers - subclass");
    }

    @Override
    public void deliverFood() {
        System.out.println("Delivering food with live tracking - subclass");
    }

    @Override
    public void collectPayment() {
        System.out.println("Collecting payment via online transaction - subclass");
    }

    public void applyCoupon() {
        System.out.println("Applying discount coupon - subclass method only");
    }
}
