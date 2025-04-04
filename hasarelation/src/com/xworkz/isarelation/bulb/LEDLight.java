package com.xworkz.isarelation.bulb;

public class LEDLight extends Bulb {

    public LEDLight() {
        super();
        System.out.println("LEDLight constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("LED Light is turned on with energy-saving mode - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("LED Light is turned off - subclass");
    }

    @Override
    public void glow() {
        System.out.println("LED Light is glowing with bright white light - subclass");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting LED brightness - subclass");
    }
}
