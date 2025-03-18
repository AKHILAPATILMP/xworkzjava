package com.xworkz.akhila.space;

public class Space {
    void hold(Planet planet) {
        if (planet != null) {
            planet.revolve();
        } else {
            System.out.println("No planet exists in space");
        }
    }
}
