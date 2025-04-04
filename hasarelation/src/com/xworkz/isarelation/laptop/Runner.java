package com.xworkz.isarelation.laptop;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Laptop");
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.powerOff();
        laptop.runApplication();
        laptop.connectToWiFi();

        System.out.println("\nCreating an instance of GamingLaptop using Laptop reference");
        Laptop laptopRef = new GamingLaptop();
        laptopRef.powerOn();
        laptopRef.powerOff();
        laptopRef.runApplication();
        laptopRef.connectToWiFi();

        System.out.println("\nCreating an instance of GamingLaptop using subclass reference");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.powerOn();
        gamingLaptop.powerOff();
        gamingLaptop.runApplication();
        gamingLaptop.connectToWiFi();
    }
}


