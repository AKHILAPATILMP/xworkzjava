package com.xworkz.isarelation.bicycle;

public class MountainBike extends Bicycle {

    public MountainBike() {
        super();
        System.out.println("MountainBike constructor is running - subclass");
    }

    @Override
    public void ride() {
        System.out.println("Riding the mountain bike on rough terrain - subclass");
    }

    @Override
    public void brake() {
        System.out.println("Mountain bike using disc brakes - subclass");
    }

    @Override
    public void ringBell() {
        System.out.println("Ringing mountain bike bell - subclass");
    }

    @Override
    public void adjustSeat() {
        System.out.println("Adjusting shock-absorbing seat - subclass");
    }

    @Override
    public void inflateTyres() {
        System.out.println("Inflating thick tyres for off-road - subclass");
    }

    public void changeGears() {
        System.out.println("Changing gears on mountain bike - subclass");
    }
}
