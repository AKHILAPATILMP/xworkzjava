package com.xworkz.isarelation.lens;

public class Lens {

    public Lens() {
        System.out.println("Lens constructor is running - parent class");
    }

    public void focus() {
        System.out.println("Focusing the lens - parent class");
    }

    public void zoom() {
        System.out.println("Zooming with manual control - parent class");
    }

    public void clean() {
        System.out.println("Cleaning the lens surface - parent class");
    }

    public void store() {
        System.out.println("Storing the lens in a case - parent class");
    }

    public void adjust() {
        System.out.println("Adjusting lens position - parent class");
    }
}
