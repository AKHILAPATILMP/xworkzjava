package com.xworkz.later.external;

import com.xworkz.later.internal.Drone;

public class DroneUser {

    Drone drone;

    public DroneUser(Drone drone) {
        this.drone = drone;
        System.out.println("DroneUser is initialized");
    }

    public void activate() {
        if (this.drone != null) {
            this.drone.fly();
        } else {
            System.out.println("No drone to fly");
        }
    }
}
