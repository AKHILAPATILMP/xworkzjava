package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hydroplane;

public class HydroplaneRunner {
    public static void main(String[] args) {

        Hydroplane hydroplane1 = new Hydroplane();
        hydroplane1.setModel("AeroHydro");

        Hydroplane hydroplane2 = new Hydroplane();
        hydroplane2.setModel("AeroHydro");

        boolean same = hydroplane1.equals(hydroplane2);
        System.out.println("hydroplane1 equals hydroplane2: " + same);

        System.out.println("Hydroplane 1: " + hydroplane1);
        System.out.println("Hydroplane 2: " + hydroplane2);

        System.out.println("Hydroplane 1 hashCode: " + hydroplane1.hashCode());
        System.out.println("Hydroplane 2 hashCode: " + hydroplane2.hashCode());
    }
}
