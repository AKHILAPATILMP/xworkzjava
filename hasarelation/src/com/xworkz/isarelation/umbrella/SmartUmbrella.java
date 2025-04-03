package com.xworkz.isarelation.umbrella;
    public class SmartUmbrella extends Umbrella {
        public SmartUmbrella() {
            super();
            System.out.println("SmartUmbrella constructor is running");
        }

        public void autoOpen() {
            System.out.println("SmartUmbrella is opening automatically");
        }

        public void autoClose() {
            System.out.println("SmartUmbrella is closing automatically");
        }

        public void weatherAlert() {
            System.out.println("SmartUmbrella is providing a weather alert");
        }

        public void solarCharging() {
            System.out.println("SmartUmbrella is charging devices using solar panels");
        }

        public void LEDLight() {
            System.out.println("SmartUmbrella has built-in LED lights for visibility");
        }
    }

