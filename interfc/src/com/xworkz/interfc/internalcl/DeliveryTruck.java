package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Truck;

public class DeliveryTruck implements Truck {

    @Override
    public void loadCargo() {
        System.out.println("Loading cargo onto the truck...");
    }

    @Override
    public void unloadCargo() {
        System.out.println("unload");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the truck engine...");
    }

    @Override
    public void drive() {
        System.out.println("Driving the truck...");
    }
}