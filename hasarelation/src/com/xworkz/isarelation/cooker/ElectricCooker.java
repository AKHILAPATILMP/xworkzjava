package com.xworkz.isarelation.cooker;

public class ElectricCooker extends Cooker {

    public ElectricCooker() {
        super();
        System.out.println("ElectricCooker constructor is running - subclass");
    }

    @Override
    public void addIngredients() {
        System.out.println("ElectricCooker adds ingredients with smart measurement - subclass");
    }

    @Override
    public void startCooking() {
        System.out.println("ElectricCooker starts cooking automatically - subclass");
    }

    @Override
    public void stopCooking() {
        System.out.println("ElectricCooker stops cooking with auto-timer - subclass");
    }

    @Override
    public void cleanCooker() {
        System.out.println("ElectricCooker cleans itself with steam - subclass");
    }
}


