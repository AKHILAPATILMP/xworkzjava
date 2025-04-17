package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.CarCharger;
import com.xworkz.interfc.externali.Chair;

public class Bike implements CarCharger, Chair {
    @Override
    public void chargeBattery() {
        System.out.println("charge");
    }

    @Override
    public void monitorPowerLevel() {
        System.out.println("powerlevel");
    }

    @Override
    public void adjustChargingSpeed() {
        System.out.println("adjust speed");
    }

    @Override
    public void sit() {
        System.out.println("sit");
    }

    @Override
    public void adjustHeight() {
        System.out.println("height");
    }

    @Override
    public void rotate() {
        System.out.println("rotate");
    }
    @Override
    public void movecar(){
        System.out.println("move the car");
    }
}
