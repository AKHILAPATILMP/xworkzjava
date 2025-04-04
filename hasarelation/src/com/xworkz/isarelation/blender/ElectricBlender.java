package com.xworkz.isarelation.blender;
public class ElectricBlender extends Blender {

    public ElectricBlender() {
        super();
        System.out.println("ElectricBlender constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("Starting the electric blender with one-touch button - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the electric blender automatically - subclass");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Adjusting blender speed electronically to " + speed + " - subclass");
    }

    @Override
    public void mixIngredients() {
        System.out.println("Mixing ingredients with powerful motor - subclass");
    }

    public void selfClean() {
        System.out.println("ElectricBlender has a self-cleaning mode - subclass");
    }
}
