package com.xworkz.isarelation.laptop;

public class TechSupport {
    public void diagnose(Laptop laptop) {
        laptop.powerOn();
        laptop.powerOff();
        laptop.openLid();
        laptop.closeLid();
        laptop.charge();

        if (laptop instanceof GamingLaptop) {
            System.out.println("Casting Laptop to GamingLaptop...");
            GamingLaptop gaming = (GamingLaptop) laptop;
            gaming.activateTurboMode();
        }
    }
}
