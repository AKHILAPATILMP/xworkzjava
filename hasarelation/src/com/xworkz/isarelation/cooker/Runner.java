package com.xworkz.isarelation.cooker;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Cooker");
        Cooker cooker = new Cooker();
        cooker.addIngredients();
        cooker.startCooking();
        cooker.stopCooking();
        cooker.cleanCooker();

        System.out.println("\nCreating an instance of ElectricCooker using Cooker reference");
        Cooker ref = new ElectricCooker();
        ref.addIngredients();
        ref.startCooking();
        ref.stopCooking();
        ref.cleanCooker();

        System.out.println("\nCreating an instance of ElectricCooker using subclass reference");
        ElectricCooker electric = new ElectricCooker();
        electric.addIngredients();
        electric.startCooking();
        electric.stopCooking();
        electric.cleanCooker();
    }
}

