package com.xworkz.isarelation.cooker;

public class SmartCooker extends Cooker {

    public SmartCooker() {
        super();
        System.out.println("SmartCooker constructor is running - subclass");
    }

    @Override
    public void addIngredients() {
        System.out.println("SmartCooker auto-detects and adds ingredients - subclass");
    }

    @Override
    public void addWater() {
        System.out.println("SmartCooker measures and adds water - subclass");
    }

    @Override
    public void startCooking() {
        System.out.println("SmartCooker starts cooking with smart controls - subclass");
    }

    @Override
    public void stopCooking() {
        System.out.println("SmartCooker stops automatically after timer - subclass");
    }

    @Override
    public void cleanCooker() {
        System.out.println("SmartCooker has self-cleaning mode - subclass");
    }

    public void scheduleCooking() {
        System.out.println("SmartCooker schedules cooking at 6:00 PM - subclass-only method");
    }
}
