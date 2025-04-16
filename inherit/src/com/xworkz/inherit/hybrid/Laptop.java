package com.xworkz.inherit.hybrid;

public class Laptop extends Computer implements SmartDevice {
    public void code() {
        System.out.println("Laptop is used for coding.");
    }

    public void connectToInternet() {
        System.out.println("Laptop connected to Internet.");
    }
}
