package com.xworkz.isarelation.fooddelivery;

public class OnlineFoodDelivery extends FoodDelivery {

    public OnlineFoodDelivery() {
        super();
        System.out.println("OnlineFoodDelivery constructor is running - subclass");
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing food order via mobile app - subclass");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking food order in real-time - subclass");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Delivering food via GPS-enabled delivery partner - subclass");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled with refund policy - subclass");
    }
}
