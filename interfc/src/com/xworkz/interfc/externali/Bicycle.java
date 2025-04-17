package com.xworkz.interfc.externali;

public interface Bicycle {
    void pedal();
    void brake();
    void ringBell();
    default void ride(){
        System.out.println("ride the bicycle");
    }
}
