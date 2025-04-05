package com.xworkz.isarelation.television;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Television");
        Television tv = new Television();
        tv.turnOn();
        tv.changeChannel();
        tv.adjustVolume();
        tv.turnOff();

        System.out.println("\nCreating an instance of SmartTelevision using Television reference");
        Television tvRef = new SmartTelevision();
        tvRef.turnOn();
        tvRef.changeChannel();
        tvRef.adjustVolume();
        tvRef.turnOff();

        System.out.println("\nCreating an instance of SmartTelevision using subclass reference");
        SmartTelevision smartTv = new SmartTelevision();
        smartTv.turnOn();
        smartTv.changeChannel();
        smartTv.adjustVolume();
        smartTv.turnOff();
    }
}
