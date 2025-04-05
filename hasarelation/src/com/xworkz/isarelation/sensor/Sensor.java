package com.xworkz.isarelation.sensor;

public class Sensor {

    public Sensor() {
        System.out.println("Sensor constructor is running - parent class");
    }

    public void detect() {
        System.out.println("Sensor is detecting activity - parent class");
    }

    public void calibrate() {
        System.out.println("Calibrating sensor - parent class");
    }

    public void reset() {
        System.out.println("Sensor has been reset - parent class");
    }

    public void displayStatus() {
        System.out.println("Displaying sensor status - parent class");
    }
}

