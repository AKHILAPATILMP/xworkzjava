package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public abstract class Lamp implements Oven, Phone, Mixer, Printer, Router {
    @Override
    public void mix() {
        System.out.println("running a method");
    }

    @Override
    public void stir() {
        System.out.println("running a method");
    }

    @Override
    public void beat() {
        System.out.println("running a method");
    }

    public abstract void adjustBrightness();

    @Override
    public void bake() {
        System.out.println("running a method");
    }

    @Override
    public void grill() {
        System.out.println("running a method");
    }

    @Override
    public void preheat() {
        System.out.println("running a method");
    }

    @Override
    public void call() {
        System.out.println("running a method");
    }

    @Override
    public void text() {
        System.out.println("running a method");
    }

    @Override
    public void browse() {
        System.out.println("running a method");
    }

    @Override
    public void print() {
        System.out.println("running a method");
    }

    @Override
    public void scan() {
        System.out.println("running a method");
    }

    @Override
    public void copy() {
        System.out.println("running a method");
    }

    @Override
    public void connect() {
        System.out.println("running a method");
    }

    @Override
    public void disconnect() {
        System.out.println("running a method");
    }

    @Override
    public void reset() {
        System.out.println("running a method");
    }
}
