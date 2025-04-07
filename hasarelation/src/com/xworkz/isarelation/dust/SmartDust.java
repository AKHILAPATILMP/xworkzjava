package com.xworkz.isarelation.dust;

public class SmartDust extends Dust {

    public SmartDust() {
        super();
        System.out.println("SmartDust constructor is running - subclass");
    }

    @Override
    public void settle() {
        System.out.println("SmartDust settles intelligently on surfaces - subclass");
    }

    @Override
    public void fly() {
        System.out.println("SmartDust is controlled via micro-sensors - subclass");
    }

    @Override
    public void collect() {
        System.out.println("SmartDust collected using magnetic field - subclass");
    }

    @Override
    public void blow() {
        System.out.println("SmartDust resists wind - subclass");
    }

    @Override
    public void observe() {
        System.out.println("SmartDust provides environmental data - subclass");
    }

    public void transmitData() {
        System.out.println("SmartDust is transmitting environmental data - subclass only");
    }
}
