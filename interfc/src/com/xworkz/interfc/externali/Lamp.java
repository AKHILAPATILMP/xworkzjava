package com.xworkz.interfc.externali;

public interface Lamp {
    void turnOn();

    void turnOff();

    void adjustBrightness();

    default void light() {
        System.out.println("lamp light");
    }
}