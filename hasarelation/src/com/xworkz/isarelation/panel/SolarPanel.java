package com.xworkz.isarelation.panel;

public class SolarPanel extends Panel {

    public SolarPanel() {
        super();
        System.out.println("SolarPanel constructor is running - subclass");
    }

    @Override
    public void install() {
        System.out.println("Installing solar panel on the rooftop - subclass");
    }

    @Override
    public void generatePower() {
        System.out.println("Generating electricity using sunlight - subclass");
    }

    @Override
    public void monitor() {
        System.out.println("Monitoring solar energy output - subclass");
    }

    @Override
    public void maintain() {
        System.out.println("Cleaning and checking solar panel health - subclass");
    }
}

