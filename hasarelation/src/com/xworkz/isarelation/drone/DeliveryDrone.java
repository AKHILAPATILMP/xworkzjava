package com.xworkz.isarelation.drone;
public class DeliveryDrone extends Drone {

    public DeliveryDrone() {
        super();
        System.out.println("DeliveryDrone constructor is running - subclass");
    }

    @Override
    public void takeOff() {
        System.out.println("DeliveryDrone is taking off with package - subclass");
    }

    @Override
    public void fly() {
        System.out.println("DeliveryDrone is flying to delivery location - subclass");
    }

    @Override
    public void land() {
        System.out.println("DeliveryDrone is landing at customer location - subclass");
    }

    @Override
    public void captureImage() {
        System.out.println("DeliveryDrone is capturing delivery confirmation image - subclass");
    }
}
