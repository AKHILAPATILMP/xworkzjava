package com.xworkz.isarelation.tent;

    public class SmartTent extends Tent {
        public SmartTent() {
            super();
            System.out.println("SmartTent constructor is running");
        }

        public void adjustTemperature() {
            System.out.println("SmartTent is adjusting temperature automatically");
        }

        public void solarPower() {
            System.out.println("SmartTent is generating solar power");
        }

        public void autoSetup() {
            System.out.println("SmartTent is setting up automatically");
        }

        public void enableLEDLighting() {
            System.out.println("SmartTent has enabled LED lighting");
        }

        public void connectToApp() {
            System.out.println("SmartTent is connecting to a mobile app");
        }
    }

