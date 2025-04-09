package com.xworkz.runner.external;

import com.xworkz.runner.internal.Truck;

public class TruckRunner {
    public static void main(String[] args) {
        Truck truck = new Truck("Tata", 10, 2500000);
        String truckString = truck.toString();
        System.out.println("truck" + truckString);
    }
}
