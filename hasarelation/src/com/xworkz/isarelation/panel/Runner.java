package com.xworkz.isarelation.panel;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Panel");
            Panel panel = new Panel();
            panel.display();
            panel.control();
            panel.adjust();
            panel.monitor();
            panel.configure();

            System.out.println("\nCreating an instance of SolarPanel using Panel reference");
            Panel panelRef = new SolarPanel();
            panelRef.display();
            panelRef.control();
            panelRef.adjust();
            panelRef.monitor();
            panelRef.configure();

            System.out.println("\nCreating an instance of SolarPanel using subclass reference");
            SolarPanel solarPanel = new SolarPanel();
            solarPanel.display();
            solarPanel.control();
            solarPanel.adjust();
            solarPanel.monitor();
            solarPanel.configure();
            solarPanel.absorbSunlight();
            solarPanel.generateElectricity();
            solarPanel.storeEnergy();
            solarPanel.optimizeEfficiency();
            solarPanel.withstandWeather();
        }
    }

