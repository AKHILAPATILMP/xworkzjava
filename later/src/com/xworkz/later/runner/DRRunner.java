package com.xworkz.later.runner;

import com.xworkz.later.internal.Drone;
import com.xworkz.later.internal.DroneImpl;
import com.xworkz.later.external.DroneUser;

public class DRRunner {
    public static void main(String[] args) {
        Drone drone = new DroneImpl();
        DroneUser droneUser = new DroneUser(drone); // abstraction
        droneUser.activate();
    }
}
