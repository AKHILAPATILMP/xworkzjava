package com.xworkz.isarelation.fooddelivery;

public class FoodDelivery {

        public FoodDelivery() {
            System.out.println("FoodDelivery constructor is running");
        }

        public void receiveOrder() {
            System.out.println("FoodDelivery service is receiving an order");
        }

        public void prepareFood() {
            System.out.println("FoodDelivery service is preparing food");
        }

        public void packOrder() {
            System.out.println("FoodDelivery service is packing the order");
        }

        public void assignDelivery() {
            System.out.println("FoodDelivery service is assigning a delivery partner");
        }

        public void deliverOrder() {
            System.out.println("FoodDelivery service is delivering the order");
        }
    }
