package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Dehumidifier;
import com.xworkz.interfc.externali.Dishwasher;

public class Car implements Dehumidifier, Dishwasher {
    @Override
    public void removeMoisture() {
        System.out.println("remove");
    }

    @Override
    public void adjustHumidity() {
        System.out.println("adjusthumi");
    }

    @Override
    public void emptyTank() {
        System.out.println("emptyy");
    }

    @Override
    public void washDishes() {
        System.out.println("wash");
    }

    @Override
    public void rinseDishes() {
        System.out.println("rinse them");
    }

    @Override
    public void dryDishes() {
        System.out.println("dry them");
    }
}
