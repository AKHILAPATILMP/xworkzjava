package com.xworkz.isarelation.trafficlight;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of TrafficLight");
            TrafficLight trafficLight = new TrafficLight();
            trafficLight.showRed();
            trafficLight.showYellow();
            trafficLight.showGreen();
            trafficLight.blinkYellow();
            trafficLight.emergencyMode();

            System.out.println("\nCreating an instance of SmartTrafficLight using TrafficLight reference");
            TrafficLight trafficLightRef = new SmartTrafficLight();
            trafficLightRef.showRed();
            trafficLightRef.showYellow();
            trafficLightRef.showGreen();
            trafficLightRef.blinkYellow();
            trafficLightRef.emergencyMode();

            System.out.println("\nCreating an instance of SmartTrafficLight using subclass reference");
            SmartTrafficLight smartLight = new SmartTrafficLight();
            smartLight.showRed();
            smartLight.showYellow();
            smartLight.showGreen();
            smartLight.blinkYellow();
            smartLight.emergencyMode();
            smartLight.adjustTiming();
            smartLight.detectPedestrians();
            smartLight.syncWithOtherLights();
            smartLight.controlRemotely();
            smartLight.reportMalfunction();
        }
    }

