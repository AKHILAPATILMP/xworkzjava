package com.xworkz.isarelation.fan;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Fan");
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
        fan.setSpeed();
        fan.rotate();

        System.out.println("\nCreating an instance of CeilingFan using Fan reference");
        Fan fanRef = new CeilingFan();
        fanRef.turnOn();
        fanRef.turnOff();
        fanRef.setSpeed();
        fanRef.rotate();

        System.out.println("\nCreating an instance of CeilingFan using subclass reference");
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.turnOn();
        ceilingFan.turnOff();
        ceilingFan.setSpeed();
        ceilingFan.rotate();
    }
}
