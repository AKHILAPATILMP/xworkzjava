package com.xworkz.isarelation.coffeemaker;

public class CoffeeMaker {

    public CoffeeMaker() {
        System.out.println("CoffeeMaker constructor is running - parent class");
    }

    public void addWater() {
        System.out.println("Adding water to coffee maker - parent class");
    }

    public void addCoffeePowder() {
        System.out.println("Adding regular coffee powder - parent class");
    }

    public void startBrewing() {
        System.out.println("Starting brewing manually - parent class");
    }

    public void stopBrewing() {
        System.out.println("Stopping brewing process - parent class");
    }

    public void clean() {
        System.out.println("Cleaning coffee maker manually - parent class");
    }
}
