package com.xworkz.isarelation.trafficlight;
    public class SmartTrafficLight extends TrafficLight {
        public SmartTrafficLight() {
            super();
            System.out.println("SmartTrafficLight constructor is running");
        }

        public void adjustTiming() {
            System.out.println("SmartTrafficLight is adjusting signal timing based on traffic flow");
        }

        public void detectPedestrians() {
            System.out.println("SmartTrafficLight is detecting pedestrians");
        }

        public void syncWithOtherLights() {
            System.out.println("SmartTrafficLight is synchronizing with nearby traffic lights");
        }

        public void controlRemotely() {
            System.out.println("SmartTrafficLight is being controlled remotely");
        }

        public void reportMalfunction() {
            System.out.println("SmartTrafficLight is reporting a malfunction");
        }
    }


