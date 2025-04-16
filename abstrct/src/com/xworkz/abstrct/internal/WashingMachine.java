package com.xworkz.abstrct.internal;

public class WashingMachine extends Appliance {

    public WashingMachine(String name, String brand, double power, double price) {
        super(name, brand, power, price);
    }

    public WashingMachine(String name, String brand) {
        super(name, brand);
    }

    public WashingMachine(String name, String brand, double power) {
        super(name, brand, power);
    }

    @Override
    public void operate() {
        System.out.println(name + " is washing clothes efficiently.");
    }
}
