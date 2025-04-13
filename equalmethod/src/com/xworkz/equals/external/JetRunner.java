package com.xworkz.equals.external;

import com.xworkz.equals.internal.Jet;

public class JetRunner {
    public static void main(String[] args) {

        Jet jet1 = new Jet();
        jet1.setModel("Boeing 737");
        jet1.setMaxSpeed(850);
        jet1.setEngineType("Turbofan");

        Jet jet2 = new Jet();
        jet2.setModel("Boeing 737");
        jet2.setMaxSpeed(850);
        jet2.setEngineType("Turbofan");

        boolean same = jet1.equals(jet2);
        System.out.println("jet1 equals jet2: " + same);

        System.out.println("Jet 1: " + jet1);
        System.out.println("Jet 2: " + jet2);

        System.out.println("Jet 1 hashCode: " + jet1.hashCode());
        System.out.println("Jet 2 hashCode: " + jet2.hashCode());
    }
}
