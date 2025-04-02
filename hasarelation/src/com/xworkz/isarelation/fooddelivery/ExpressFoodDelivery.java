package com.xworkz.isarelation.fooddelivery;

    public class ExpressFoodDelivery extends FoodDelivery {
        public ExpressFoodDelivery() {
            super();
            System.out.println("ExpressFoodDelivery constructor is running");
        }

        public void expressDelivery() {
            System.out.println("ExpressFoodDelivery is delivering the food within 30 minutes");
        }

        public void realTimeTracking() {
            System.out.println("ExpressFoodDelivery is providing real-time tracking updates");
        }

        public void priorityPacking() {
            System.out.println("ExpressFoodDelivery is ensuring priority packing for express orders");
        }

        public void temperatureControl() {
            System.out.println("ExpressFoodDelivery is maintaining the food temperature during delivery");
        }

        public void contactlessDelivery() {
            System.out.println("ExpressFoodDelivery is offering contactless delivery");
        }
    }


