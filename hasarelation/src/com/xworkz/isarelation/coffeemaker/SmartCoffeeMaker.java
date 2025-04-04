package com.xworkz.isarelation.coffeemaker;


public class SmartCoffeeMaker extends CoffeeMaker {

    public SmartCoffeeMaker() {
        super();
        System.out.println("SmartCoffeeMaker constructor is running - subclass");
    }

    @Override
    public void addWater() {
        System.out.println("SmartCoffeeMaker adds filtered water automatically - subclass");
    }

    @Override
    public void addCoffeePowder() {
        System.out.println("SmartCoffeeMaker uses pre-measured pods - subclass");
    }

    @Override
    public void brewCoffee() {
        System.out.println("SmartCoffeeMaker brews coffee with custom settings - subclass");
    }

    @Override
    public void pourCoffee() {
        System.out.println("SmartCoffeeMaker pours coffee directly into thermal mug - subclass");
    }
}
