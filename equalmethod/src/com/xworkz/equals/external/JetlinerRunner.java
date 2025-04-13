package com.xworkz.equals.external;

import com.xworkz.equals.internal.Jetliner;

public class JetlinerRunner {
    public static void main(String[] args) {

        Jetliner jet1 = new Jetliner();
        jet1.setModel("Boeing 777");
        jet1.setCapacity(396);
        jet1.setRange(8000);
        jet1.setAirline("Emirates");

        Jetliner jet2 = new Jetliner();
        jet2.setModel("Boeing 777");
        jet2.setCapacity(400);
        jet2.setRange(8000);
        jet2.setAirline("Qatar Airways");

        boolean same = jet1.equals(jet2);
        System.out.println("jet1 equals jet2: " + same);

        System.out.println("Jetliner 1: " + jet1);
        System.out.println("Jetliner 2: " + jet2);

        System.out.println("Jetliner 1 hashCode: " + jet1.hashCode());
        System.out.println("Jetliner 2 hashCode: " + jet2.hashCode());
    }
}
