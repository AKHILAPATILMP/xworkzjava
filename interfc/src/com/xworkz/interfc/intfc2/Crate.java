package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Crate implements VacuumCleaner, WaterPump, Sofa, Speaker, Table {
    @Override
    public void sit() {
        System.out.println("running a method");
    }

    @Override
    public void recline() {
        System.out.println("running a method");
    }

    @Override
    public void unfoldBed() {
        System.out.println("running a method");
    }

    @Override
    public void playSound() {
        System.out.println("running a method");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running a method");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running a method");
    }

    @Override
    public void placeItems() {
        System.out.println("running a method");
    }

    @Override
    public void cleanSurface() {
        System.out.println("running a method");
    }

    @Override
    public void foldTable() {
        System.out.println("running a method");
    }

    @Override
    public void clean() {
        System.out.println("running a method");
    }

    @Override
    public void emptyDustbin() {
        System.out.println("running a method");
    }

    @Override
    public void adjustSuction() {
        System.out.println("running a method");
    }

    @Override
    public void pumpWater() {
        System.out.println("running a method");
    }

    @Override
    public void stopPump() {
        System.out.println("running a method");
    }

    @Override
    public void adjustPressure() {
        System.out.println("running a method");
    }
    @Override
    public void cleaner() {
        System.out.println("sys");
    }
}
