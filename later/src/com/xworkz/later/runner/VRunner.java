package com.xworkz.later.runner;

import com.xworkz.later.internal.Vehicle;
import com.xworkz.later.internal.VehicleImpl;
import com.xworkz.later.external.VehicleUser;

public class VRunner { 
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        VehicleUser vehicleUser = new VehicleUser(vehicle); // abstraction
        vehicleUser.operate();
    }
}
