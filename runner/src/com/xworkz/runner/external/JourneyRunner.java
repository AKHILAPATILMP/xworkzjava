package com.xworkz.runner.external;

import com.xworkz.runner.internal.Journey;

public class JourneyRunner {
    public static void main(String[] args) {
        Journey journey = new Journey("Himalayas", 10, 12000.75);
        String journeyString = journey.toString();
        System.out.println("Journey details: " + journeyString);

        int hash = journey.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "adventure";
        String two = "road";
        String three = "trail";

        System.out.println("adventure: " + one.hashCode());
        System.out.println("road: " + two.hashCode());
        System.out.println("trail: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(journey));
    }
}
