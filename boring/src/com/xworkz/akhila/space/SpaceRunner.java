package com.xworkz.akhila.space;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        Space space = new Space();
        space.hold(planet);
    }
}
