package com.xworkz.isarelation.fence;

public class ElectricFence extends Fence {

    public ElectricFence() {
        super();
        System.out.println("ElectricFence constructor is running - subclass");
    }

    @Override
    public void build() {
        System.out.println("Building an electric fence with sensors - subclass");
    }

    @Override
    public void openGate() {
        System.out.println("Opening electric gate remotely - subclass");
    }

    @Override
    public void closeGate() {
        System.out.println("Closing electric gate with security lock - subclass");
    }

    @Override
    public void checkSecurity() {
        System.out.println("Checking electric fence voltage and alarms - subclass");
    }
}


