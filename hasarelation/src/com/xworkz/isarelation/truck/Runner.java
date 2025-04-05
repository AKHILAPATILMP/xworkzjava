package com.xworkz.isarelation.truck;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Truck");
        Truck truck = new Truck();
        truck.startEngine();
        truck.loadGoods();
        truck.unloadGoods();
        truck.stopEngine();

        System.out.println("\nCreating an instance of DeliveryTruck using Truck reference");
        Truck ref = new DeliveryTruck();
        ref.startEngine();
        ref.loadGoods();
        ref.unloadGoods();
        ref.stopEngine();

        System.out.println("\nCreating an instance of DeliveryTruck using subclass reference");
        DeliveryTruck delivery = new DeliveryTruck();
        delivery.startEngine();
        delivery.loadGoods();
        delivery.unloadGoods();
        delivery.stopEngine();
    }
}
