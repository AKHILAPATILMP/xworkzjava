package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Drone;
import com.xworkz.interfc.externali.ElectricCar;

public class Cat implements Drone, ElectricCar {
    @Override
    public void fly() {
        System.out.println("");
    }

    @Override
    public void recordVideo() {
        System.out.println("");
    }

    @Override
    public void takePhotos() {
        System.out.println("");
    }

    @Override
    public void charge() {
        System.out.println("");
    }

    @Override
    public void drive() {
        System.out.println("");
    }

    @Override
    public void monitorBattery() {
        System.out.println("");
    }
    @Override
    public void highfly(){
        System.out.println("highfly");
    }
    @Override
    public  void automate (){
        System.out.println("automate");
    }
}
