package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.AC;
import com.xworkz.interfc.externali.Airplane;

public class Student implements AC, Airplane {
    @Override
    public void cool() {
        System.out.println("AC is cooling the room.");
    }

    @Override
    public void heat() {
        System.out.println("AC is heating the room.");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Adjusting the AC temperature to optimal comfort.");
    }


    @Override
    public void takeOff() {
        System.out.println("take off");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
