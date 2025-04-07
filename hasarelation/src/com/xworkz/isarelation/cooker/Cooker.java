package com.xworkz.isarelation.cooker;

public class Cooker {

    public Cooker() {
        System.out.println("Cooker constructor is running - parent class");
    }

    public void addIngredients() {
        System.out.println("Adding ingredients to the cooker - parent class");
    }

    public void addWater() {
        System.out.println("Adding water to the cooker - parent class");
    }

    public void startCooking() {
        System.out.println("Starting the cooking process - parent class");
    }

    public void stopCooking() {
        System.out.println("Stopping the cooker manually - parent class");
    }

    public void cleanCooker() {
        System.out.println("Cleaning cooker after use - parent class");
    }
}
