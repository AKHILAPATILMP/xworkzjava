package com.xworkz.isarelation.submarine;

public class MilitarySubmarine extends Submarine {

    public MilitarySubmarine() {
        super();
        System.out.println("MilitarySubmarine constructor is running - subclass");
    }

    @Override
    public void dive() {
        System.out.println("MilitarySubmarine is diving stealthily - subclass");
    }

    @Override
    public void surface() {
        System.out.println("MilitarySubmarine is surfacing carefully - subclass");
    }

    @Override
    public void navigate() {
        System.out.println("MilitarySubmarine is navigating using sonar - subclass");
    }

    @Override
    public void detectObjects() {
        System.out.println("MilitarySubmarine is detecting enemy vessels - subclass");
    }
}
