package com.xworkz.isarelation.ac;
    public class SmartAC extends AC {
        public SmartAC() {
            super();
            System.out.println("AC constructor is running subclass");
        }

        @Override
        public void turnOn() {
            System.out.println("SmartAC is turned on with smart features subclass");
        }

        @Override
        public void turnOff() {
            System.out.println("SmartAC is turned off subclass");
        }

        @Override
        public void setTemperature() {
            System.out.println("SmartAC temperature is set using smart sensors subclass");
        }

        @Override
        public void enableCooling() {
            System.out.println("SmartAC is in advanced cooling mode subclass");
        }

    }

