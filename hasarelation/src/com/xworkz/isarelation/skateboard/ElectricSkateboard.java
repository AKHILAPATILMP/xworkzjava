package com.xworkz.isarelation.skateboard;

public class ElectricSkateboard extends Skateboard {

    public ElectricSkateboard() {
        super();
        System.out.println("ElectricSkateboard constructor is running - subclass");
    }

    @Override
    public void ride() {
        System.out.println("Riding the electric skateboard with motor - subclass");
    }

    @Override
    public void brake() {
        System.out.println("Applying electric brake - subclass");
    }

    @Override
    public void performTrick() {
        System.out.println("Performing trick with electric balance assist - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Electric skateboard has stopped using power cutoff - subclass");
    }
}
