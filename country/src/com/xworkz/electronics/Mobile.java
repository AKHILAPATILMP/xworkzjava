package com.xworkz.electronics;

public class Mobile {

        public String model;
        double batteryCapacity;
        private String os;

        public Mobile(String model, double batteryCapacity, String os) {
            this.model = model;
            this.batteryCapacity = batteryCapacity;
            this.os = os;
        }

        public void showMobile() {
            System.out.println("Mobile: " + model + ", Battery: " + batteryCapacity + "mAh");
            showOS();
        }

        void showBattery() {
            System.out.println("Battery: " + batteryCapacity + "mAh");
        }

        private void showOS() {
            System.out.println("Operating System: " + os);
        }
    }


