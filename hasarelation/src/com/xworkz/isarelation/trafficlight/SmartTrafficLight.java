package com.xworkz.isarelation.trafficlight;

public class SmartTrafficLight extends TrafficLight {

    public SmartTrafficLight() {
        super();
        System.out.println("SmartTrafficLight constructor is running - subclass");
    }

    @Override
    public void turnRed() {
        System.out.println("SmartTrafficLight turns RED using sensor data - subclass");
    }

    @Override
    public void turnYellow() {
        System.out.println("SmartTrafficLight turns YELLOW with countdown - subclass");
    }

    @Override
    public void turnGreen() {
        System.out.println("SmartTrafficLight turns GREEN based on traffic density - subclass");
    }

    @Override
    public void blinkLight() {
        System.out.println("SmartTrafficLight blinks automatically at night - subclass");
    }
}


