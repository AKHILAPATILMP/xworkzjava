package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.FanCooler;
import com.xworkz.interfc.externali.FanHeater;

public class Employee implements FanCooler, FanHeater {
    @Override
    public void heat() {
        System.out.println("");
    }

    @Override
    public void cool() {
        System.out.println("");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("");
    }

    @Override
    public void oscillate() {
        System.out.println("");
    }
    @Override
    public void fanrotate (){
        System.out.println("fan rotate");
    }
    @Override
    public void low(){
        System.out.println("cool is low");
    }
}
