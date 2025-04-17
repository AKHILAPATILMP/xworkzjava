package com.xworkz.interfc.externali;

public interface LampPost {
    void turnOn();

    void turnOff();

    void adjustHeight();

    default void post() {
        System.out.println("lamp post");
    }
}