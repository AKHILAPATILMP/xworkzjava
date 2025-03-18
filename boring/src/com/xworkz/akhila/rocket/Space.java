package com.xworkz.akhila.rocket;

public class Space {
    void enter(Rocket rocket) {
        if (rocket != null) {
            rocket.launch();
        } else {
            System.out.println("No rocket available for launch");
        }
    }
}
