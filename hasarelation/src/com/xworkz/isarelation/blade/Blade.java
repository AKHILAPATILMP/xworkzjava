package com.xworkz.isarelation.blade;

public class Blade {

    public Blade() {
        System.out.println("Blade constructor is running - parent class");
    }

    public void rotate() {
        System.out.println("Blade is rotating - parent class");
    }

    public void sharpen() {
        System.out.println("Blade is sharpening - parent class");
    }

    public void stop() {
        System.out.println("Blade is stopping - parent class");
    }

    public void clean() {
        System.out.println("Cleaning the blade - parent class");
    }

    public void polish() {
        System.out.println("Polishing the blade - parent class");
    }
}
