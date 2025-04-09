package com.xworkz.runner.external;

import com.xworkz.runner.internal.Ship;

public class ShipRunner {
    public static void main(String[] args) {
        Ship ship = new Ship("Titanic", "Cruise", 500000000);
        String shipString = ship.toString();
        System.out.println("ship" + shipString);
    }
}
