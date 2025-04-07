package com.xworkz.isarelation.fooddelivery;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of FoodDelivery:");
        FoodDelivery baseDelivery = new FoodDelivery();
        baseDelivery.placeOrder();
        baseDelivery.prepareFood();
        baseDelivery.packFood();
        baseDelivery.deliverFood();
        baseDelivery.collectPayment();

        System.out.println("\nCreating instance of OnlineFoodDelivery using parent reference:");
        FoodDelivery onlineRef = new OnlineFoodDelivery();
        onlineRef.placeOrder();
        onlineRef.prepareFood();
        onlineRef.packFood();
        onlineRef.deliverFood();
        onlineRef.collectPayment();

        System.out.println("\nCreating instance of OnlineFoodDelivery using subclass reference:");
        OnlineFoodDelivery online = new OnlineFoodDelivery();
        online.placeOrder();
        online.prepareFood();
        online.packFood();
        online.deliverFood();
        online.collectPayment();
        online.applyCoupon();

        System.out.println("\nUsing DeliveryController:");
        DeliveryController controller = new DeliveryController();
        controller.manage(baseDelivery);
        controller.manage(onlineRef);
        controller.manage(online);
    }
}
