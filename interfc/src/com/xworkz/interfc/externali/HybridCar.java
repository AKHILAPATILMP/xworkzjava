package com.xworkz.interfc.externali;

public interface HybridCar {
    void charge();
    void switchModes();
    void drive();
    default void hybrid(){
        System.out.println("hybrid car");
    }
}
