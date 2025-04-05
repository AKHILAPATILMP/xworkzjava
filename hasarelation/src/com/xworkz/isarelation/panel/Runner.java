package com.xworkz.isarelation.panel;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Panel");
        Panel panel = new Panel();
        panel.install();
        panel.generatePower();
        panel.monitor();
        panel.maintain();

        System.out.println("\nCreating an instance of SolarPanel using Panel reference");
        Panel panelRef = new SolarPanel();
        panelRef.install();
        panelRef.generatePower();
        panelRef.monitor();
        panelRef.maintain();

        System.out.println("\nCreating an instance of SolarPanel using subclass reference");
        SolarPanel solarPanel = new SolarPanel();
        solarPanel.install();
        solarPanel.generatePower();
        solarPanel.monitor();
        solarPanel.maintain();
    }
}
