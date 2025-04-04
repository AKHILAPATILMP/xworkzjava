package com.xworkz.isarelation.lens;
public class Lens {

    public Lens() {
        System.out.println("Lens constructor is running - parent class");
    }

    public void focus() {
        System.out.println("Lens is focusing manually - parent class");
    }

    public void capture() {
        System.out.println("Lens is capturing the image - parent class");
    }

    public void adjustAperture() {
        System.out.println("Adjusting aperture in Lens - parent class");
    }

    public void cleanLens() {
        System.out.println("Cleaning the Lens - parent class");
    }
}

