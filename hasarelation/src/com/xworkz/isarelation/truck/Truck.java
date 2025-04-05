package com.xworkz.isarelation.truck;
public class Truck {

    public Truck() {
        System.out.println("Truck constructor is running - parent class");
    }

    public void startEngine() {
        System.out.println("Truck engine is starting - parent class");
    }

    public void loadGoods() {
        System.out.println("Loading goods into the truck - parent class");
    }

    public void unloadGoods() {
        System.out.println("Unloading goods from the truck - parent class");
    }

    public void stopEngine() {
        System.out.println("Truck engine is stopping - parent class");
    }
}
