package com.xworkz.isarelation.ac;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of AC");
            AC ac = new AC();
            ac.turnOn();
            ac.turnOff();
            ac.setTemperature();
            ac.enableCooling();

            System.out.println("\nCreating an instance of SmartAC using AC reference");
            AC ac1 = new SmartAC();
            ac1.turnOn();
            ac1.turnOff();
            ac1.setTemperature();
            ac1.enableCooling();


            System.out.println("\nCreating an instance of SmartAC using subclass reference");
            SmartAC smartac = new SmartAC();
            smartac.turnOn();
            smartac.turnOff();
            smartac.setTemperature();
            smartac.enableCooling();

        }
    }

