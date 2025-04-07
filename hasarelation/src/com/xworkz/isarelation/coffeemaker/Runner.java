package com.xworkz.isarelation.coffeemaker;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of CoffeeMaker");
        CoffeeMaker basic = new CoffeeMaker();
        basic.addWater();
        basic.addCoffeePowder();
        basic.startBrewing();
        basic.stopBrewing();
        basic.clean();

        System.out.println("\nCreating instance of SmartCoffeeMaker using CoffeeMaker reference");
        CoffeeMaker smartRef = new SmartCoffeeMaker();
        smartRef.addWater();
        smartRef.addCoffeePowder();
        smartRef.startBrewing();
        smartRef.stopBrewing();
        smartRef.clean();

        System.out.println("\nCreating instance of SmartCoffeeMaker using subclass reference");
        SmartCoffeeMaker smart = new SmartCoffeeMaker();
        smart.addWater();
        smart.addCoffeePowder();
        smart.startBrewing();
        smart.stopBrewing();
        smart.clean();
        smart.scheduleBrew();

        System.out.println("\nCalling CoffeeStation with casting");
        CoffeeStation station = new CoffeeStation();
        station.operate(basic);
        station.operate(smartRef);
        station.operate(smart);
    }
}
