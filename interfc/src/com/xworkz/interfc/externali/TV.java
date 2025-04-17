package com.xworkz.interfc.externali;

public interface TV {
    void powerOn();
    void powerOff();
    void changeChannel();
    default void television() {
        System.out.println("television");
    }
}
