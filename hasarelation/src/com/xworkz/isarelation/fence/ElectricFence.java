package com.xworkz.isarelation.fence;

public class ElectricFence extends Fence {

    public ElectricFence() {
        super();
        System.out.println("ElectricFence constructor is running - subclass");
    }

    @Override
    public void build() {
        System.out.println("Building an electric fence - subclass");
    }

    @Override
    public void paint() {
        System.out.println("Painting electric fence with weather-resistant paint - subclass");
    }

    @Override
    public void repair() {
        System.out.println("Repairing electric wiring in fence - subclass");
    }

    @Override
    public void inspect() {
        System.out.println("Inspecting electric current and connections - subclass");
    }

    @Override
    public void openGate() {
        System.out.println("Opening electric gate with remote - subclass");
    }

    public void activateElectricity() {
        System.out.println("Activating electric current in fence - subclass only");
    }
}
