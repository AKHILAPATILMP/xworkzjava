package com.xworkz.interfc.externali;

public interface MotorcycleHelmet {
    void protectHead();

    void adjustStrap();

    void remove();

    default void helmet() {
        System.out.println("helmet");
    }
}