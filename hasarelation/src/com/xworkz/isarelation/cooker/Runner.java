package com.xworkz.isarelation.cooker;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Cooker");
        Cooker basicCooker = new Cooker();
        basicCooker.addIngredients();
        basicCooker.addWater();
        basicCooker.startCooking();
        basicCooker.stopCooking();
        basicCooker.cleanCooker();

        System.out.println("\nCreating instance of SmartCooker using Cooker reference");
        Cooker smartCookerRef = new SmartCooker();
        smartCookerRef.addIngredients();
        smartCookerRef.addWater();
        smartCookerRef.startCooking();
        smartCookerRef.stopCooking();
        smartCookerRef.cleanCooker();

        System.out.println("\nCreating instance of SmartCooker using subclass reference");
        SmartCooker smartCooker = new SmartCooker();
        smartCooker.addIngredients();
        smartCooker.addWater();
        smartCooker.startCooking();
        smartCooker.stopCooking();
        smartCooker.cleanCooker();
        smartCooker.scheduleCooking();

        System.out.println("\nCalling Kitchen operate method");
        Kitchen kitchen = new Kitchen();
        kitchen.operate(basicCooker);
        kitchen.operate(smartCookerRef);
        kitchen.operate(smartCooker);
    }
}
