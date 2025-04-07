package com.xworkz.isarelation.bottle;

public class WaterBottle extends Bottle {

    public WaterBottle() {
        super();
        System.out.println("WaterBottle constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening the water bottle with one hand - subclass");
    }

    @Override
    public void close() {
        System.out.println("Closing the water bottle tightly - subclass");
    }

    @Override
    public void fill() {
        System.out.println("Filling water in the water bottle - subclass");
    }

    @Override
    public void empty() {
        System.out.println("Draining all water from the bottle - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Washing the water bottle with soap - subclass");
    }

    public void checkTemperature() {
        System.out.println("Checking if water is cold or hot - subclass only");
    }
}
