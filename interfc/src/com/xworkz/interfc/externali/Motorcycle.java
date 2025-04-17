package com.xworkz.interfc.externali;

public interface Motorcycle {
    void startEngine();

    void accelerate();

    void brake();

    default void cyc() {
        System.out.println("cyclee");
    }
}