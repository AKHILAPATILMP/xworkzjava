package com.xworkz.interfc.externali;

public interface SmartBulb {
    void turnOn();
    void turnOff();
    void changeColor();
    default void smart() {
        System.out.println("smart");
    }
}
