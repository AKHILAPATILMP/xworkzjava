package com.xworkz.interfc.externali;

public interface Airplane {
    void takeOff();
    void land();
    void fly();
    default void landon(){
        System.out.println("landing the airplane");
    }
}
