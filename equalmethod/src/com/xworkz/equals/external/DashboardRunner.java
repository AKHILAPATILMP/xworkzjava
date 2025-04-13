package com.xworkz.equals.external;

import com.xworkz.equals.internal.Dashboard;

public class DashboardRunner {
    public static void main(String[] args) {

        Dashboard dash1 = new Dashboard();
        dash1.setLayout("Grid");
        dash1.setTheme("Dark");
        dash1.setWidgets(5);
        dash1.setIsCustomizable(true);

        Dashboard dash2 = new Dashboard();
        dash2.setLayout("Grid");
        dash2.setTheme("Dark");
        dash2.setWidgets(10);
        dash2.setIsCustomizable(false);

        boolean same = dash1.equals(dash2);
        System.out.println("dash1 equals dash2: " + same);

        System.out.println("Dashboard 1: " + dash1);
        System.out.println("Dashboard 2: " + dash2);

        System.out.println("Dashboard 1 hashCode: " + dash1.hashCode());
        System.out.println("Dashboard 2 hashCode: " + dash2.hashCode());
    }
}
