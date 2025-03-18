package com.xworkz.akhila.rocket;

public class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        Space space = new Space();
        space.enter(rocket);
    }
}
