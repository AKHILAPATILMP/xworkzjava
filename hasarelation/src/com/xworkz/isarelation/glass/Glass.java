package com.xworkz.isarelation.glass;

public class Glass {

    public Glass() {
        System.out.println("Glass constructor is running - parent class");
    }

    public void fill() {
        System.out.println("Filling water in the glass - parent class");
    }

    public void drink() {
        System.out.println("Drinking from the glass - parent class");
    }

    public void clean() {
        System.out.println("Cleaning the glass - parent class");
    }

    public void displayMaterial() {
        System.out.println("Glass is made of transparent material - parent class");
    }
}
