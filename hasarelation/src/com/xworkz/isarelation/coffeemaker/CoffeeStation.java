package com.xworkz.isarelation.coffeemaker;

public class CoffeeStation {
    public void operate(CoffeeMaker maker) {
        maker.addWater();
        maker.addCoffeePowder();
        maker.startBrewing();
        maker.stopBrewing();
        maker.clean();

        if (maker instanceof SmartCoffeeMaker) {
            System.out.println("Casting: CoffeeMaker is a SmartCoffeeMaker");
            SmartCoffeeMaker smart = (SmartCoffeeMaker) maker;
            smart.scheduleBrew();
        }
    }
}
