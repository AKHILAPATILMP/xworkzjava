package com.xworkz.interfc.externali;

public interface Helicopter {
    void takeOff();
    void land();
    void fly();
    default void move (){
        System.out.println("move");
    }
}
