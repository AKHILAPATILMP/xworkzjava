package com.xworkz.isarelation.screen;

public class Screen {

    public Screen() {
        System.out.println("Screen constructor is running - parent class");
    }

    public void display() {
        System.out.println("Screen is displaying content - parent class");
    }

    public void turnOn() {
        System.out.println("Screen is turned on - parent class");
    }

    public void turnOff() {
        System.out.println("Screen is turned off - parent class");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting screen brightness - parent class");
    }
}
