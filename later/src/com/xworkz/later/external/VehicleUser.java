package com.xworkz.later.external;

import com.xworkz.later.internal.Vehicle;

public class VehicleUser {

    Vehicle vehicle;

    public VehicleUser(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Vehicle user is initialized");
    }

    public void operate() {
        if (this.vehicle != null) {
            this.vehicle.start();
        } else {
            System.out.println("No vehicle to operate");
        }
    }
}
