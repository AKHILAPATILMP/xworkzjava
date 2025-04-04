package com.xworkz.isarelation.laptop;

public class GamingLaptop extends Laptop {

    public GamingLaptop() {
        super();
        System.out.println("GamingLaptop constructor is running - subclass");
    }

    @Override
    public void powerOn() {
        System.out.println("GamingLaptop powers on with RGB lighting - subclass");
    }

    @Override
    public void powerOff() {
        System.out.println("GamingLaptop is shutting down with system clean-up - subclass");
    }

    @Override
    public void runApplication() {
        System.out.println("GamingLaptop is running high-performance games - subclass");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("GamingLaptop is connecting to high-speed gaming network - subclass");
    }
}

