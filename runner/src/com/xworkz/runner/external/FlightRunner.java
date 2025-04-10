package com.xworkz.runner.external;

import com.xworkz.runner.internal.Flight;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Air India", "Delhi", 2.5);
        String flightString = flight.toString();
        System.out.println("Flight details: " + flightString);

        int hash = flight.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "takeoff";
        String two = "landing";
        String three = "airborne";

        System.out.println("takeoff: " + one.hashCode());
        System.out.println("landing: " + two.hashCode());
        System.out.println("airborne: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(flight));
    }
}
