package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.ElectricKettle;
import com.xworkz.interfc.externali.Elevator;

public class Customer implements ElectricKettle, Elevator {
    @Override
    public void boilWater() {
        System.out.println("");
    }

    @Override
    public void keepWarm() {
        System.out.println("");
    }

    @Override
    public void turnOff() {
        System.out.println("");
    }

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
    public void kettle(){
        System.out.println("kettle is electric");
    }
    @Override
    public void closedoor (){
        System.out.println("close the door");
    }
}
