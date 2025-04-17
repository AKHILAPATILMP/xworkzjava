package com.xworkz.interfc.externali;

public interface Fan {
    void turnOn();
    void turnOff();
    void adjustSpeed();
    default void regulator(){
        System.out.println("regulator is on");
    }
}


