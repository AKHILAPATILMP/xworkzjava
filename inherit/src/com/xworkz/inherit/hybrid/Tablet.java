package com.xworkz.inherit.hybrid;

public class Tablet implements SmartDevice {
    public void draw() {
        System.out.println("Tablet is used for drawing.");
    }

    public void connectToInternet() {
        System.out.println("Tablet connected to Internet.");
    }
}
