package com.xworkz.isarelation.bicycle;
    public class SmartBicycle extends Bicycle {
        public SmartBicycle() {
            super();
            System.out.println("SmartBicycle constructor is running");
        }

        public void gpsNavigation() {
            System.out.println("SmartBicycle is using GPS navigation");
        }

        public void electricAssist() {
            System.out.println("SmartBicycle is providing electric pedal assist");
        }

        public void autoGearShift() {
            System.out.println("SmartBicycle is shifting gears automatically");
        }

        public void fitnessTracking() {
            System.out.println("SmartBicycle is tracking fitness metrics");
        }
    }

