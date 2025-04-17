package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.GPSNavigator;
import com.xworkz.interfc.externali.HairDryer;

public class Hotel implements GPSNavigator, HairDryer {
    @Override
    public void calculateRoute() {
        System.out.println("");
    }

    @Override
    public void provideDirections() {
        System.out.println("");
    }

    @Override
    public void setDestination() {
        System.out.println("");
    }

    @Override
    public void dryHair() {
        System.out.println("");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("");
    }

    @Override
    public void coolDown() {
        System.out.println("");
    }
}
