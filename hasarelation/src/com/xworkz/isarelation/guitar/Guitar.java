package com.xworkz.isarelation.guitar;
public class Guitar {

    public Guitar() {
        System.out.println("Guitar constructor is running - parent class");
    }

    public void play() {
        System.out.println("Playing an acoustic guitar - parent class");
    }

    public void tune() {
        System.out.println("Tuning the guitar strings - parent class");
    }

    public void clean() {
        System.out.println("Cleaning the guitar - parent class");
    }

    public void displayType() {
        System.out.println("This is a classical acoustic guitar - parent class");
    }
}
