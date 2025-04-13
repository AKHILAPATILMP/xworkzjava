package com.xworkz.equals.external;

import com.xworkz.equals.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {

        Drone drone1 = new Drone();
        drone1.setModelName("DJI Phantom");

        Drone drone2 = new Drone();
        drone2.setModelName("DJI Phantom");

        boolean same = drone1.equals(drone2);
        System.out.println("drone1 equals drone2: " + same);

        System.out.println("Drone 1: " + drone1);
        System.out.println("Drone 2: " + drone2);

        System.out.println("Drone 1 hashCode: " + drone1.hashCode());
        System.out.println("Drone 2 hashCode: " + drone2.hashCode());
    }
}
