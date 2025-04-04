package com.xworkz.isarelation.fooddelivery;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of FoodDelivery");
        FoodDelivery delivery = new FoodDelivery();
        delivery.placeOrder();
        delivery.trackOrder();
        delivery.deliverOrder();
        delivery.cancelOrder();

        System.out.println("\nCreating an instance of OnlineFoodDelivery using FoodDelivery reference");
        FoodDelivery deliveryRef = new OnlineFoodDelivery();
        deliveryRef.placeOrder();
        deliveryRef.trackOrder();
        deliveryRef.deliverOrder();
        deliveryRef.cancelOrder();

        System.out.println("\nCreating an instance of OnlineFoodDelivery using subclass reference");
        OnlineFoodDelivery onlineDelivery = new OnlineFoodDelivery();
        onlineDelivery.placeOrder();
        onlineDelivery.trackOrder();
        onlineDelivery.deliverOrder();
        onlineDelivery.cancelOrder();
    }
}
