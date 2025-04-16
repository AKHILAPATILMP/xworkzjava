package com.xworkz.abstrct.internal;

public class Smartphone extends Device {

    public Smartphone(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on the smartphone. Welcome to the home screen!");
    }
}
