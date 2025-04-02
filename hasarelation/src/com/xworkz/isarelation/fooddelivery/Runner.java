package com.xworkz.isarelation.fooddelivery;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of FoodDelivery");
            FoodDelivery foodDelivery = new FoodDelivery();
            foodDelivery.receiveOrder();
            foodDelivery.prepareFood();
            foodDelivery.packOrder();
            foodDelivery.assignDelivery();
            foodDelivery.deliverOrder();

            System.out.println("\nCreating an instance of ExpressFoodDelivery using FoodDelivery reference");
            FoodDelivery foodDeliveryRef = new ExpressFoodDelivery();
            foodDeliveryRef.receiveOrder();
            foodDeliveryRef.prepareFood();
            foodDeliveryRef.packOrder();
            foodDeliveryRef.assignDelivery();
            foodDeliveryRef.deliverOrder();

            System.out.println("\nCreating an instance of ExpressFoodDelivery using subclass reference");
            ExpressFoodDelivery expressFoodDelivery = new ExpressFoodDelivery();
            expressFoodDelivery.receiveOrder();
            expressFoodDelivery.prepareFood();
            expressFoodDelivery.packOrder();
            expressFoodDelivery.assignDelivery();
            expressFoodDelivery.deliverOrder();
            expressFoodDelivery.expressDelivery();
            expressFoodDelivery.realTimeTracking();
            expressFoodDelivery.priorityPacking();
            expressFoodDelivery.temperatureControl();
            expressFoodDelivery.contactlessDelivery();
        }
    }


