package com.xworkz.isarelation.trafficlight;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of TrafficLight");
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.turnRed();
        trafficLight.turnYellow();
        trafficLight.turnGreen();
        trafficLight.blinkLight();

        System.out.println("\nCreating an instance of SmartTrafficLight using TrafficLight reference");
        TrafficLight ref = new SmartTrafficLight();
        ref.turnRed();
        ref.turnYellow();
        ref.turnGreen();
        ref.blinkLight();

        System.out.println("\nCreating an instance of SmartTrafficLight using subclass reference");
        SmartTrafficLight smart = new SmartTrafficLight();
        smart.turnRed();
        smart.turnYellow();
        smart.turnGreen();
        smart.blinkLight();
    }
}
