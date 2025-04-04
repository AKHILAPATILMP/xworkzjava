package com.xworkz.isarelation.bottle;


public class WaterBottle extends Bottle {

    public WaterBottle() {
        super();
        System.out.println("WaterBottle constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening the water bottle with a flip-top lid - subclass");
    }

    @Override
    public void close() {
        System.out.println("Closing the water bottle securely - subclass");
    }

    @Override
    public void fill() {
        System.out.println("Filling the water bottle with fresh water - subclass");
    }

    @Override
    public void empty() {
        System.out.println("Drinking and emptying the water bottle - subclass");
    }

    public void checkTemperature() {
        System.out.println("Checking the water temperature in the water bottle - subclass");
    }
}
