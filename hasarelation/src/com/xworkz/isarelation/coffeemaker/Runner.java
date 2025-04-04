package com.xworkz.isarelation.coffeemaker;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of CoffeeMaker");
        CoffeeMaker maker = new CoffeeMaker();
        maker.addWater();
        maker.addCoffeePowder();
        maker.brewCoffee();
        maker.pourCoffee();

        System.out.println("\nCreating an instance of SmartCoffeeMaker using CoffeeMaker reference");
        CoffeeMaker smartRef = new SmartCoffeeMaker();
        smartRef.addWater();
        smartRef.addCoffeePowder();
        smartRef.brewCoffee();
        smartRef.pourCoffee();

        System.out.println("\nCreating an instance of SmartCoffeeMaker using subclass reference");
        SmartCoffeeMaker smart = new SmartCoffeeMaker();
        smart.addWater();
        smart.addCoffeePowder();
        smart.brewCoffee();
        smart.pourCoffee();
    }
}


