package com.xworkz.isarelation.bulb;

public class LEDBulb extends Bulb {

    public LEDBulb() {
        super();
        System.out.println("LEDBulb constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on LED bulb with energy efficiency - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off LED bulb - subclass");
    }

    @Override
    public void glow() {
        System.out.println("LED bulb is glowing brightly - subclass");
    }

    @Override
    public void setVoltage() {
        System.out.println("Setting optimized voltage for LED bulb - subclass");
    }

    @Override
    public void checkWattage() {
        System.out.println("Checking wattage of LED bulb - subclass");
    }

    public void colorChange() {
        System.out.println("LED bulb is changing color - subclass only method");
    }
}
