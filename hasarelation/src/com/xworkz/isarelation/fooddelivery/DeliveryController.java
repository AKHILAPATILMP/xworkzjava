package com.xworkz.isarelation.fooddelivery;

public class DeliveryController {
    public void manage(FoodDelivery delivery) {
        delivery.placeOrder();
        delivery.prepareFood();
        delivery.packFood();
        delivery.deliverFood();
        delivery.collectPayment();

        if (delivery instanceof OnlineFoodDelivery) {
            System.out.println("Casting: delivery is instance of OnlineFoodDelivery");
            OnlineFoodDelivery online = (OnlineFoodDelivery) delivery;
            online.applyCoupon();
        }
    }
}
