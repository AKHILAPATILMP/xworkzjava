package com.xworkz.interfc.externali;

public interface Scooter {
    void start();

    void startEngine();
    void accelerate();
    void stop();
    default void scooty() {
        System.out.println("scooty");
    }
}
