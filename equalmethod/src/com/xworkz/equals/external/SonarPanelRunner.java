package com.xworkz.equals.external;

import com.xworkz.equals.internal.SonarPanel;

public class SonarPanelRunner {
    public static void main(String[] args) {

        SonarPanel panel1 = new SonarPanel();
        panel1.setType("Active");
        panel1.setFrequency(50.5);
        panel1.setManufacturer("Raytheon");
        panel1.setRange(1200);

        SonarPanel panel2 = new SonarPanel();
        panel2.setType("Active"); // same type
        panel2.setFrequency(60.0);
        panel2.setManufacturer("Thales");
        panel2.setRange(1500);

        boolean same = panel1.equals(panel2);
        System.out.println("panel1 equals panel2: " + same);

        System.out.println("Sonar Panel 1: " + panel1);
        System.out.println("Sonar Panel 2: " + panel2);

        System.out.println("Sonar Panel 1 hashCode: " + panel1.hashCode());
        System.out.println("Sonar Panel 2 hashCode: " + panel2.hashCode());
    }
}
