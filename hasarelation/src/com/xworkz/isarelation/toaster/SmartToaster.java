package com.xworkz.isarelation.toaster;
public class SmartToaster extends Toaster {

    public SmartToaster() {
        super();
        System.out.println("SmartToaster constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartToaster is turned on via voice command - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartToaster is turned off via app - subclass");
    }

    @Override
    public void toastBread() {
        System.out.println("SmartToaster is toasting bread with custom settings - subclass");
    }

    @Override
    public void eject() {
        System.out.println("SmartToaster auto-ejects after toasting - subclass");
    }
}
