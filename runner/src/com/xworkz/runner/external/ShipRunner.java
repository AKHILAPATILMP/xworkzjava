package com.xworkz.runner.external;

import com.xworkz.runner.internal.Ship;

public class ShipRunner {
    public static void main(String[] args) {
        Ship ship = new Ship("Titanic", 882.75, "Passenger Transport");
        String shipString = ship.toString();
        System.out.println("Ship details: " + shipString);

        int hash = ship.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "ocean";
        String two = "deck";
        String three = "voyage";

        System.out.println("ocean: " + one.hashCode());
        System.out.println("deck: " + two.hashCode());
        System.out.println("voyage: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(ship));
    }
}
