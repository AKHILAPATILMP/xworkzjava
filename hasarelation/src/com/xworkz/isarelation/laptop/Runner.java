package com.xworkz.isarelation.laptop;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Laptop:");
        Laptop regularLaptop = new Laptop();
        regularLaptop.powerOn();
        regularLaptop.powerOff();
        regularLaptop.openLid();
        regularLaptop.closeLid();
        regularLaptop.charge();

        System.out.println("\nCreating instance of GamingLaptop using Laptop reference:");
        Laptop laptopRef = new GamingLaptop();
        laptopRef.powerOn();
        laptopRef.powerOff();
        laptopRef.openLid();
        laptopRef.closeLid();
        laptopRef.charge();

        System.out.println("\nCreating instance of GamingLaptop using subclass reference:");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.powerOn();
        gamingLaptop.powerOff();
        gamingLaptop.openLid();
        gamingLaptop.closeLid();
        gamingLaptop.charge();
        gamingLaptop.activateTurboMode();

        System.out.println("\nUsing TechSupport to diagnose and cast laptops:");
        TechSupport support = new TechSupport();
        support.diagnose(regularLaptop);
        support.diagnose(laptopRef);
        support.diagnose(gamingLaptop);
    }
}
