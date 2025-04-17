package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Train;
import com.xworkz.interfc.externali.Truck;

public class Ticket implements Train, Truck {
    @Override
    public void boardTrain() {
        System.out.println("");
    }

    @Override
    public void travel() {
        System.out.println("");
    }

    @Override
    public void disembark() {
        System.out.println("");
    }

    @Override
    public void loadCargo() {
        System.out.println("");
    }

    @Override
    public void unloadCargo() {
        System.out.println("");
    }

    @Override
    public void startEngine() {
        System.out.println("");
    }

    @Override
    public void drive() {
        System.out.println("");
    }
}
