package com.xworkz.isarelation.drum;

public class Drum {

    public Drum() {
        System.out.println("Drum constructor is running - parent class");
    }

    public void hit() {
        System.out.println("Drum is being hit with sticks - parent class");
    }

    public void adjustVolume() {
        System.out.println("Adjusting drum volume manually - parent class");
    }

    public void playRhythm() {
        System.out.println("Playing basic rhythm - parent class");
    }

    public void changeDrumHead() {
        System.out.println("Changing drum head - parent class");
    }

    public void cleanDrum() {
        System.out.println("Cleaning the drum - parent class");
    }
}
