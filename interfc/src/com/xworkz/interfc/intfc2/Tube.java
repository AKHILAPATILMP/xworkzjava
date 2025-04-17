package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Tube extends Lamp implements Iron, LampPost, Microwave, MicrowaveOven {
    @Override
    public void heat() {
        System.out.println("running a method");
    }

    @Override
    public void defrost() {
        System.out.println("running a method");
    }

    @Override
    public void cook() {
        System.out.println("running a method");
    }

    @Override
    public void ironClothes() {
        System.out.println("running a method");
    }

    @Override
    public void steam() {
        System.out.println("running a method");
    }

    @Override
    public void post() {

    }

    @Override
    public void turnOn() {
        System.out.println("running a method");
    }

    @Override
    public void turnOff() {
        System.out.println("running a method");
    }

    @Override
    public void adjustHeight() {
        System.out.println("running a method");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("running a method");
    }

    @Override
    public void microwave() {
        System.out.println("running a method");
    }

    @Override
    public void bake() {
        System.out.println("running a method");
    }

    @Override
    public void grill() {
        System.out.println("running a method");
    }

    @Override
    public void wave() {
        System.out.println("wave");
    }
}