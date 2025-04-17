package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Chip implements Elevator, Fan, FanCooler, FanHeater, FireExtinguisher {
    @Override
    public void moveUp() {
        System.out.println("running a method");
    }

    @Override
    public void moveDown() {
        System.out.println("running a method");
    }

    @Override
    public void openDoors() {
        System.out.println("running a method");
    }

    @Override
    public void turnOn() {
        System.out.println("running a method");
    }

    @Override
    public void turnOff() {
        System.out.println("running a method");
    }

    @Override
    public void heat() {
        System.out.println("running a method");
    }

    @Override
    public void cool() {
        System.out.println("running a method");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("running a method");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("running a method");
    }

    @Override
    public void oscillate() {
        System.out.println("running a method");
    }

    @Override
    public void releaseFoam() {
        System.out.println("running a method");
    }

    @Override
    public void extinguishFire() {
        System.out.println("running a method");
    }

    @Override
    public void inspectPressure() {
        System.out.println("running a method");
    }
}
