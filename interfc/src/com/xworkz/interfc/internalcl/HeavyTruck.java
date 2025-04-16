package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Truck;

public class HeavyTruck implements Truck {

    @Override
    public void loadCargo() {
        System.out.println("Loading cargo onto the truck...");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Unloading cargo from the truck...");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void drive() {
        System.out.println("Driving the truck on the road...");
    }
}
