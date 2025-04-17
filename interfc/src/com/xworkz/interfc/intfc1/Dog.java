package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Elevator;
import com.xworkz.interfc.externali.Fan;

public class Dog implements Elevator, Fan {
    @Override
    public void moveUp() {
        System.out.println("");
    }

    @Override
    public void moveDown() {
        System.out.println("");
    }

    @Override
    public void openDoors() {
        System.out.println("");
    }

    @Override
    public void turnOn() {
        System.out.println("");
    }

    @Override
    public void turnOff() {
        System.out.println("");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("");
    }
}
