package com.xworkz.isarelation.coffeemaker;

public class SmartCoffeeMaker extends CoffeeMaker {

    public SmartCoffeeMaker() {
        super();
        System.out.println("SmartCoffeeMaker constructor is running - subclass");
    }

    @Override
    public void addWater() {
        System.out.println("SmartCoffeeMaker auto-fills water - subclass");
    }

    @Override
    public void addCoffeePowder() {
        System.out.println("SmartCoffeeMaker adds premium coffee pods - subclass");
    }

    @Override
    public void startBrewing() {
        System.out.println("SmartCoffeeMaker starts brewing with voice command - subclass");
    }

    @Override
    public void stopBrewing() {
        System.out.println("SmartCoffeeMaker stops brewing automatically - subclass");
    }

    @Override
    public void clean() {
        System.out.println("SmartCoffeeMaker performs auto-clean - subclass");
    }

    public void scheduleBrew() {
        System.out.println("SmartCoffeeMaker scheduled brewing at 7:00 AM - subclass-only method");
    }
}
