package com.xworkz.later.external;

import com.xworkz.later.internal.Compass;

public class CompassUser {

    Compass compass;

    public CompassUser(Compass compass) {
        this.compass = compass;
        System.out.println("CompassUser is initialized");
    }

    public void activate() {
        if (this.compass != null) {
            this.compass.navigate();
        } else {
            System.out.println("No compass to navigate");
        }
    }
}
