package com.xworkz.equals.external;

import com.xworkz.equals.internal.SolarPanel;

public class SolarPanelRunner {
    public static void main(String[] args) {

        SolarPanel panel1 = new SolarPanel();
        panel1.setType("Monocrystalline");
        panel1.setCapacity(300);
        panel1.setEfficiency(19.5);
        panel1.setManufacturer("SolarTech");

        SolarPanel panel2 = new SolarPanel();
        panel2.setType("Monocrystalline");  // Same type
        panel2.setCapacity(350);
        panel2.setEfficiency(20.1);
        panel2.setManufacturer("SunPower");

        boolean same = panel1.equals(panel2);
        System.out.println("panel1 equals panel2: " + same);

        System.out.println("SolarPanel 1: " + panel1);
        System.out.println("SolarPanel 2: " + panel2);

        System.out.println("SolarPanel 1 hashCode: " + panel1.hashCode());
        System.out.println("SolarPanel 2 hashCode: " + panel2.hashCode());
    }
}
