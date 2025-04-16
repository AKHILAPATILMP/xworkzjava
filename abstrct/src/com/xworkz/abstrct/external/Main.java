package com.xworkz.abstrct.external;

import com.xworkz.abstrct.internal.*;

public class Main {
    public static void main(String[] args) {

        // Creating objects of the concrete subclasses

        // Create PassengerAeroplane object and invoke methods
        PassengerAeroplane passengerAeroplane = new PassengerAeroplane();
        passengerAeroplane.fly();  // Method from Aeroplane class

        // Create IndigoAirline object and invoke methods
        IndigoAirline indigoAirline = new IndigoAirline();
        indigoAirline.conditionofair();  // Method from Airline class

        // Create GreenApple object and invoke methods
        GreenApple greenApple = new GreenApple();
        greenApple.eat();  // Method from GreenApple class
        greenApple.cut();  // Method from Apple class

        // Create WashingMachine object and invoke methods
        WashingMachine washingMachine = new WashingMachine("Front Load WM", "LG", 2000, 45000);
        washingMachine.operate();  // Method from WashingMachine class
        washingMachine.showDetails();  // Method from Appliance class

        // Create Smartphone object and invoke methods
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 999.99);
        smartphone.powerOn();  // Method from Smartphone class
    }
}
