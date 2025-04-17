package com.xworkz.interfc.externali;

public interface MotionSensor {
    void detectMotion();

    void alert();

    void adjustSensitivity();

    default void sense() {
        System.out.println("sense");
    }
}